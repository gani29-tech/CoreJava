package com.techouts.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class DataInputStreamEx {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream(filename);
             DataInputStream din = new DataInputStream(fis)) {
            int len = din.available();
            byte[] arr = new byte[len];
            din.readFully(arr);
            for (byte b : arr) {
                System.out.println((char) b);
            }
        }
    }
}
