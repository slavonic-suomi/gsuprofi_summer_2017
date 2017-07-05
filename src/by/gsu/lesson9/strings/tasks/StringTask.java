package by.gsu.lesson9.strings.tasks;

import by.gsu.lesson9.strings.StringProcessor;

public class StringTask implements StringProcessor {
    @Override
    public String process(String input) {
        return input + input;
    }

    @Override
    public String getDescription() {
        return "String task";
    }
}
