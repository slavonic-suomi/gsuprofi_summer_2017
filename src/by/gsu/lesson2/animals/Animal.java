package by.gsu.lesson2.animals;


public class Animal {
    private int age;
    protected int weight;
    String name;

    public Animal() {
        System.out.println("some animal created!");
    }

    public Animal(int age) {
        System.out.println("some animal created with params!");
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int someAge) {
        age = someAge;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int someWeight) {
        weight = someWeight;
    }


    @Override
    public String toString() {
        return "This is " + name + " and his age is " + age
                + " weight = " + weight;
    }

}
