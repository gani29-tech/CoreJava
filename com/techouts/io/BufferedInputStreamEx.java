package com.techouts.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class BufferedInputStreamEx {
    public static void main(String[] args) throws IOException {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename),4)){
            int data;
            System.out.println(bis.markSupported());
            bis.mark(5); // Marks the starting position
            System.out.println(bis.available()); //checks the available size to be read
            for(int i=0;i<10;i++){
                data = bis.read();
                System.out.print((char) data);
            }
            System.out.println(bis.available());
            bis.reset(); // it reset to marked position
            while((data=bis.read())!=-1){
                System.out.print((char) data);
            }
        }
    }
}
