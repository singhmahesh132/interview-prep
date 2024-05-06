package DesignPattern;

public class BuilderPattern {

    public static void main(String[] args){
        Product paint = new Product.ProductBuilder()
                .name("Asian Paint")
                .quantity(10)
                .value(10000)
                .build();
        System.out.println(paint);

        Product cement = new Product.ProductBuilder()
                .name("Abuja Cement")
                .quantity(100)
                .value(20000)
                .build();
        System.out.println(cement);

        //this below code will not work
        /*DesignPattern.Product putty = new DesignPattern.Product();
        putty.name = "JK Putty";
        putty.value = 100;
        putty.quantity = 5;
        System.out.println(putty);*/
    }
}
