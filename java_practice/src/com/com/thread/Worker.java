package com.com.thread;

import java.util.*;

public class Worker {
    private static List<Integer> list1 = new ArrayList<>();
    private static List<Integer> list2 = new ArrayList<>();
    private static Object lock1 = new Object();
    private static Object lock2 = new Object();
    private static Random random = new Random();

    public static void stageOne(){
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list1.add(random.nextInt(100));
        }
    }

    public static void stageTwo(){
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            list2.add(random.nextInt(100));
        }
    }

    public static void doWork(){
        for (int i = 0; i <1000 ; i++) {
            stageOne();
            stageTwo();
        }

    }

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        long endTime = System.currentTimeMillis();

        System.out.println("Time Taken: "+(endTime-startTime));
        System.out.println("List1 Size: "+list1.size()+" List2 Size: "+list2.size());
    }

}
