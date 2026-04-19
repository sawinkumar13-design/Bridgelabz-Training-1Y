package Generics.Question6;

import java.util.Arrays;
import java.util.List;

public class Numeric {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Double> l2 = Arrays.asList(1.3,56.6,76.4);

        System.out.println(sumNumbers(l1));
        System.out.println(sumNumbers(l2));
    }
}
