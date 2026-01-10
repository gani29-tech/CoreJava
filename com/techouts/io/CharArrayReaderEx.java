package com.techouts.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderEx {
    public static void main(String[] args) throws IOException {
        char[] charArray = {'1','2','3','4','5','6','7','8','9'};
        try(CharArrayReader charArrayReader = new CharArrayReader(charArray)){
            int data;
            while((data=charArrayReader.read())!=-1){
                System.out.print(data+" ");
            }
        }
    }
}
