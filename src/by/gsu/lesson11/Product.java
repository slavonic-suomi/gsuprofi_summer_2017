package by.gsu.lesson11;

import java.util.Comparator;

public class Product<T extends Product<T>> implements Comparable<T> {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(T o) {
        return this.name.compareToIgnoreCase(o.getName());
    }
}
