package src.InterfaceAndAbctract;

public class InterfaceAndAbstract extends myAbstract implements printerInterface {
    String message;

    @Override
    public void scanMessage() {
        System.out.println("Scanning......");
    }

    @Override
    public void printMessage() {
        System.out.println(message);
    }

    @Override
    public void getMessage(String message) {
        this.message = message;
    }

    public static void main(String[] agrs){
        InterfaceAndAbstract p = new InterfaceAndAbstract();
        p.getMessage("hello");
        p.scanMessage();
        p.printMessage();
        p.sayHello();
        System.out.println(printerInterface.producer());
    }
}
