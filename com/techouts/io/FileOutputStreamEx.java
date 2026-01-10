package com.techouts.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import static com.techouts.io.FileInputStreamEx.filename;

public class FileOutputStreamEx {
    private static final Logger logger = Logger.getLogger(FileOutputStreamEx.class.getName());

    public static void main(String[] args) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename,true);) {
            String s = "From Warangal";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes, 0, 3);
            logger.info("Written to file Successfully");
        }
    }
}
