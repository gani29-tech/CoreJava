package com.techouts.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import static com.techouts.io.FileInputStreamEx.filename;

public class WriterEx {
    public static void main(String[] args) throws IOException {
        try (Writer w = new FileWriter(filename)) {
            String content = "Hello World!";
            w.write(content);
            System.out.println("Successfully wrote to the file");
        }
    }
}
