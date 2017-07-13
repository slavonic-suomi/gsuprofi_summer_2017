package by.gsu.lesson11;

public class SecondGenericExampleMain {
    public static void main(String[] args) {
        Product phone = new Phone();

        GenericContainer<Phone> phones = new GenericContainer<>();
        //GenericContainer<Product> products = phones; error
    }
}
