package com.pattern;

import java.io.File;

public class XMLBatchProcessor extends BatchProcessor{
    @Override
    public Parser createParser(File file) {
        System.out.println("Creating XML parser...");
        return null;
    }
}
