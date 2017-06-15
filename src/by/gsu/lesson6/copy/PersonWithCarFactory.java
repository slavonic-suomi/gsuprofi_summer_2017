package by.gsu.lesson6.copy;

public class PersonWithCarFactory {
    public static PersonWithCar create(String name, String carColor) {
        Car car = new Car(carColor);
        return new PersonWithCar(name, car);
    }
}
