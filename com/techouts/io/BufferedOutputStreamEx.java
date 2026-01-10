package com.techouts.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import static com.techouts.io.FileInputStreamEx.filename;

public class BufferedOutputStreamEx {
    private static final Logger logger = Logger.getLogger(BufferedOutputStreamEx.class.getName());
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename,true); BufferedOutputStream bos = new BufferedOutputStream(fos)) {
            bos.write(System.lineSeparator().getBytes());
            bos.write("Hi I am from Buffer".getBytes());
        }
        logger.info("Writing into Buffer Successful");
    }
}
