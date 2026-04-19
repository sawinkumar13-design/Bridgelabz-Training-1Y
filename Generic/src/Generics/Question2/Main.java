package Generics.Question2;

public class Main {
    public static void main(String[] args) {
        Pair<String,Integer> student = new Pair<>("sawin",56);
        System.out.println(student.getFirst());
        System.out.println(student.getSecond());
    }
}
