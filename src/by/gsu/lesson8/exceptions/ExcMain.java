package by.gsu.lesson8.exceptions;

public class ExcMain {
    public static void main(String[] args) {
        Operations ops = new Operations();
        int calcResult = ops.calc(new A());
        System.out.println(calcResult);
    }

}
