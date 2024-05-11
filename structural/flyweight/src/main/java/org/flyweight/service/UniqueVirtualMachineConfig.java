package org.flyweight.service;

public class UniqueVirtualMachineConfig implements VirtualMachineConfig {
    private final String name;
    private final SharedVirtualMachineConfig sharedConfig;

    public UniqueVirtualMachineConfig(String name, SharedVirtualMachineConfig sharedConfig) {
        this.name = name;
        this.sharedConfig = sharedConfig;
    }

    @Override
    public void start() {
        System.out.print("Virtual Machine " + name + " - ");
        sharedConfig.start();
    }

    @Override
    public void stop() {
        System.out.print("Virtual Machine " + name + " - ");
        sharedConfig.stop();
    }
}
