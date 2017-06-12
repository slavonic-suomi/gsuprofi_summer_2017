package by.gsu.lesson4.animals;

import java.io.Serializable;

public class Owl extends Animal implements FlyingThing, Serializable, Cloneable {

    private final int age;

    public Owl() {
        age = 10;
    }

    public Owl(int age) {
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println("owl fly!");
    }
}
