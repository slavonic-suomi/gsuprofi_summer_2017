package by.gsu.lesson6.strings;

public class StringEqualsMain {
    public static void main(String[] args) {
        String s1 = "qwe";
        String s2 = "qwe";

        System.out.println(s1 == s2 );
        System.out.println(s1.equals(s2));

        String s3 = new String("qwe");
        String s4 = "qwe";

        System.out.println(s3 == s4 );
        System.out.println(s3.equals(s4));
    }
}
