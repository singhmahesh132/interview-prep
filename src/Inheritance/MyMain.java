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
        p.show();                   //Parent show, since obj is of type parent and method is static.
        p.talk();                   //Parent talk, since obj and reference are of parent

        Child c = new Child();
        c.show();                   //Child show, since obj is of type child and method is static.
        c.talk();                   //Child talk, due to inheritance child class talk will be called. If not in child then parent

        Parent p1 = new Child();
        p1.show();                  //parent show, since obj is of type parent and method is static
        p1.talk();                  //Child talk, due to inheritance child class talk will be called. If not in child then parent

        /*Child c1 = (Child) new Parent();  //Will Give error since parent cannot be assigned to child obj;
        c1.show();*/

        MyMain m = new MyMain();
        m.m1("null");                   //Considers String
        //m.m1(null);                      //Ambiguity error. both String and StringBuffer match.
    }
}
