package org.flyweight.service;

public class SharedVirtualMachineConfig implements VirtualMachineConfig {
    private final String os;
    private final int diskSize;

    public SharedVirtualMachineConfig(String os, int diskSize) {
        this.os = os;
        this.diskSize = diskSize;
    }

    @Override
    public void start() {
        System.out.println("Starting Virtual Machine with OS: " + os + ", Disk Size: " + diskSize + " GB");
        // Code to start the VM
    }

    @Override
    public void stop() {
        System.out.println("Stopping Virtual Machine with OS: " + os + ", Disk Size: " + diskSize + " GB");
        // Code to stop the VM
    }
}
