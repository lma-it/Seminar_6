package srp2.model;

public class OrderService{

    private Order order;

    public OrderService(Order order) {
        this.order = order;
    }

    public String getClientName() {
        return this.order.getClientName();
    }

    public double getPrice() {
        return order.getPrice();
    }

    public String getProduct() {
        return order.getProduct();
    }

    public int getQuantity() {
        return order.getQuantity();
    }

    public Order getOrder() {
        return order;
    }

}
