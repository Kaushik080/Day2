import enums.OrderStatus;

public class Order {
    int orderID;
    OrderStatus status;

    public Order() {
    }

    public Order(int orderID, OrderStatus status) {
        this.orderID = orderID;
        this.status = status;
    }

    public void printStatus(){
        System.out.println("Order Id: " + orderID + " status: " + status);
    }
}
