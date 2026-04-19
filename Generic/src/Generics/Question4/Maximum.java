package Generics.Question4;

import Generics.Question3.Compare;

public class Maximum {
    public static <T extends Comparable<T>>T maximum(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0) max = y;
        if(z.compareTo(max) > 0) max = z;
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maximum("s","m","d"));
        System.out.println(maximum(45,77,33));
    }
}
