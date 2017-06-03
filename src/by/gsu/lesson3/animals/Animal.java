package by.gsu.lesson3.animals;

public abstract class Animal {
    private String name;
    private int weight;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void feed(int food) {
        weight += food;
    }

    public void fight(Animal enemy) {
        if (enemy.weight > this.weight) {
            this.weight -= 50;
        } else {
            enemy.weight -= 50;
        }
    }

    public abstract void voice();
}
