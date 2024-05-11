package org.proxy;

import org.proxy.service.IFileService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proxy Design Pattern");
        System.out.println("------------------------");

        FileServiceFactory factory = new FileServiceFactory();
        IFileService fileService1 = factory.getFileService("secret-access-key");
        IFileService fileService2 = factory.getFileService("unauthorized-secret-access-key");

        fileService1.read("example.txt");
        fileService2.read("example.txt");
    }
}