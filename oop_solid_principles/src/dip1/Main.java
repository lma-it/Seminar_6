package dip1;

import dip1.model.Report;
import dip1.model.ReportItem;
import dip1.model.util.ReportConsole;
import dip1.model.util.ReportPrinter;
import dip1.model.util.ReportService;
import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());
    public static void main(String[] args) {
        log.log(Level.INFO, "Method main in model package started");
        Report report = new Report(List.of(new ReportItem("Item 1", 12.5f), new ReportItem("Item 2", 45.8f)));
        new ReportService(report, new ReportConsole()).output();
        new ReportService(report, new ReportPrinter()).output();
    }
}
