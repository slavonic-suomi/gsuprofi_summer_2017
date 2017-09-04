package by.gsu.lesson16;

import com.sun.tools.corba.se.idl.InterfaceGen;

/**
 * @author vasiliy.pispanen.
 */
public class PerfMain2 {
    public static void main(String[] args) {
        double k1 = 1;
        double k2 = 1;
        double k3 = 1;
        double k4 = 1;
        double k5 = 1;
        double k6 = 1;
        double k7 = 1;

        long start = System.currentTimeMillis();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            k1 = k1*k1;
            k2 = k1*k2;
            k3 = k2*k3;
            k4 = k3*k4;
            k5 = k4*k5;
            k6 = k5*k6;
            k7 = k6*k7;
        }
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            k2 = k2*k2;
//        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
        System.out.println(k1 + k2 + k3 + k4 + k5 + k6 + k7);
    }
}
