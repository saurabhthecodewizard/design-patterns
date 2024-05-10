package org.decorator;

import org.decorator.service.BasicTextProcessor;
import org.decorator.service.TextProcessor;
import org.decorator.service.decorators.SpecialCharDecorator;
import org.decorator.service.decorators.SpellCheckDecorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Decorator Design Pattern");
        System.out.println("-----------------------------");
        // Create concrete text processor
        TextProcessor basicTextProcessor = new BasicTextProcessor();

        // Decorate text processor with spell check and special character removal
        TextProcessor enhancedTextProcessor = new SpellCheckDecorator(
                new SpecialCharDecorator(
                        basicTextProcessor
                )
        );

        // Process text
        String inputText = "Th!s is a text with s0me special ch@racters and a wrd.";
        String processedText = enhancedTextProcessor.process(inputText);
        System.out.println("Original Text: " + inputText);
        System.out.println("Processed Text: " + processedText);
    }
}