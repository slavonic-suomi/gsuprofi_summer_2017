package by.gsu.lesson9.strings.tasks;

import by.gsu.lesson9.strings.StringProcessor;

public class IntTask implements StringProcessor {

    @Override
    public Object process(String input) {
        int length = input.length();
        return new Integer(length);
    }

    public int calc(Integer param) {
        return param - 1;
    }

    @Override
    public String getDescription() {
        return "int task";
    }
}
