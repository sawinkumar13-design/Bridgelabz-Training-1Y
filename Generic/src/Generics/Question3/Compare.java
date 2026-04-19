package Generics.Question3;

public class Compare {
    public static <T> boolean isEqual(T a, T b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        System.out.println(isEqual("hii","hii"));
        System.out.println(isEqual(122,34));
    }
}
