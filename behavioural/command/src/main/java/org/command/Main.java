package org.command;

import org.command.dto.ExportDTO;
import org.command.dto.ImportDTO;
import org.command.dto.NotificationDTO;
import org.command.service.AsyncProcessor;
import org.command.service.BulkOperationRunner;
import org.command.service.DataService;
import org.command.service.NotificationService;
import org.command.service.bulk.BulkOperation;
import org.command.service.bulk.ExportDataOperation;
import org.command.service.bulk.ImportDataOperation;
import org.command.service.bulk.SendNotificationOperation;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Command Design Pattern");
        System.out.println("--------------------------");

        runAsyncProcessor();
    }

    private static void runBulkOperationRunner() throws InterruptedException {
        BulkOperationRunner runner = getRunner();

        Thread.sleep(1500);
        runner.shutdown();
    }

    private static void runAsyncProcessor() throws InterruptedException {
        AsyncProcessor processor = getProcessor();
        processor.process();

        Thread.sleep(1500);
        processor.shutdown();
    }

    private static AsyncProcessor getProcessor() {
        DataService dataService = new DataService();
        NotificationService notificationService = new NotificationService();

        BulkOperation importData = new ImportDataOperation(getImportDTO(), dataService);
        BulkOperation exportData = new ExportDataOperation(getExportDTO(), dataService);
        BulkOperation sendNotifications = new SendNotificationOperation(getNotificationDTO(), notificationService);

        AsyncProcessor processor = new AsyncProcessor();
        processor.add(importData);
        processor.add(exportData);
        processor.add(sendNotifications);

        return processor;
    }

    private static BulkOperationRunner getRunner() {
        DataService dataService = new DataService();
        NotificationService notificationService = new NotificationService();

        BulkOperation importData = new ImportDataOperation(getImportDTO(), dataService);
        BulkOperation exportData = new ExportDataOperation(getExportDTO(), dataService);
        BulkOperation sendNotifications = new SendNotificationOperation(getNotificationDTO(), notificationService);

        BulkOperationRunner runner = BulkOperationRunner.getInstance();

        runner.add(importData);
        runner.add(exportData);
        runner.add(sendNotifications);

        return runner;
    }

    private static ImportDTO getImportDTO() {
        return new ImportDTO(
                "database1",
                "/path/to/source/file.csv",
                "CSV",
                "gzip"
        );
    }

    private static ExportDTO getExportDTO() {
        return new ExportDTO(
                "database2",
                "/path/to/destination/file.csv",
                "CSV",
                true
        );
    }

    private static NotificationDTO getNotificationDTO() {
        return new NotificationDTO(Arrays.asList("user1@example.com", "user2@example.com"));
    }
}