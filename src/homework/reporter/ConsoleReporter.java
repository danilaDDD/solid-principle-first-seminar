package homework.reporter;

public class ConsoleReporter implements Reporter{
    @Override
    public void printReport(Reportable reportable) {
        System.out.println(reportable.getReportInfo());
    }
}
