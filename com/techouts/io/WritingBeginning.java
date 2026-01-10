package com.techouts.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import static com.techouts.io.FileInputStreamEx.filename;

public class WritingBeginning {
    private static final Logger logger = Logger.getLogger(WritingBeginning.class.getName());
    public static void main(String[] args) throws IOException {
        byte[] buffer;
        try(FileInputStream fis = new FileInputStream(filename)){
            buffer = fis.readAllBytes();
        }
        try(FileOutputStream fos = new FileOutputStream(filename)) {
            String newBuffer = "Hi I am Ganesh";
            fos.write(newBuffer.getBytes());
            fos.write(buffer);
        }
        logger.info("Successfully Written.....");
    }
}
