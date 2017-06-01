package by.gsu.lesson2;

import by.gsu.lesson2.animals.Dog;

public class AnimalConstructorMain {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(42, 12);

        System.out.println(dog1);
        System.out.println(dog2);

    }
}
