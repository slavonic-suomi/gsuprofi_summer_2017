package by.gsu.lesson8.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FIleIOMain {
    public static void main(String[] args){
        File file = new File("test.txt");
        String data = "some data";

        try {
            FileOutputStream   fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            osw.write(data);

//        osw.flush();

            osw.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("oops!");
        }

    }
}
