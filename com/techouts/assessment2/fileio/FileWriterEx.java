package com.techouts.assessment2.fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

public class FileWriterEx {
    private static final Logger logger = Logger.getLogger(FileWriterEx.class.getName());

    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("file1.txt", true)) {
            fw.write(System.lineSeparator());
            fw.write("Where are you from?");
        }
        logger.info("Successfully wrote to the file.");
    }
}
