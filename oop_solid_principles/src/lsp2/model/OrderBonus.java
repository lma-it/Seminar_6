package lsp2.model;

public class OrderBonus extends Order{

    public OrderBonus(int quantity, int price) {
        super(quantity, price);
    }


    @Override
    public double getAmount() {
        return super.getAmount() * 0.9;
    }
}
