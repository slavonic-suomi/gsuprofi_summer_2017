package by.gsu.lesson7;

public class Individual extends Person {
    private int age;

    public Individual() {
    }

    public Individual(String name, int inn, int age) {
        super(name, inn);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Individual{" +
                super.toString() + ", " +
                "age=" + age +
                '}';
    }
}
