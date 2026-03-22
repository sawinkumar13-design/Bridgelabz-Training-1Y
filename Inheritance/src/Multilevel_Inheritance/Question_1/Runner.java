package Multilevel_Inheritance.Question_1;

public class Runner {
    public static void main(String[] args) {
        Order o1 = new Order("op098",12/8/2026);
        ShippedOrder s1 = new ShippedOrder("op098",12/8/2026);
        DeliveredOrder d1 = new DeliveredOrder("op098",12/8/2026);

        System.out.println(o1.getOrderStatus());
        System.out.println(d1.getOrderStatus());
        System.out.println(s1.getOrderStatus());
    }
}
