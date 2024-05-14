package org.command.dto;

import java.util.List;

public class NotificationDTO {
    private List<String> recipients;

    public NotificationDTO(List<String> recipients) {
        this.recipients = recipients;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }
}
