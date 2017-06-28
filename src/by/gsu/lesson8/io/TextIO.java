package by.gsu.lesson8.io;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class TextIO {
    public static void main(String[] args) throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        char[] buff = new char[100];
        int count = isr.read(buff);

        System.out.println(count);
        System.out.println(Arrays.toString(buff));



    }
}
