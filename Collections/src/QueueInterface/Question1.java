package QueueInterface;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Queue<Integer> q1= new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);

        List<Integer> temp = new ArrayList<>();
        while ((!q1.isEmpty())){
            temp.add(q1.remove());
        }
        for(int i=temp.size()-1;i>=0;i--){
            q1.add(temp.get(i));
        }
        System.out.println(q1);
    }
}
