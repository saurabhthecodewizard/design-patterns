package org.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
    private static volatile LoadBalancer instance; // volatile keyword ensures visibility of changes to other threads
    private final List<String> servers;
    private final Random random;

    private LoadBalancer() {
        servers = new ArrayList<>();
        random = new Random();
    }

    public static synchronized LoadBalancer getInstance() {
        if (instance == null) {
            instance = new LoadBalancer();
        }
        return instance;
    }

    public void addServer(String server) {
        servers.add(server);
    }

    public void removeServer(String server) {
        servers.add(server);
    }

    public String getServer() {
        if (servers.isEmpty()) {
            return null;
        }
        int randomServerIndex = random.nextInt(servers.size());
        return servers.get(randomServerIndex);
    }

    public Integer getServerCount() {
        return servers.size();
    }
}
