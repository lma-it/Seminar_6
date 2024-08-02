package lsp1;

import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;
import lsp1.shape.Quadrilateral;

public class Main {
    public static void main(String[] args) {
        Quadrilateral rectangle = new Square(5);
        Quadrilateral rectangle2 = new Rectangle(5, 6);
        System.out.printf("In a quadrolateral area = %f\n", rectangle.getArea());
        ShapeView view = new ShapeView(rectangle);
        view.showArea();
        System.out.printf("In a quadrolateral area = %f\n", rectangle2.getArea());
        view = new ShapeView(rectangle2);
        view.showArea();
    }
}
