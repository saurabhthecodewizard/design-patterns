package org.composite;

import org.composite.service.Directory;
import org.composite.service.File;

public class Main {
    public static void main(String[] args) {
        System.out.println("Composite Design Pattern");
        System.out.println("----------------------------");

        // Create files
        File file1 = new File("Document1.txt");
        File file2 = new File("Image1.png");
        File file3 = new File("Document2.txt");

        // Create directories
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory images = new Directory("Images");

        // Add files to directories
        root.add(documents);
        root.add(images);
        documents.add(file1);
        images.add(file2);
        documents.add(file3);

        // Display file system structure
        root.ls();
    }
}