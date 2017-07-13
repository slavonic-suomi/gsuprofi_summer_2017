package by.gsu.lesson11;

public class GenericContainer<T> {
    private T object; //like array

    public void add(T product) {
        this.object = product;
    }

    public T getObject() {
        return object;
    }

    public void test() {
//        object.
    }


}
