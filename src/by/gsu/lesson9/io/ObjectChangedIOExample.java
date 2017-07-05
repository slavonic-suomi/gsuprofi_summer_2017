package by.gsu.lesson9.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import static by.gsu.lesson9.io.ObjectIOExample.NEW_PERSONS_BIN;

public class ObjectChangedIOExample {

    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream(NEW_PERSONS_BIN);
        ObjectInputStream ois = new ObjectInputStream(fis);

        SerializablePerson o = (SerializablePerson) ois.readObject();

        System.out.println(o.getName());
        System.out.println(o.getAge());
        System.out.println(o.isMale());
        System.out.println(o.count);

        ois.close();
        fis.close();
    }
}
