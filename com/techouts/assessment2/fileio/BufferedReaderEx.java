package com.techouts.assessment2.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

public class BufferedReaderEx {
    private static final Logger logger = Logger.getLogger(BufferedReaderEx.class.getName());
    public static String file = "C:\\Users\\tech\\IdeaProjects\\Techouts-Java\\src\\com\\techouts\\assessment2\\fileio\\File.txt";

    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fr)) {
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                logger.info(data);
            }
        }
    }
}
