package by.gsu.lesson3;


import by.gsu.lesson3.animals.Animal;
import by.gsu.lesson3.animals.Dog;

import java.util.Scanner;

public class InputMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int weight = scanner.nextInt();
        //flush buffer
        scanner.nextLine();

        String name = scanner.nextLine();

        Animal a = new Dog(name);
        a.setWeight(weight);

        System.out.println(a.getName());
        System.out.println(a.getWeight());

    }
}
