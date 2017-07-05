package by.gsu.lesson9.io;

import java.io.*;

public class SerializablePerson implements Externalizable {

    public static final long serialVersionUID = 123;

    private String name;
    private int age;
    private boolean isMale;
    public long count = 1;

    public SerializablePerson() {
    }

    public SerializablePerson(String name, int age, boolean isMale) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeBoolean(isMale);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        boolean isMale = in.readBoolean();
        String name = in.readUTF();

        this.name = name;
        this.isMale = isMale;
    }
}
