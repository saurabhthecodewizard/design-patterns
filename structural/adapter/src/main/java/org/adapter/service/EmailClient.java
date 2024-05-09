package org.adapter.service;

import java.util.Map;

public interface EmailClient {
    Map<String, String> sendEmail(Map<String, String> data);
}
