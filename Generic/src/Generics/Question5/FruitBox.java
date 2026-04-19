package Generics.Question5;

import java.util.ArrayList;
import java.util.List;

public class FruitBox <T extends Fruits>{
    private List<T> fruits = new ArrayList<>();
    public void add(T fruit) {
        fruits.add(fruit);
    }
    public void display() {
        for (T fruit : fruits) {
            System.out.println(fruit.name);
        }
    }
}
