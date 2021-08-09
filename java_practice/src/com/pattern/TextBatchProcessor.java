package com.pattern;

import java.io.File;

public class TextBatchProcessor extends BatchProcessor {
    @Override
    public Parser createParser(File file) {
        System.out.println("debug..1");
        return new TextParser();
    }
}
