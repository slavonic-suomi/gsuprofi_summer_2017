package by.gsu.lesson7;

public abstract class Person {
    private String name;
    private int inn;

    public Person() {
    }

    public Person(String name, int inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInn() {
        return inn;
    }

    public void setInn(int inn) {
        this.inn = inn;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", inn=" + inn;
    }
}
