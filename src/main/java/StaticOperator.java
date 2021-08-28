import java.util.List;
import java.util.Map;
import java.util.Set;


public class StaticOperator {
    public static final Compare GT = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof Number;
        assert requirement instanceof Number;
        return ((Number) objAttr).doubleValue() > ((Number) requirement).doubleValue();
    };

    public static final Compare LT = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof Number;
        assert requirement instanceof Number;
        return ((Number) objAttr).doubleValue() < ((Number) requirement).doubleValue();
    };

    public static final Compare EQ = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof Number;
        assert requirement instanceof Number;
        return ((Number) objAttr).doubleValue() == ((Number) requirement).doubleValue();
    };

    public static final Compare STRCONTAINS = (Object objAttr, Object requirement) -> objAttr.toString().contains(requirement.toString());

    public static final Compare STARTSWITH = (Object objAttr, Object requirement) -> objAttr.toString().startsWith(requirement.toString());

    public static final Compare ENDSWITH = (Object objAttr, Object requirement) -> objAttr.toString().endsWith(requirement.toString());

    public static final Compare STREQUALS = (Object objAttr, Object requirement) -> objAttr.toString().equals(requirement.toString());

    public static final Compare STREQUALSIC = (Object objAttr, Object requirement) -> objAttr.toString().equalsIgnoreCase(requirement.toString());

    public static final Compare LISTCONTAINS = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof List;
        return ((List<?>) objAttr).contains(requirement);
    };

    public static final Compare SETCONTAINS = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof Set;
        return ((Set<?>) objAttr).contains(requirement);
    };

    public static final Compare MAPCONTAINSKEY = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof Map;
        return ((Map<?, ?>) objAttr).containsKey(requirement);
    };

    public static final Compare MAPCONTAINSVALUE = (Object objAttr, Object requirement) -> {
        assert objAttr instanceof Map;
        return ((Map<?, ?>) objAttr).containsValue(requirement);
    };
    
}
