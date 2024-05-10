package org.decorator.service;

public class BasicTextProcessor implements TextProcessor {
    @Override
    public String process(String text) {
        // logic for basic processing of text
        return text.toLowerCase();
    }
}
