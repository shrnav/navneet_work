package com.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private Account act1 = new Account();
    private Account act2 = new Account();
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void firstThread(){
        System.out.println("First thread");
        Random random = new Random();
        for (int i = 0; i <10000 ; i++) {
            locksAround(random, act1, act2);
        }
    }
    private void locksAround(Random random, Account act1, Account act2) {
        lock1.lock();
        lock2.lock();
        Account.transfer(act1, act2, random.nextInt(100));
        lock1.unlock();
        lock2.unlock();
    }
    public void secondThread(){
        System.out.println("Second thread");
        Random random = new Random();
        for (int i = 0; i <10000 ; i++) {
            locksAround(random, act2, act1);
        }
    }
    public void finished(){
        System.out.println("Account 1 balance: "+act1.getBalance());
        System.out.println("Account 2 balance: "+act2.getBalance());
        System.out.println("Total Balance :: "+(act1.getBalance()+act2.getBalance()));
        System.out.println("Completed");
    }
}
