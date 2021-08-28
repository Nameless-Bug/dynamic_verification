import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Optional;


public class DynamicVerification {

    public static boolean check(Object objAttr, Object rule, Compare c) throws ClassCastException{
        return c.compare(objAttr, rule);
    }

    public static Optional<Object> execute(Object obj, String jsonRuleFile) throws
            IOException, NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        String jsonRuleString = MyUtils.readJsonFile(jsonRuleFile);
        VerificationRule vr = MyUtils.ruleString2RuleObj(jsonRuleString);

        Class<?> cls = obj.getClass();

        Field field = cls.getDeclaredField(vr.attribute);
        field.setAccessible(true);
        if (DynamicVerification.check(field.get(obj),
                vr.rule,
                OperationType.OPERATIONMAP.get(vr.operator.toUpperCase()))) {
            if(Optional.ofNullable(vr.param).isPresent()){
                Class<?> []argsCls = new Class[vr.param.length];
                for(int i = 0; i < vr.param.length; i++){
                    argsCls[i] = vr.param[i].getClass();
                }
                Method m = cls.getDeclaredMethod(vr.action, argsCls);
                m.setAccessible(true);
                return Optional.ofNullable(m.invoke(obj, vr.param));
            }else{
                Method m = cls.getDeclaredMethod(vr.action);
                m.setAccessible(true);
                return Optional.ofNullable(m.invoke(obj));
            }
        }
        return Optional.empty();
    }
}
