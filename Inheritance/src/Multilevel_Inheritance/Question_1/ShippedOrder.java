package Multilevel_Inheritance.Question_1;

public class ShippedOrder extends Order{

    private long trackingNumber = 348947023;

    public ShippedOrder(String orderId, int orderDate) {
        super(orderId, orderDate);
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}
