package org.composite.service;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private String name;
    private final List<FileSystem> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        for (FileSystem component : children) {
            component.ls();
        }
    }

    public void add(FileSystem fileSystem) {
        this.children.add(fileSystem);
    }

    public void remove(FileSystem fileSystem) {
        this.children.remove(fileSystem);
    }
}
