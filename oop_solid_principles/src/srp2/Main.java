package srp2;

import srp2.model.ConsoleInput;
import srp2.model.JSONSaver;
import srp2.model.OrderService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter order:");
        new JSONSaver(new OrderService(new ConsoleInput().inputFromConsole()).getOrder()).saveToJson();
    }
}
