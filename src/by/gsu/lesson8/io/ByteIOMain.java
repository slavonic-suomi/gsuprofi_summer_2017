package by.gsu.lesson8.io;

import java.io.IOException;
import java.util.Arrays;

public class ByteIOMain {
    public static void main(String[] args) throws IOException{
        int readRes = System.in.read();

        System.out.println(readRes);
        System.out.println((char) readRes);

        byte[] buff = new byte[100];
        int count = System.in.read(buff);

        System.out.println(count);
        System.out.println(Arrays.toString(buff));



    }
}
