package by.gsu.lesson1;

public class IfElseSwitchExample {

    public static void main(String[] args) {
        //if else example
        int a = 200, b = 4, c = 2;
        int D = b*b - 4*a*c;

        if (D  > 0) {
            double x1, x2;
            x1 = (-b + (Math.sqrt(D))) / 2*a;
            x2 = (-b - (Math.sqrt(D))) / 2*a;

            System.out.println("x1 = " + x1 + " x2 =  " + x2);
        } else if (D == 0) {
            System.out.println("x = " + -(double)b/2*a);
        } else {
            System.out.println("x is not exist!");
        }

        //switch case example
        int input = 4;

        int result ;
        switch (input) {
            case 1 : {
                result = D - 1;
                break;
            }
            case 2 : result = D * D; break;
            case 3 :
            case 4 :
            case 5 :
                result = D / 2; break;

            default: result = D * 111;
        }

        System.out.println("result =" +  result);
    }
}
