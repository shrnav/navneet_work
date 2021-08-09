package com.pattern;

import java.io.File;

public class CSVBatchProcessor extends BatchProcessor {
    @Override
    public Parser createParser(File file) {
        return new CSVParser();
    }
}
