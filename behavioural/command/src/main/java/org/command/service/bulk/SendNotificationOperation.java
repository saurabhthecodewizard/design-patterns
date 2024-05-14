package org.command.service.bulk;

import org.command.dto.NotificationDTO;
import org.command.service.NotificationService;

public class SendNotificationOperation implements BulkOperation {
    private final NotificationDTO notificationDTO;
    private final NotificationService notificationService;

    public SendNotificationOperation(NotificationDTO notificationDTO, NotificationService notificationService) {
        this.notificationDTO = notificationDTO;
        this.notificationService = notificationService;
    }

    @Override
    public void execute() {
        notificationService.sendBulkNotifications(notificationDTO);
    }
}
