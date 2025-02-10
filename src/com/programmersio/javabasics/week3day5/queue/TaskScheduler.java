package com.programmersio.javabasics.week3day5.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Task {
    private String name;
    private int executionTime;

    public Task(String name, int executionTime) {
        this.name = name;
        this.executionTime = executionTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", executionTime=" + executionTime +
                '}';
    }

    public void execute() {
        System.out.println("Executing Task: " + name + ", Time: " + executionTime + "s");

        for (int i = 1; i <= executionTime; i++) {
            System.out.println("Processing " + name + "..." + i + "s completed.");
        }

        System.out.println("Task " + name + " completed.\n");
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Queue<Task> taskQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Tasks to schedule: ");
        int numTasks = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numTasks; i++){
            System.out.println("Enter Task Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Execution Time: ");
            int time = sc.nextInt();
            sc.nextLine();
            taskQueue.add(new Task(name, time));
        }

        System.out.println("Starting Task Execution...");
        while(!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            task.execute();
        }

        System.out.println("All tasks executed.");
    }
}
