package ListInterface;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7);
        List<Integer> reversed = new ArrayList<>();

        for(int i=list.size()-1;i>=0;i--){
            reversed.add(list.get(i));
        }
        System.out.println(reversed);
    }
}
