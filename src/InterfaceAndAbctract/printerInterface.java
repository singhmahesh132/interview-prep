package src.InterfaceAndAbctract;

public interface printerInterface {

    public void scanMessage();
    public void printMessage();

    //java 1.8 introduced default methods in interface,
    //why default, so that all the previous implementations that already have implemented this interface,
    // need not override new methods thus. else interface always had methods starting with public only
    default void hello(){
        System.out.println(" hello");
    }


    //The static method is available only through and inside an interface.
    // It can’t be overridden by an implementing class.
    //To call it outside the interface, the standard approach for static method call should be used:
    //printerInterface.producer()
    static String producer() {
        return "produced my Mahesh";
    }
}
