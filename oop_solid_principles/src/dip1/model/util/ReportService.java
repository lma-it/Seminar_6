package dip1.model.util;

import dip1.model.Report;
import dip1.model.ReportItem;
import java.util.ArrayList;
import java.util.Arrays;

public class ReportService {
    private Report report;
    private PrintOutable printOutable;

    public ReportService(Report report, PrintOutable printOutable) {
        this.report = report;
        this.printOutable = printOutable;
    }
    // calculate report data
    public void calculate(){
        report.items =  new ArrayList<ReportItem>();
        report.items.add(new ReportItem("First", (float)5));
        report.items.add(new ReportItem("Second", (float)6));
    }

    public void output(){
        printOutable.output(report.items);
    }

    public void add(ReportItem... items){
        this.report.items.addAll(Arrays.asList(items));
    }
}
