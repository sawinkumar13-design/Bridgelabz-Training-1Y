package QueueInterface;

import java.util.PriorityQueue;

public class Question3 {
    String name;
    int severity;

    Question3(String name, int severity) {
        this.name = name;
        this.severity = severity;
        class HospitalTriage {
         public static void main(String[] args) {
                PriorityQueue<Question3> pq = new PriorityQueue<>((a, b) -> b.severity - a.severity);
                pq.add(new Question3("rahul", 3));
                pq.add(new Question3("ram", 5));
                pq.add(new Question3("shyam", 2));
                while (!pq.isEmpty()) {
                    System.out.println(pq.poll().name);
                }
            }
        }
    }
}