package com.example.group08.quarter2.MiniPeta3;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Schedule {
    public static void main(String[] args) {
        // Create a scheduler thread pool with 2 threads
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // Define a simple task
        Runnable task1 = () -> System.out.println("Task 1: Running delayed task at " + System.currentTimeMillis());
        Runnable task2 = () -> System.out.println("Task 2: Running periodic task at " + System.currentTimeMillis());

        // Scenario A: Run a task ONCE after a 3-second delay
        scheduler.schedule(task1, 3, TimeUnit.SECONDS);

        // Scenario B: Run a task PERIODICALLY every 5 seconds, starting after 1 second
        // fixedRate starts the next task based on the period, regardless of when the last run finished
        scheduler.scheduleAtFixedRate(task2, 1, 5, TimeUnit.SECONDS);

        // Scenario C: Run a task with a fixed DELAY between the end of one run and the start of the next
        // scheduler.scheduleWithFixedDelay(task2, 1, 5, TimeUnit.SECONDS);

        // Keep the application running long enough to see the output, then shut down gracefully
        try {
            Thread.sleep(16000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Shutting down scheduler...");
        scheduler.shutdown();
    }
}
