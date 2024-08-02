package dip1.model.util;

import dip1.model.ReportItem;
import java.util.List;

public interface PrintOutable {
    public void output(List<ReportItem> items);
}
