package org.adapter;

import org.adapter.service.EmailClassAdapter;
import org.adapter.service.EmailClient;
import org.adapter.service.EmailObjectAdapter;
import org.adapter.service.LegacyEmailServer;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adapter Design Pattern");
        System.out.println("-------------------------");

        LegacyEmailServer legacyEmailServer = new LegacyEmailServer();

        // JSON request from email client
        Map<String, String> emailData = Map.of(
                "to", "recipient@example.com",
                "subject", "Test Subject",
                "body", "This is a test email"
        );

        EmailClient emailClient = new EmailObjectAdapter(legacyEmailServer);

        System.out.println("Object Adapter:-");
        System.out.println(emailClient.sendEmail(emailData));

        System.out.println("-------------------------");

        emailClient = new EmailClassAdapter();

        System.out.println("Class Adapter:-");
        System.out.println(emailClient.sendEmail(emailData));
    }
}