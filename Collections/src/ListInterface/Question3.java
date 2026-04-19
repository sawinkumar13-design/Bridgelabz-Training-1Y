package ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,6,5,6,5,2,3);
        List<Integer> result = new ArrayList<>();
        for(Integer i : list){
            if(!result.contains(i)){
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
