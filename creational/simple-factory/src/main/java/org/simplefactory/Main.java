package org.simplefactory;

import org.simplefactory.entities.Report;

public class Main {
    public static void main(String[] args) {
        Report pdfReport = ReportFactory.createReport("PDF");
        Report csvReport = ReportFactory.createReport("CSV");
        Report jsonReport = ReportFactory.createReport("JSON");

        pdfReport.generateReport();
        csvReport.generateReport();
        jsonReport.generateReport();
    }
}