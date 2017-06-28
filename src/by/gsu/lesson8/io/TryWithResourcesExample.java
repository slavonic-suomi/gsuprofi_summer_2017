package by.gsu.lesson8.io;

import java.io.*;

public class TryWithResourcesExample {
    public static void main(String[] args){
        File file = new File("test.txt");
        String data = "some data";

        try (FileOutputStream fos = new FileOutputStream(file);
             OutputStreamWriter osw = new OutputStreamWriter(fos)
        ) {
            osw.write(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
