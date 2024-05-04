package org.builder.entities;

// Entity
public class Task {
    // Can be auto generated
    // private Long id;
    private String name;
    private String description;
    private int priority;
    private String assignee;

    public Task(String name, String description, int priority, String assignee) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.assignee = assignee;
    }

    // getters & setters

    public static TaskBuilder getBuilder() {
        return new TaskBuilder();
    }

    public static class TaskBuilder {
        private String name = "Default Task";
        private String description = "Default Task Description";
        private int priority = 1;
        private String assignee = "Unassigned";

        public TaskBuilder name(String name) {
            this.name = name;
            return this;
        }

        public TaskBuilder description(String description) {
            this.description = description;
            return this;
        }

        public TaskBuilder priority(int priority) {
            this.priority = priority;
            return this;
        }

        public TaskBuilder assignee(String assignee) {
            this.assignee = assignee;
            return this;
        }

        public Task build() {
            return new Task(name, description, priority, assignee);
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", assignee='" + assignee + '\'' +
                '}';
    }
}
