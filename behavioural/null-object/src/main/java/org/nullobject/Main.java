package org.nullobject;

import org.nullobject.service.ComplexService;
import org.nullobject.service.NullStorageService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Null Object Design Pattern");
        System.out.println("----------------------------");

        ComplexService service = new ComplexService("Simple report 2", new NullStorageService());
        service.generateReport();
    }
}