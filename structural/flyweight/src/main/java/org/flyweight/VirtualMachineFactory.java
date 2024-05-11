package org.flyweight;

import org.flyweight.service.SharedVirtualMachineConfig;
import org.flyweight.service.UniqueVirtualMachineConfig;
import org.flyweight.service.VirtualMachineConfig;

import java.util.HashMap;
import java.util.Map;

public class VirtualMachineFactory {
    private final Map<String, SharedVirtualMachineConfig> configs;

    public VirtualMachineFactory() {
        configs = new HashMap<>();
    }

    private SharedVirtualMachineConfig getSharedConfig(String os, int diskSize) {
        String key = os + "_" + diskSize;
        SharedVirtualMachineConfig sharedConfig = configs.get(key);
        if (sharedConfig == null) {
            sharedConfig = new SharedVirtualMachineConfig(os, diskSize);
            configs.put(key, sharedConfig);
        }
        return sharedConfig;
    }

    public VirtualMachineConfig getVirtualMachine(String os, int diskSize, String name) {
        SharedVirtualMachineConfig sharedConfig = getSharedConfig(os, diskSize);
        return new UniqueVirtualMachineConfig(name, sharedConfig);
    }
}
