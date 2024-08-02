package srp1;

import srp1.figure.Square;

public class View{

    private Square square;

    public View(Square square) {
        this.square = square;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < square.getSide(); i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < square.getSide(); i++) {
            if (i < square.getSide() - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < square.getSide() - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
