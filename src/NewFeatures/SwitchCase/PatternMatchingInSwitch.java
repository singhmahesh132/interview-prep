package src.NewFeatures.SwitchCase;

public class PatternMatchingInSwitch {

    public static void printObjectType(Object obj) {
        String type = switch (obj) {
            case String s -> "String: " + s;
            //case Integer i when i > 10 -> "Large Integer: " + i;
            case Integer i -> "Small Integer: " + i;
            case Double d -> "Double: " + d;
            case null -> "Null object";
            default -> "Unknown type: " + obj.getClass().getName();
        };
        System.out.println(type);
    }

    public static void main(String[] args) {
        printObjectType("Hello");
        printObjectType(42);
        printObjectType(9);
        printObjectType(3.14);
        printObjectType(null);
        printObjectType(new Object());
    }
}
