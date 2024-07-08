package src.Inheritance;

public class MyMain {

    public static void main(String[] args){
        Parent p = new Parent();
        p.show();
        Child c = new Child();
        c.show();
        Parent p1 = new Child();
        p1.show();
        /*Child c1 = new Parent();
        c1.show();*/
    }
}
