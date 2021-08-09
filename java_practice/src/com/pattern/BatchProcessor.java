package com.pattern;

import java.io.File;
import java.util.List;
public abstract class BatchProcessor {
    public void processBatch(String fileName) {
        File file = openFile(fileName);
        Parser parser = createParser(file);
//        if(format.equalsIgnoreCase("Text")) {
//          parser = new TextParser(file);
//        }
//        else if(format.equalsIgnoreCase("CSV"))
//        {
//            parser = new CSVParser(file);
//        }
//        else if(format.equalsIgnoreCase("XML"))
//        {
//            parser = new XMLParser(file);
//        }
//

        List<Records> records = parser.parse();
        processRecords(records);
        writeSummary();
        closeFile(file);
    }

    public abstract Parser createParser(File file);


    private void writeSummary() {
        System.out.println("Wrote the summary");
    }
    private void closeFile(File file) {
        System.out.println("File is closed");
    }

    private void processRecords(List<Records> records) {
        System.out.println("Records are processed...");
    }

    private File openFile(String fileName) {
        return new File(fileName);
    }
}
