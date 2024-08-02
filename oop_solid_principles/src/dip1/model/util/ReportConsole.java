package dip1.model.util;

import java.util.List;

import dip1.model.ReportItem;

public class ReportConsole implements PrintOutable{

    @Override
    public void output(List<ReportItem> items) {
        System.out.println("Вывожу в консоль.");
        for (ReportItem item : items) {
            System.out.format("printer %s - %f \n\r", item.getDescription(), item.getAmount());
        }
    }
    
}
