package org.memento;

public class TextArea {
    private String text;

    public void set(String text) {
        this.text = text;
    }

    public Memento saveSnapshot() {
        return new Memento(this.text);
    }

    public void restore(Memento memento) {
        this.text = memento.getSavedText();
    }

    @Override
    public String toString() {
        return "TextArea{" +
                "text='" + text + '\'' +
                '}';
    }

    public static class Memento {
        private final String text;

        private Memento(String text) {
            this.text = text;
        }

        private String getSavedText() {
            return this.text;
        }
    }
}
