package Generics.Question5;

public class Fruits {
    String name;

    Fruits(String name){
        this.name=name;
    }
    static class Apple extends Fruits{
        Apple(){
            super("Apple");
        }
    }
    static class Mango extends Fruits{
        Mango(){
            super("Mango");
        }
    }
}
