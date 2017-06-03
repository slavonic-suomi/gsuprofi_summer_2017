package by.gsu.lesson3.animals;

public class Dog extends Animal {

    private static int count;

    public Dog() {
        count++;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("гав");
    }

    public static int getCount() {
        return count;
    }


}
