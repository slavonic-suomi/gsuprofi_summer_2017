package by.gsu.lesson10.enums;

public class Light {
    private byte color;

    public byte getColor() {
        return color;
    }

    public void setColor(byte color) {
        if (color < 1 || color > 3) {
            throw new IllegalArgumentException();
        }
        this.color = color;
    }

    public static void main(String[] args) {
        Light light = new Light();
        light.setColor((byte) 4);
    }
}
