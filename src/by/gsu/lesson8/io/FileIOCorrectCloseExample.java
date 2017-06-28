package by.gsu.lesson8.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileIOCorrectCloseExample {
    public static void main(String[] args){
        File file = new File("test.txt");
        String data = "some data";

        FileOutputStream   fos = null;
        OutputStreamWriter osw = null;
        try {
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);

            osw.write(data);

            osw.close();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("oops!");
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }

            } catch (IOException e) {}

            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {}
        }

    }
}
