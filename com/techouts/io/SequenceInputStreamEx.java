package com.techouts.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

import static com.techouts.io.FileInputStreamEx.filename;

public class SequenceInputStreamEx {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fis1 = new FileInputStream(filename);
            FileInputStream fis2 = new FileInputStream("src\\com\\techouts\\io\\File1.txt");
            SequenceInputStream sis = new SequenceInputStream(fis1,fis2)){
            byte[] b = new byte[1024];
            int c
                        = sis.read(b,0,10);
            System.out.println(c);
            for(int i=0;i<0+c;i++){
                System.out.print((char)b[i]);
            }
        }
    }
}
