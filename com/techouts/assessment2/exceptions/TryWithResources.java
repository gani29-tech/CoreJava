package com.techouts.assessment2.exceptions;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

import static com.techouts.io.FileInputStreamEx.filename;

public class TryWithResources {
    private static final Logger logger = Logger.getLogger(TryWithResources.class.getName());
    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(System.in);
            FileOutputStream fos = new FileOutputStream(filename)){
            // Here Scanner and File Output Stream will automatically close
            String greeting = "Hello Everyone";
            byte[] b = greeting.getBytes();
            fos.write(b);
            logger.info("Data is written to file Successfully!!!!");
        }
    }
}
