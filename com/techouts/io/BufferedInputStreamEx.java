package com.techouts.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static com.techouts.io.FileInputStreamEx.filename;

public class BufferedInputStreamEx {
    public static void main(String[] args) throws IOException {
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename))){
            int data;
            while((data=bis.read())!=-1){
                System.out.print((char) data);
            }
        }
    }
}
