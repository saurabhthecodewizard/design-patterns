package org.proxy.service;

public class RemoteFileService implements IFileService {
    @Override
    public void read(String fileName) {
        // logic to read file
        System.out.println("Reading File: " + fileName);
    }
}
