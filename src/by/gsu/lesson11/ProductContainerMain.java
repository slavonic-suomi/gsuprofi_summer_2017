package by.gsu.lesson11;

public class ProductContainerMain {
    public static void main(String[] args) {
        ProductContainer<Phone> phones = new ProductContainer<>();
        Phone phone = new Phone();
        phones.add(phone);

        Phone product = process(phone);

        process(new GenericContainer<Phone>());


        phone.compareTo(new Phone());
        //process(new GenericContainer<String>());


//        ProductContainer<String> strings = new ProductContainer<>();
//        strings.add("qsad");
    }

    public static <T extends Product> T process(T product) {
        product.setPrice(product.getPrice() * 2);
        return product;
    }

    public static <T extends Product> T process(GenericContainer<T> container) {
        container.getObject().setPrice(container.getObject().getPrice() * 2);
        return container.getObject();
    }


    public static Product process2(GenericContainer<? extends Product> container) {
        container.getObject().setPrice(container.getObject().getPrice() * 2);
        return container.getObject();
    }

}
