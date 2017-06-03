package by.gsu.lesson3;

import by.gsu.lesson3.animals.Dog;

public class ArraysMain {
    public static void main(String[] args) {
        int[] intArray = new int[10];
        Dog[] dogsArray = new Dog[1];

        int[] someArray = {1,2,3,4,5};
        String[] strings = {"qwe", "asd", "xzc"};

        intArray[0] = 1;
        intArray[0] = 10;

        dogsArray[0] = new Dog();

        for (int i = 0; i < intArray.length - 1; i++) {
            intArray[i] = i * i;
        }

        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.println(intArray[i]);
        }
    }
}
