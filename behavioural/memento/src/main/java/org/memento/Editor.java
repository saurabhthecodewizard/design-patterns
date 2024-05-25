package org.memento;

import java.util.Stack;

public class Editor {
    private final TextArea textArea;
    private final Stack<TextArea.Memento> history;

    public Editor() {
        this.textArea = new TextArea();
        this.history = new Stack<>();
    }

    public void write(String text) {
        textArea.set(text);
        history.push(textArea.saveSnapshot());
    }

    public void undo() {
        history.pop();
        textArea.restore(history.peek());
    }

    @Override
    public String toString() {
        return "Editor{" +
                "textArea=" + textArea +
                '}';
    }
}
