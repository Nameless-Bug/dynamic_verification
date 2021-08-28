import Beans.Student;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class DynamicVerificationTest {
    public static void main(String[] args) throws IllegalAccessException, IOException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Student s = new Student("Nameless", 16);
        s.addCertificate("driver license");
        Optional optional = DynamicVerification.execute(s,"src/main/resources/verification_rule.json");
    }
}
