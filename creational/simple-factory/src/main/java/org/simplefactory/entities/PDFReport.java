package org.simplefactory.entities;

public class PDFReport implements Report {
    @Override
    public void generateReport() {
        // logic to generate pdf
        System.out.println("Generating PDF report...");
    }
}
