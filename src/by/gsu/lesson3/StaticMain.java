package by.gsu.lesson3;

import by.gsu.lesson3.animals.Dog;

public class StaticMain {
    public static void main(String[] args) {

        new Dog();
        new Dog();
        new Dog();
        new Dog();
        Dog lastDog = new Dog();

        System.out.println(Dog.getCount());

    }
}
