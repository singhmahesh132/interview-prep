package src.SingletonPractice;

public class DoubleCheckLockingSingleton {

    //This is called double-check locking
    //It will solve multiThreading issue, when two thread simultaneously try tp create Singleton Object

    private static final Object myObj = new Object();
    private static DoubleCheckLockingSingleton singletonInstance;

    private DoubleCheckLockingSingleton() {

    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (singletonInstance == null) {
            synchronized (myObj) {
                if (singletonInstance == null)
                    singletonInstance = new DoubleCheckLockingSingleton();
            }
        }
        return singletonInstance;
    }

    //Even though the double-checked locking can potentially speed things up, it has at least two issues:
    //since it requires the volatile keyword to work properly, it’s not compatible with Java 1.4 and lower versions
    //it’s quite verbose, and it makes the code difficult to read
    //thus we use alternatives, like 1) EarlyInitialization 2)onDemand initialization  3)enumSingleton
}
