package by.gsu.lesson1;

public class LoopsExample {

    public static void main(String[] args) {

        System.out.println("while loop");
        int i = 10;
        while (i != 0) {
            System.out.println("i = " + i);
            if (i < 5) {
                break;
            }
            i--;
        }

        System.out.println("do while loop");
        int k = -100;
        do {
            System.out.println("k = " + k);
            k--;
        } while (k > 0);

        System.out.println("for loop");


        for (int j = 1;j <= 10; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("j = " + j);
        }


        // inc/dec

        int x = 0;
        int b = x++ + ++x;
        System.out.println(b);
    }

}
