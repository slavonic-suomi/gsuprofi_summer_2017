package by.gsu.lesson3.animals;

public class Cat extends Animal {

    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("мяу");
    }
}
