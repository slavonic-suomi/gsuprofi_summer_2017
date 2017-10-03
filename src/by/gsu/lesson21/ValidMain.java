package by.gsu.lesson21;

import java.util.ArrayList;

public class ValidMain {
    public static void main(String[] args) {
        User user = new User();
        user.setName("");
        user.setSomeInts(new ArrayList<>());
        Validator.validate(user);
    }
}
