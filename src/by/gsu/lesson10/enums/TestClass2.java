package by.gsu.lesson10.enums;

public class TestClass2 {

    static {
        System.out.println("static section");
    }

    private static TestClass1 class1 = new TestClass1();


    public TestClass2() {
        System.out.println("default cls2");
    }
}
