package org.builder.builders;

import org.builder.entities.Task;

public interface TaskBuilder {
    TaskBuilder name(String name);
    TaskBuilder description(String description);
    TaskBuilder priority(int priority);
    TaskBuilder assignee(String assignee);
    Task build();
}
