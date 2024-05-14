package org.command.service;

import org.command.service.bulk.BulkOperation;

import java.util.LinkedList;
import java.util.List;

public class BulkOperationRunner implements Runnable {

    private final Thread runner;

    private final List<BulkOperation> operations;

    private volatile boolean stop;

    private static final BulkOperationRunner RUNNER = new BulkOperationRunner();

    public static BulkOperationRunner getInstance() {
        return RUNNER;
    }

    private BulkOperationRunner() {
        operations = new LinkedList<>();
        runner = new Thread(this);
        runner.start();
    }

    //Run method takes pending commands and executes them.
    @Override
    public void run() {

        while (true) {
            BulkOperation operation = null;
            synchronized (operations) {
                if (operations.isEmpty()) {
                    try {
                        operations.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Runner interrupted");
                        if (stop) {
                            System.out.println("Runner stopping");
                            return;
                        }
                    }
                }
                operation = operations.isEmpty()?null:operations.remove(0);
            }
            if (operation == null)
                return;
            operation.execute();
        }

    }

    //Giving it a command will schedule it for later execution
    public void add(BulkOperation operation) {
        synchronized (operations) {
            operations.add(operation);
            operations.notifyAll();
        }
    }

    public void shutdown() {
        this.stop = true;
        this.runner.interrupt();
    }
}
