package org.decorator.service.decorators;

import org.decorator.service.TextProcessor;

public abstract class Decorator implements TextProcessor {
    protected TextProcessor textProcessor;

    public Decorator(TextProcessor textProcessor) {
        this.textProcessor = textProcessor;
    }
}
