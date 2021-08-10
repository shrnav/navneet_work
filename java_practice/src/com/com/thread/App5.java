package com.com.thread;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App5 {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {


                    consumer();

                    System.out.println("debug..1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    private static void producer() throws InterruptedException {
        Random random = new Random();
        while (true){
            queue.put(random.nextInt(100));
        }
    }

    private static void consumer() throws InterruptedException {
     Random random = new Random();
     while(true){
         Thread.sleep(10);
         if(random.nextInt(100)==10){
             Integer value = queue.take();
             System.out.println("Taken value: "+value+" ,queue size: "+queue.size());
         }
     }
    }
}
