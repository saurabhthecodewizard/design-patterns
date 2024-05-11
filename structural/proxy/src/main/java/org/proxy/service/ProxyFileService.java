package org.proxy.service;

import java.util.Objects;

public class ProxyFileService implements IFileService {
    private RemoteFileService remoteFileService;
    private final String accessKey;
    private final static String ACCESS_KEY = "secret-access-key";

    public ProxyFileService(String accessKey) {
        this.accessKey = accessKey;
    }

    public boolean isValid() {
        return Objects.equals(this.accessKey, ACCESS_KEY);
    }

    @Override
    public void read(String fileName) {
        if (isValid()) {
            if (remoteFileService == null) {
                remoteFileService = new RemoteFileService();
            }
            remoteFileService.read(fileName);
            return;
        }
        System.out.println("Access denied for file: " + fileName);
    }
}
