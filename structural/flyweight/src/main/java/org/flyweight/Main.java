package org.flyweight;

import org.flyweight.service.VirtualMachineConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println("Flyweight Design Pattern");
        System.out.println("----------------------------");
        VirtualMachineFactory factory = new VirtualMachineFactory();
        VirtualMachineConfig config1 = factory.getVirtualMachine("linux", 20, "VM1");
        config1.start();
        VirtualMachineConfig config2 = factory.getVirtualMachine("windows", 50, "VM2");
        config2.start();

        config1.stop();
        config2.stop();
    }
}