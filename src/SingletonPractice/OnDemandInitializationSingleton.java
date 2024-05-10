package src.SingletonPractice;

public class OnDemandInitializationSingleton {

    //since we know from the Java Language Specification reference that a class initialization occurs the first time we use one of its methods or fields,
    // we can use a nested static class to implement lazy initialization
    private OnDemandInitializationSingleton() {

    }
    private static final class SingletonInstanceHolder {
        private static final OnDemandInitializationSingleton singletonInstance = new OnDemandInitializationSingleton();
    }

    public static OnDemandInitializationSingleton getInstance() {
        return SingletonInstanceHolder.singletonInstance;
    }
}
