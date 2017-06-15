package by.gsu.lesson6.copy;

public class PWCMain  {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car("red");
        PersonWithCar pwc1 = new PersonWithCar("Ivan", car1);

        PersonWithCar clone = (PersonWithCar) pwc1.clone();

        System.out.println(pwc1);
        System.out.println(clone);

        clone.setName("Petr");
        clone.getCar().setColor("Green");

        System.out.println(pwc1);
        System.out.println(clone);

        PersonWithCar cloneFromFactory
                = PersonWithCarFactory.create(pwc1.getName(), pwc1.getCar().getColor());

    }
}
