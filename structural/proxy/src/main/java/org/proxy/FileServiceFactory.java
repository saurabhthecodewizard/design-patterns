package org.proxy;

import org.proxy.service.IFileService;
import org.proxy.service.ProxyFileService;

public class FileServiceFactory {
    public IFileService getFileService(String accessKey) {
        return new ProxyFileService(accessKey);
    }
}
