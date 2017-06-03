package by.gsu.lesson3;

import by.gsu.lesson3.animals.Animal;
import by.gsu.lesson3.animals.Cat;
import by.gsu.lesson3.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.voice();
        dog.voice();

        dog.feed(100);
        cat.feed(150);

        cat.fight(dog);

        System.out.println(dog.getWeight());
        System.out.println(cat.getWeight());

    }
}
