package src.InterfaceAndAbctract;

public class Dog extends AbstractAnimal implements LivingThingInterface {

    public void sound(){
        System.out.println("Dog.sound");
    }

    public void groom(){
        System.out.println("Dog.groom");
    }

    static void play(){
        System.out.println("Dog.play");
    }

    public void say(){
        System.out.println("Dog.say");
    }

    static void shout(){
        System.out.println("Dog.shout");
    }

    public void living(){
        System.out.println("Dog.living");
    }

    public void myDog(){
        System.out.println("Dog.myDog");
    }

    // It is not possible to override a static method in Java, as they are bound to the class and not associated with an object.
    // They cannot be overridden because they do not act on a specific instance of an object.
    public static void main(String[] args){

        AbstractAnimal dog = new Dog();
        dog.sound();            //Dog.sound  //since object is of type Animal and Animal has sound() method, but object is created using new Dog(), so call will first check for method in Dog(overriding), and if not found in Dog then call Animal method.
        dog.groom();            //Dog.groom
        dog.play();             //Animal.play //Since play() is static method and object is of type Animal, thus Animal play() will be called
        dog.myAnimal();         //Animal.myAnimal //since object is of type Animal and Animal has myAnimal() method, but object is created using new Dog(), so call will first check for method in Dog(overriding), and if not found in Dog then call Animal method.
        //dog.myDog();          //ERROR: Since object is of type Animal and Animal does not have myDog() method. Alternative is to typecast dog object Animal type to Dog type
        //dog.say();            //ERROR: Since object is of type Animal and Animal does not have say() method. Alternative is to typecast dog object of Animal type to Dog type


        Dog dog1 = (Dog) dog;
        dog1.say();             //Dog.say
        dog1.myDog();           //Dog.myDog
        dog1.play();            //Dog.play  //Since play() is static method and object is of type Dog, thus Dog play() will be called
        dog1.groom();           //Dog.groom
        dog1.myAnimal();        //Animal.myAnimal //since object is of type Dog and Dog does not have myAnimal() method, but Dog is inherited from Animal, thus if Animal has myAnimal() method the it will be called.


        LivingThingInterface newDog = new Dog();
        newDog.say();           //Dog.say //since object is of type LivingThing and LivingThing has say() method, but object is created using new Dog(), so call will check for method in Dog(interface method body overriding)
        newDog.living();        //Dog.living //since object is of type LivingThing and LivingThing has living() method, but object is created using new Dog(), so call will first check for method in Dog(overriding), and if not found in Dog then call Animal method.
        //newDog.myDog();       //Since object is of type LivingThingInterface, and it does not has myDog() method thus gives error
        //newDog.play();        //Since object is of type LivingThingInterface, and it does not has play() method thus gives error
        //newDog.shout();
        /*ERROR: Since object is of type LivingThing, and it is an interface and created using new Dog(), and both have
         static method. thus compiler get confused and throws illegal static interface method call error. */

        Dog newDog1 = new Dog();
        newDog1.say();              //Dog.hello
        newDog1.shout();            //Dog.shout //since object is of type Dog thus, shout() of dog will be called
        newDog1.groom();            //Dog.groom
        newDog1.play();             //Dog.play
        newDog1.myAnimal();         //Animal.myAnimal //Inheritance
    }
}

