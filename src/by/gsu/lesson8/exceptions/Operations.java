package by.gsu.lesson8.exceptions;

public class Operations {

    public int calc(A a) {
        try {
            return 100/a.b.x;
        } catch (ArithmeticException ae) {
            System.out.println("division by zero!");
            return -1;
        } catch (NullPointerException npe) {
            return -2;
        } finally {
            System.out.println("finally!");
            //return 42; - можно, но не нужно
        }
    }

    public int calc2(A a) {
        try {
            return 100 / a.getB().getX();
        } catch (ArithmeticException | NullPointerException ae) {
            System.out.println("division by zero or null pointer!");
            return -1;
        } finally {
            System.out.println("finally!");
            //return 42; - можно, но не нужно
        }
    }

    public int calc3(A a) {
        try {
            return 100 / a.getB().getX();
        } catch (ArithmeticException ae) {
            System.out.println("division by zero!");
            return -1;
        } catch (Exception e) {
            System.out.println("some exception");
            return -2;
        } finally {
            System.out.println("finally!");
            //return 42; - можно, но не нужно
        }
    }
}
