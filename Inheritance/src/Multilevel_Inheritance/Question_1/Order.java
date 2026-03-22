package Multilevel_Inheritance.Question_1;

public class Order {
    private String orderId;
    private int orderDate;

    public Order(String orderId ,int orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    public String getOrderId() {
        return orderId;
    }
    public int getOrderDate() {
        return orderDate;
    }
    public String  getOrderStatus(){
        return "Order placed";
    }
}
