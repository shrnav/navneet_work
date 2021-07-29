package com.com.thread;

public class App3 {
    private static int count = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {
                    doCount();


                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <1000 ; i++) {

                        doCount();

                }
            }
        });

        t1.start();
//        System.out.println(count);
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Count=>"+count);
    }

    public static synchronized void doCount(){
        count++;
    }
}
