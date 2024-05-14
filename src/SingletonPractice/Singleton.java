package src.SingletonPractice;

public final class Singleton {
    private static Singleton singletonInstance;
    private Singleton() {
        System.out.println("Object created");
    }

    public static Singleton getInstance() {
        if (singletonInstance == null) {
            System.out.println("Creating object");
            singletonInstance = new Singleton();
        }
        System.out.println("Returning object");
        return singletonInstance;
    }

    public static void main(String[] args){
        System.out.println("Starting main");
        Singleton singleton = Singleton.getInstance();
    }
    //Here singleton can break in two scenarios. using clone and in multithreading.
    //in multithreading, when two threads simultaneously try to create singleton object.
    //thus we use double-check locking method.
}
