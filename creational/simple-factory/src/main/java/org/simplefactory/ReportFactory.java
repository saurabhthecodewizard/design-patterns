package org.simplefactory;

import org.simplefactory.entities.CSVReport;
import org.simplefactory.entities.JSONReport;
import org.simplefactory.entities.PDFReport;
import org.simplefactory.entities.Report;

public class ReportFactory {
    public static Report createReport(String type) {
        switch (type) {
            case "PDF":
                return new PDFReport();
            case "CSV":
                return new CSVReport();
            case "JSON":
                return new JSONReport();
            default:
                throw new IllegalArgumentException("Invalid report type!");
        }
    }
}
