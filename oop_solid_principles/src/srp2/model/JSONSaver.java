package srp2.model;
import java.io.FileWriter;
import java.io.IOException;

public class JSONSaver{

    private Order order;

    public JSONSaver(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ this.order.getClientName() + "\",\n");
            writer.write("\"product\":\""+ this.order.getProduct() +"\",\n");
            writer.write("\"qnt\":"+ this.order.getQuantity() +",\n");
            writer.write("\"price\":"+ this.order.getPrice() +"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
