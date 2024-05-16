package org.interpreter.entities;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Discount {
    private final Map<String, String> values;
    private final Logger logger = Logger.getLogger(Discount.class.getName());

    public Discount() {
        this.values = new HashMap<>();
    }

    public void add(String key, String value) {
        if (this.values.containsKey(key)) {
            logger.info("Value updated for key: " + key);
        }
        this.values.put(key, value);
    }

    public String get(String key) {
        return this.values.get(key);
    }
}
