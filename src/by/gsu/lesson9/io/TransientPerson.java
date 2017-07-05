package by.gsu.lesson9.io;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class TransientPerson {
    private String name;
    private transient int age;
    private boolean isMale;

    public TransientPerson() {
    }

    public TransientPerson(String name, int age, boolean isMale) {
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



}
