package com.nav.java8;

import com.pattern.*;
import java.io.File;

public class App  {
    public static void main(String[] args) {
        BatchProcessor processor = createBatchProcessor("Text");
        processor.processBatch("File");
        //args[0] = "Text";


    }

    private static BatchProcessor createBatchProcessor(String arg) {
        if("Text".equalsIgnoreCase(arg)){
            return new TextBatchProcessor();
        }
        else if("CSV".equalsIgnoreCase(arg)){
            return new CSVBatchProcessor();
        }
        if("XML".equalsIgnoreCase(arg)){
            return new XMLBatchProcessor();
        }
        return null;
    }


}
