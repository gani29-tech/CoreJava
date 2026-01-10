package com.techouts.io;

import java.io.*;

import static com.techouts.io.FileInputStreamEx.filename;

public class BufferReaderEx {
    public static void main(String[] args) throws IOException {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(filename));
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
    }
}
