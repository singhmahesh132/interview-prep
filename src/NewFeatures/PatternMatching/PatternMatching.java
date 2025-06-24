package src.NewFeatures.PatternMatching;

public class PatternMatching {

    //Java 16 using instance of, here null cannot be handled
    public String printObjectTypeUsingInstanceOf(Object obj) {
        if(obj instanceof Integer)
            return "Integer : " + obj;
        if(obj instanceof String)
            return "String : " + obj;
        if(obj instanceof Double)
            return "Double: " + obj;
        return "Unknown type: " + obj.getClass().getName();
    }

    //Java 21 with pattern matching and enhanced switch
    public static void printObjectTypeUsingEnhancedSwitch(Object obj) {
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
        printObjectTypeUsingEnhancedSwitch("Hello");
        printObjectTypeUsingEnhancedSwitch(42);
        printObjectTypeUsingEnhancedSwitch(9);
        printObjectTypeUsingEnhancedSwitch(3.14);
        printObjectTypeUsingEnhancedSwitch(null);
        printObjectTypeUsingEnhancedSwitch(new Object());
    }
}
