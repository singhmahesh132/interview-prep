package src.SingletonPractice;

public class EarlyInitializationSingleton {

    //The easiest way to achieve thread safety is to inline the object creation or to use an equivalent static block.
    //This takes advantage of the fact that static fields and blocks are initialized one after another

    private EarlyInitializationSingleton() {

    }

    private static final EarlyInitializationSingleton singletonObj = new EarlyInitializationSingleton();

    public static EarlyInitializationSingleton getInstance(){
        System.out.println("in getInstance()");
        return singletonObj;
    }

    public static void main(String[] args){
        System.out.println("Starting main");
        EarlyInitializationSingleton singleton = EarlyInitializationSingleton.getInstance();
    }
}
