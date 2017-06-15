package by.gsu.lesson6.copy;

public class PersonWithCar implements Cloneable {
    private String name;
    private Car car;

    public PersonWithCar() {
    }

    public PersonWithCar(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public PersonWithCar(PersonWithCar other) {
        this.name = other.name;
        this.car = new Car(other.car);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        PersonWithCar clone = (PersonWithCar) super.clone();
        clone.setCar( (Car) this.getCar().clone() );
        return clone;
    }

    @Override
    public String toString() {
        return "PersonWithCar{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
