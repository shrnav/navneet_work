package com.com.thread;

import java.util.Scanner;

public class App2  {
    public static void main(String[] args) {
        Handler t1 = new Handler();
        t1.start();
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        t1.shutDown();
    }
}
class Handler  extends Thread {
    private static volatile boolean runner = true;
    public void run(){
        while(runner){
            System.out.println("Hello");
        }
    }
    public void shutDown(){
        runner=false;
    }
}



