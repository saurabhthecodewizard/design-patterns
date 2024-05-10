package org.decorator.service.decorators;

import org.decorator.service.TextProcessor;

public class SpecialCharDecorator extends Decorator {
    public SpecialCharDecorator(TextProcessor textProcessor) {
        super(textProcessor);
    }

    @Override
    public String process(String text) {
        String processedText = textProcessor.process(text);
        return replaceSpecialChars(processedText);
    }

    private String replaceSpecialChars(String text) {
        // Remove special characters
        // Simulated removal of special characters
        return text.replaceAll("[^a-zA-Z0-9\\s]", "");
    }
}
