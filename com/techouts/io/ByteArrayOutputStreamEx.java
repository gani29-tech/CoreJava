package com.techouts.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws IOException {
        try(ByteArrayOutputStream bout = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream(filename)){
            bout.write(65);
            bout.writeTo(fos);
            System.out.println("Successfully wrote to the file");
        }
    }
}
