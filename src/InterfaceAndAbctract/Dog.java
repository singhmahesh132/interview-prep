package src.InterfaceAndAbctract;

public class Dog extends Animal{

    public void sound(){
        System.out.println("Bark");
    }

    public static void main(String[] args){
        Animal dog = new Dog();
        dog.sound();
    }
}

