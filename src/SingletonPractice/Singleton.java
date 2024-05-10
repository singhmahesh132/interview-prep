package src.SingletonPractice;

public final class Singleton {

    private Singleton() {

    }
    private static Singleton singletonInstance;
    public static Singleton getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }

    //Here singleton can break in two scenarios. using clone and in multithreading.
    //in multithreading, when two threads simultaneously try to create singleton object.
    //thus we use double-check locking method.
}
