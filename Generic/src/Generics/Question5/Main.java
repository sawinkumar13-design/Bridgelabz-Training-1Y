package Generics.Question5;

public class Main {
    public static void main(String[] args) {
        FruitBox<Fruits.Apple> appleBox = new FruitBox<>();
        appleBox.add(new Fruits.Apple());

        FruitBox<Fruits.Mango> mangoBox = new FruitBox<>();
        mangoBox.add(new Fruits.Mango());

        appleBox.display();
        mangoBox.display();
    }
}
