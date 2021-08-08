package com.nav.java8;

import com.pattern.BatchProcessor;

public class App {
    public static void main(String[] args) {
        BatchProcessor processor =  new BatchProcessor();
        processor.processBatch("TextFile","XML");
    }
}
