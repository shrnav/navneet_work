package com.com.thread;

import java.util.Random;
import java.util.concurrent.*;

public class App7 {
    public static void main(String[] args) {
        ExecutorService executerService = Executors.newCachedThreadPool();

        Future<Integer> future = executerService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Random random = new Random();
                int duration = random.nextInt(4000);
                System.out.println("suration "+duration);
                Thread.sleep(duration);
                return duration;
            }
        });
        executerService.shutdown();
        try {
            System.out.println(future.get());
        }
        catch(ExecutionException ex){
            System.out.println(ex.getMessage());
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }

}
