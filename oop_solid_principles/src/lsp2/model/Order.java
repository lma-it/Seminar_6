package lsp2.model;

public class Order implements Amount{
    private final int quantity;
    private final int price;
    
    public Order(int quantity, int price) {
        this.price = price;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return String.format("Quantity = %d, Price = %d", quantity, price);
    }

    @Override
    public double getAmount() {
        return this.quantity * this.price;
    }
}
