package src.NewFeatures.TextBlocks;

public class TextBlocks {
    public static String multiLineStringOld(){
        return "this is a old\n" +
                "multiline string\n" +
                "with new lines\n";
    }

    public static String multiLineStringNew(){
        return """
                This is a new
                multiline string
                with new lines
                """;
    }

    public static String multiLineStringWithFormat(String name){
        return """
                Hello, %s!
                This is s multiline string
                with name formatted
                """.formatted(name);
    }

    public static String multiLineSQL() {
        return """
                select * from employee
                where first_name = 'Mahesh'
                and last_name = 'Singh'
                """;
    }

    public static String multiLineJSON(){
        return """
                "orderId" : 12345
                "status" : "DELIVERED"
                "charges" : 100.00
                """;
    }

    public static void main(String[] args){
        System.out.println(multiLineStringOld());
        System.out.println(multiLineStringNew());
        System.out.println(multiLineStringWithFormat("Mahesh"));
        System.out.println(multiLineSQL());
        System.out.println(multiLineJSON());
    }
}
