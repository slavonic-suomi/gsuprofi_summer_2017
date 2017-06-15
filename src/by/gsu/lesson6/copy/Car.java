package by.gsu.lesson6.copy;

public class Car implements Cloneable{
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public Car(Car other) {
        this.color = other.color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
