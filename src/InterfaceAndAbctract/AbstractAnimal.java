package src.InterfaceAndAbctract;

public abstract class AbstractAnimal {

    public abstract void sound();

    void groom(){
        System.out.println("Animal.groom");
    }

    static void play(){
        System.out.println("Animal.play");
    }

    public void myAnimal(){
        System.out.println("Animal.myAnimal");
    }
}
