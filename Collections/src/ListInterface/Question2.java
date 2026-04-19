package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
       int k=2;
       for(int i=0;i<k;i++){
           int first = list.get(0);
           list.remove(0);
           list.add(first);
       }
        System.out.println(list);
    }
}
