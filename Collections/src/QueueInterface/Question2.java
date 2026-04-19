package QueueInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Question2 {
    public static void main(String[] args) {
        int n=5;
        Queue<String> q = new LinkedList<>();
        List<String> result = new ArrayList<>();

        q.add("1");
        for(int i=0;i<n;i++){
            String c = q.remove();
            result.add(c);
            q.add(c + "0");
            q.add(c + "1");
        }
        System.out.println(result);
    }
}
