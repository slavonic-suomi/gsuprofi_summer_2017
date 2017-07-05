package by.gsu.lesson9.io;

import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
        char[] password = console.readPassword();

        System.out.println(password);
    }
}
