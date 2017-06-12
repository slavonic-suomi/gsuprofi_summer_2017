package by.gsu.lesson4.animals;

public class Parrot extends Pet implements FlyingThing {
    @Override
    public void fly() {
        System.out.println("parrot fly!");
    }
}
