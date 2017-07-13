package by.gsu.lesson10.enums;

public enum Color {
    RED(123),
    GREEN(456),
    BLUE(789);

    Color(int hexCode) {
        this.hexCode = hexCode;
    }

    private int hexCode;

    public int getHexCode() {
        return hexCode;
    }
}
