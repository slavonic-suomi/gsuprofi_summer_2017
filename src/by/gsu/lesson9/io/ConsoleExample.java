package by.gsu.lesson9.io;

import java.io.Console;
import java.util.Scanner;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        String result;

        if (console != null) {
            char[] password = console.readPassword();
            result = new String(password);
        } else  {
            result = new Scanner(System.in).nextLine();
        }

        System.out.println(result);
    }
}
