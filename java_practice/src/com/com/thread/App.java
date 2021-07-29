package com.com.thread;

class Runner extends Thread {
    @Override
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("Hello :"+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class App {
    public static void main(String[] args) {
        Runner runner1 =  new Runner();
        Runner runner2 = new Runner();
        runner1.start();
        runner2.start();
    }
}
