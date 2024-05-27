package dip1.model;

import dip1.model.util.Reportable;

import java.util.List;

public class ReportManager implements Reportable{
   Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void output(List<ReportItem> reportItems){
        reportable.output(reportItems);
    }
}
