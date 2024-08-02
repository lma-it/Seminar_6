package srp2.model;


public class Order {
    private String clientName;
    private String product;
    private int quantity;
    private int price;

    protected Order() {
    }

    public static OrderBuilber builber(){
        return new OrderBuilber();
    }

    /**
     * Вложенный класс {@code OrderBuilder} для создания объекта Order скрыв его реализиацию от конченого
     * пользователя.
     */
    public static class OrderBuilber {

        private final Order order;

        private OrderBuilber() {
            this.order = new Order();
        }

        public OrderBuilber andClientName(String cilentName){
            order.clientName = cilentName;
            return this;
        }

        public OrderBuilber andProduct(String product){
            order.product = product;
            return this;
        }

        public OrderBuilber andQuantity(int quantity){
            order.quantity = quantity;
            return this;
        }

        public OrderBuilber andPrice(int price){
            order.price = price;
            return this;
        }

        public Order build(){
            return order;
        }

    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
