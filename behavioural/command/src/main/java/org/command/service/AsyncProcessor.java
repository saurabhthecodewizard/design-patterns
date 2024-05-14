package org.command.service;

import org.command.service.bulk.BulkOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

public class AsyncProcessor {
    private final List<BulkOperation> operations = new ArrayList<>();
    private final ExecutorService executor = Executors.newFixedThreadPool(10);
    private final Logger logger = Logger.getLogger(AsyncProcessor.class.getName());

    public void add(BulkOperation operation) {
        operations.add(operation);
    }

    public void process() {
        for (BulkOperation operation : operations) {
            executor.submit(() -> {
                try {
                    operation.execute();
                    logger.info("Operation executed successfully: " + operation.getClass().getName());
                } catch (Exception e) {
                    logger.severe("Operation execution failed: " + operation.getClass().getName() + " - " + e.getMessage());
                }
            });
        }
    }

    public void shutdown() {
        System.out.println("Processor shutting down");
        executor.shutdown();
    }
}
