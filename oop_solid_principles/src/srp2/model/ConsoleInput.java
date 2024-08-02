package srp2.model;
import java.util.Scanner;

public class ConsoleInput {
    Scanner in = new Scanner(System.in);
    
    public Order inputFromConsole(){
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int quantity = Integer.parseInt(prompt("Quantity: "));
        int price = Integer.parseInt(prompt("Price: "));
        return Order.builber()
                    .andClientName(clientName)
                    .andProduct(product)
                    .andQuantity(quantity)
                    .andPrice(price)
                    .build();
    }

    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }
}
