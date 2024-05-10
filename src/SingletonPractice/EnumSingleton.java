package src.SingletonPractice;

//this is considered to be the most concise and safe way to write a singleton

public enum EnumSingleton{
    SINGLETON_INSTANCE;
}


//An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
//To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
//Note that they should be in uppercase letters
//You can access enum constants with the dot syntax
//An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
//An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

    /*
    EnumSingleton obj = EnumSingleton.SINGLETON_INSTANCE;
    */
