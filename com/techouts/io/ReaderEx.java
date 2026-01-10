package com.techouts.io;

import java.io.*;

import static com.techouts.io.FileInputStreamEx.filename;

public class ReaderEx {
    public static void main(String[] args) throws IOException {
        try (Reader r = new FileReader(filename)) {
            int data;
            while ((data = r.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}
