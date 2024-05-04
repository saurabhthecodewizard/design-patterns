package org.builder;

import org.builder.builders.AutoTaskBuilder;
import org.builder.builders.ManualTaskBuilder;
import org.builder.entities.Task;

public class Main {
    public static void main(String[] args) {
        Task autoTask = new AutoTaskBuilder().build();

        Task manualTask = new ManualTaskBuilder()
                .name("Finish Report")
                .description("Write the monthly sales report")
                .priority(2)
                .assignee("John Doe")
                .build();

//        Task autoTask = Task.getBuilder().build();
//
//        Task manualTask = Task.getBuilder()
//                .name("Finish Report")
//                .description("Write the monthly sales report")
//                .priority(2)
//                .assignee("John Doe")
//                .build();

        System.out.println("Auto Task:-");
        System.out.println(autoTask);

        System.out.println();
        System.out.println("Manual Task:-");
        System.out.println(manualTask);
    }
}