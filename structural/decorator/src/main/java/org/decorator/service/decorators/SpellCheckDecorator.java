package org.decorator.service.decorators;

import org.decorator.service.TextProcessor;
import org.decorator.service.decorators.Decorator;

public class SpellCheckDecorator extends Decorator {
    public SpellCheckDecorator(TextProcessor textProcessor) {
        super(textProcessor);
    }

    @Override
    public String process(String text) {
        String processedText = super.textProcessor.process(text);
        return rectifySpellings(processedText);
    }

    private String rectifySpellings(String text) {
        // logic to check for spellings and correcting them
        // Simulated spell check - replace 'wrd' with 'word'
        return text.replaceAll("wrd", "word");
    }
}
