package org.memento;

public class Main {
    public static void main(String[] args) {
        System.out.println("Memento Design Pattern");
        System.out.println("-------------------------");

        Editor editor = new Editor();

        editor.write("Hey!");
        System.out.println(editor);
        editor.write("Hey! This");
        System.out.println(editor);
        editor.write("Hey! This is");
        System.out.println(editor);
        editor.write("Hey! This is Saurabh");
        System.out.println(editor);

        System.out.println("---------------------------");
        System.out.println("Undo");
        System.out.println("---------------------------");

        editor.undo();
        System.out.println(editor);
    }
}