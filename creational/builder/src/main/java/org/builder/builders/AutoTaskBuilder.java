package org.builder.builders;

import org.builder.entities.Task;

public class AutoTaskBuilder implements TaskBuilder {
    private String name = "Default Task";
    private String description = "Default Task Description";
    private int priority = 1;
    private String assignee = "Unassigned";

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
