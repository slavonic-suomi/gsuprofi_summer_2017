package by.gsu.lesson4.animals;

public class Cat extends Pet {

    public Cat() {
    }

    public Cat(String name, int code) {
        super(name);
        this.code = code;
    }

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
