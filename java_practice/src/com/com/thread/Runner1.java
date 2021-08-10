package com.com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner1 {

    private int count=0;
    private Lock lock = new ReentrantLock();

    public void increment(){
        count++;
    }

    public void firstThread(){
        for (int i = 0; i <10000 ; i++) {
            try {
                lock.lock();
                increment();
            }
            finally {
                lock.unlock();
            }

        }
    }

    public void secondThread(){
        for (int i = 0; i <10000 ; i++) {
            try {
                lock.lock();
                increment();
            }
            finally {
                lock.unlock();
            }

        }
    }
    public void finished(){
        System.out.println("Count:: "+count);
        System.out.println("Completed");
    }
}
