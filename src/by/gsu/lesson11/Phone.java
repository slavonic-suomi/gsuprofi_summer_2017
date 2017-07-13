package by.gsu.lesson11;

import java.io.Serializable;

public class Phone extends Product<Phone> implements Serializable {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" + super.toString() +
                ", size=" + size +
                '}';
    }

    public static PhoneBuilder builder() {
        return new PhoneBuilder();
    }

    static class PhoneBuilder {
        private String name;
        private float price;
        private int size;

        public PhoneBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PhoneBuilder price(float price) {
            this.price = price;
            return this;
        }

        public PhoneBuilder size(int size) {
            this.size = size;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setSize(size);
            phone.setName(name);
            phone.setPrice(price);

            return phone;
        }

    }
}
