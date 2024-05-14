package src.SingletonPractice;

public class OnDemandInitializationSingleton {
    //since we know from the Java Language Specification reference that a class initialization occurs the first time we use one of its methods or fields,
    //we can use a nested static class to implement lazy initialization
    private OnDemandInitializationSingleton() {
        System.out.println("creating singleton instance.....");
    }

    private static final class SingletonInstanceHolder {
        private SingletonInstanceHolder() {
            System.out.println("in SingletonInstanceHolder constructor");
        }
        private static final OnDemandInitializationSingleton singletonInstance = new OnDemandInitializationSingleton();
    }

    public static OnDemandInitializationSingleton getInstance() {
        System.out.println("in getInstance");
        return SingletonInstanceHolder.singletonInstance;
    }

    public static void main(String[] args){
        System.out.println("Starting main");
        OnDemandInitializationSingleton singleton = OnDemandInitializationSingleton.getInstance();
    }
}
