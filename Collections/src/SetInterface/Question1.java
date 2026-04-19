package SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3,2,1));
        if (s1.equals(s2)){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
