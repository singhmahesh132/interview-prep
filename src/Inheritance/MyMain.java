package src.Inheritance;

public class MyMain {

    public void m1(Object o) {
        System.out.println("object");
    }
    public void m1(StringBuffer sb) {
        System.out.println("StringBuffer");
    }
    public void m1(String s) {
        System.out.println("string");
    }


    public static void main(String[] args){
        Parent p = new Parent();
        p.show();
        Child c = new Child();
        c.show();
        Parent p1 = new Child();
        p1.show();
        /*Child c1 = new Parent();
        c1.show();*/

        MyMain m = new MyMain();
        m.m1("null");
        //m.m1(null);
    }
}
