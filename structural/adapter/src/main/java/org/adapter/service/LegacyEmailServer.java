package org.adapter.service;

public class LegacyEmailServer {
    public byte[] sendEmail(byte[] emailData) {
        // Logic to communicate with the legacy email server and receive response
        // For simplicity, we return a dummy response
        return new byte[]{0x01, 0x02, 0x03};
    }
}
