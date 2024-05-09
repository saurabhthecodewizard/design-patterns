package org.adapter.service;

import java.util.Map;

public class EmailObjectAdapter implements EmailClient {
    private LegacyEmailServer legacyEmailServer;

    public EmailObjectAdapter(LegacyEmailServer legacyEmailServer) {
        this.legacyEmailServer = legacyEmailServer;
    }

    @Override
    public Map<String, String> sendEmail(Map<String, String> data) {

        // Convert JSON request to legacy required type
        byte[] request = convertRequest(data);

        // send data to server
        byte[] response = legacyEmailServer.sendEmail(request);

        // convert legacy response to JSON
        return convertResponse(response);
    }

    private Map<String, String> convertResponse(byte[] response) {
        // Convert legacy response to JSON format
        // For simplicity, let's assume response is directly converted to a Map
        return Map.of("response", new String(response));
    }

    private byte[] convertRequest(Map<String, String> request) {
        // Convert JSON type request to legacy format
        // For simplicity, let's assume request is directly used as is
        return request.toString().getBytes();
    }
}
