package by.gsu.lesson10.enums;

public class EnumExample {
    public static void main(String[] args) {
        TestClass2 testClass2 = new TestClass2();

        Color color = Color.GREEN;
//        color.setSomeValue(123);

        Color color1 = Color.GREEN;
        System.out.println(color1.getHexCode());

        System.out.println(Color.RED.ordinal());
        System.out.println(Color.GREEN.ordinal());
        System.out.println(Color.BLUE.ordinal());

        Color[] values = Color.values();

        Color redColor = Color.valueOf("RED");
        System.out.println(Color.RED.equals(redColor));


        int inputHex = 456;
        Color result = null;

        for (Color col : Color.values()) {
            if (col.getHexCode() == inputHex) {
                result = col;
                break;
            }
        }

        System.out.println(Color.GREEN.equals(result));

//        Compression.ZIP.compress()
    }
}
