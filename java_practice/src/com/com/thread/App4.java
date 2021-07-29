package com.com.thread;

import java.util.concurrent.*;

public class App4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 0; i <5 ; i++) {
            executorService.submit(new Worker1(i));
        }
        System.out.println("All task submitted ");
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("All task finished!!! ");

    }
}

class Worker1 implements Runnable {

    private int id;
    public Worker1(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        System.out.println("Starting..."+id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed..."+id);
    }
}
