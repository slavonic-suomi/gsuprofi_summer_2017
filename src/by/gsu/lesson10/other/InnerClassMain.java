package by.gsu.lesson10.other;

public class InnerClassMain {
    public static void main(String[] args) {

        TestA.TestNestedTopLevelA nestedA = new TestA.TestNestedTopLevelA();
        nestedA.someName = "asd";

        TestA testA = new TestA();
        TestA.InnerClassA innerClassA = testA.new InnerClassA();

        //plain old java anonymous class
        Calculator calc = new Calculator() {
            @Override
            public int summ(int a, int b) {
                return a + b;
            }
        };

        Calculator calc1 = (a, b) -> {
            int x = 1;
            return a + b + x - x ;
        };


        Calculator calc2 = (a, b) -> a + b;

        calc2.calc(3,1);


        System.out.println(calc.summ(1, 3));
        System.out.println(calc1.summ(1, 3));

    }
}
