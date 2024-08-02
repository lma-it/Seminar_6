package lsp1.shape;

public class Square implements Quadrilateral {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(getSide(), 2);
    }

}
