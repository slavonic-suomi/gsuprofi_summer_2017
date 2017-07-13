package by.gsu.lesson11;

import java.io.Serializable;

public class ProductContainer<Type extends Product & Serializable> {
    private Type object; //like array

    public void add(Type product) {
        this.object = product;
    }

    public Type getObject() {
        return object;
    }

    public void test() {
        object.getName();
    }



}
