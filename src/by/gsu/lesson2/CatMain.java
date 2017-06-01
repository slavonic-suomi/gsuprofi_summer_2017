package by.gsu.lesson2;


import by.gsu.lesson2.animals.Animal;
import by.gsu.lesson2.animals.Cat;
import by.gsu.lesson2.animals.Dog;

public class CatMain {
    public static void main(String[] args) {


        Dog dog1 = new Dog();
        dog1.setAge(1);
        dog1.setWeight(10);

        Cat cat1 = new Cat();

        cat1.setAge(1);
        //cat1.name = "Tom";

        cat1.catchMouse();
        cat1.catchMouse();
        cat1.catchMouse();

        int v = cat1.getОбъём();

        System.out.println(v);

        cat1.покормить(42);

        System.out.println(cat1.getWeight());

        System.out.println(cat1);

        //
        Animal someAnimal = new Cat();
        Object someAnimal2 = new Dog();
        Object someAnimal3 = new Dog(12, 3);

        System.out.println(someAnimal);
        System.out.println(someAnimal2);
        System.out.println(someAnimal3);

    }
}
