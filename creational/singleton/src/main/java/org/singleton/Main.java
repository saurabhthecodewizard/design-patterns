package org.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Singleton Design Pattern");
        System.out.println("--------------------------------");
        LoadBalancer loadBalancer = LoadBalancer.getInstance();

        loadBalancer.addServer("Server1");
        loadBalancer.addServer("Server2");
        loadBalancer.addServer("Server3");

        String server = loadBalancer.getServer();
        System.out.println("Selected server: " + server);

        System.out.println("Number of servers: " + loadBalancer.getServerCount());
    }
}