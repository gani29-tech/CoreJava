package com.techouts.io;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class ByteArrayInputStreamEx {
    public static void main(String[] args) throws IOException {
        byte[] buffer;
        try (FileInputStream fis = new FileInputStream(filename)) {
            buffer = fis.readAllBytes();
        }
        try (ByteArrayInputStream bais = new ByteArrayInputStream(buffer)) {
            int a;
            while ((a = bais.read()) != -1) {
                System.out.println(a);
            }
        }
    }
}
