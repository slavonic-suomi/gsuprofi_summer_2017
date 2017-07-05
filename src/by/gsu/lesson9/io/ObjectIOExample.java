package by.gsu.lesson9.io;


import java.io.*;

public class ObjectIOExample {

    public static final String NEW_PERSONS_BIN = "new_persons.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializablePerson tom = new SerializablePerson("Tom", 12, true);

        File file = new File(NEW_PERSONS_BIN);

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(tom);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        SerializablePerson o = (SerializablePerson) ois.readObject();

        System.out.println(o.getName());
        System.out.println(o.getAge());
        System.out.println(o.isMale());

        ois.close();
        fis.close();
    }
}
