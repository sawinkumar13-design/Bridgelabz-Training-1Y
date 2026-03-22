package Multilevel_Inheritance.Question_1;

public class DeliveredOrder extends ShippedOrder{

    private String deliveryDate = "16/8/2026";

    public DeliveredOrder(String orderId, int orderDate) {
        super(orderId, orderDate);
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}
