package src.InterfaceAndAbctract;

public interface LivingThingInterface {
    String className = "LivingThing";

    void say();

    static void shout(){
        System.out.println("LivingThing.shout");
    }

    default void living(){
        System.out.println("LivingThing.living");
    }
}
