package org.builder.builders;

import org.builder.entities.Task;

public class ManualTaskBuilder implements TaskBuilder {
    private String name;
    private String description;
    private int priority;
    private String assignee;

    @Override
    public TaskBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public TaskBuilder description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public TaskBuilder priority(int priority) {
        this.priority = priority;
        return this;
    }

    @Override
    public TaskBuilder assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    @Override
    public Task build() {
        return new Task(name, description, priority, assignee);
    }
}
