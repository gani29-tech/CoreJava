package com.techouts.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class DataOutputStreamEx {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename);
             DataOutputStream dos = new DataOutputStream(fos);) {
            dos.writeInt(68);
            dos.flush();
            System.out.println("Successfully wrote to the file");
        }
    }
}
