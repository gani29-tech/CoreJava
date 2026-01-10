package com.techouts.io;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CharArrayWriterEx {
    public static void main(String[] args) throws IOException {
        try(CharArrayWriter charArrayWriter = new CharArrayWriter();
        OutputStreamWriter osw = new OutputStreamWriter(System.out);){
            charArrayWriter.write('a');
            charArrayWriter.write('b');
            charArrayWriter.writeTo(osw);
        }
    }
}
