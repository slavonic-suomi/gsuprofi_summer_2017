package by.gsu.lesson2.animals;

public class Dog extends Animal {

    public Dog() {
        System.out.println("dog created");
    }

    public Dog(int age, int weight) {
        super(age);
        System.out.println("dog created with params!");
        this.weight = weight;
    }

//    public String toString() {
//        return "This is a dog";
//    }

}
