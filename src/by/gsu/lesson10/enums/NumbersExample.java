package by.gsu.lesson10.enums;

import java.math.BigDecimal;
import java.math.BigInteger;

public class NumbersExample {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer integer = Integer.valueOf("123");
        int i = Integer.parseInt("123");

        BigInteger bi = new BigInteger("123");
        int i3 = bi.intValue();

        BigInteger multiply = bi.multiply(new BigInteger("456"));

        BigDecimal dg = new BigDecimal("123");



    }
}
