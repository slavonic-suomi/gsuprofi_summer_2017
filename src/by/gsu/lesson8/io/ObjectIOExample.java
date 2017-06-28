package by.gsu.lesson8.io;

import java.io.*;

public class ObjectIOExample  {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person tom = new Person("Tom", 12, true);

        File file = new File("persons.bin");

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(tom);

        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person o = (Person) ois.readObject();

        System.out.println(o.getName());
        System.out.println(o.getAge());
        System.out.println(o.isMale());

        ois.close();
        fis.close();
    }
}
