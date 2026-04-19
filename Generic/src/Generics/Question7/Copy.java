package Generics.Question7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Copy{
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {
        List<Integer> src = Arrays.asList(1, 2, 3);
        List<Number> dest = new ArrayList<>();
        
        copyList(dest, src);
        System.out.println(dest);
    }
}
