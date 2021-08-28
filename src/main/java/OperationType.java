import java.util.HashMap;
import java.util.Map;


public final class OperationType {
    public static final Map<String, Compare> OPERATIONMAP = new HashMap<String, Compare>();

    static{
        OPERATIONMAP.put("GT", StaticOperator.GT);
        OPERATIONMAP.put("LT", StaticOperator.LT);
        OPERATIONMAP.put("EQ", StaticOperator.EQ);

        OPERATIONMAP.put("STRCONTAINS", StaticOperator.STRCONTAINS);
        OPERATIONMAP.put("STARTSWITH", StaticOperator.STARTSWITH);
        OPERATIONMAP.put("ENDSWITH", StaticOperator.ENDSWITH);

        OPERATIONMAP.put("LISTCONTAINS", StaticOperator.LISTCONTAINS);
        OPERATIONMAP.put("SETCONTAINS", StaticOperator.SETCONTAINS);
        OPERATIONMAP.put("MAPCONTAINSKEY", StaticOperator.MAPCONTAINSKEY);
        OPERATIONMAP.put("MAPCONTAINSVALUE", StaticOperator.MAPCONTAINSVALUE);
    }
}
