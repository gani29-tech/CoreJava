package com.techouts.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class BufferWriterEx {
    public static void main(String[] args) throws IOException {
        try(BufferedWriter br = new BufferedWriter(new FileWriter(filename))){
            br.write("Hello I am writing from BufferWriterEx");
            br.write("\n");
            br.write("How are you?");
            System.out.println("Successfully written");
        }
    }
}
