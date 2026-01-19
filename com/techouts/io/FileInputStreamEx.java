package com.techouts.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static String filename = "src\\com\\techouts\\io\\File.txt";

    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream(filename);) {
            int data;
            for (int i = 0; i < 9 && (data = fis.read()) != -1; i++) {
                System.out.print((char) data);
            }
            long dataskip = fis.skip(4);
            System.out.println();
            System.out.println("Skipped " + dataskip + " bytes");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        }
    }
}
