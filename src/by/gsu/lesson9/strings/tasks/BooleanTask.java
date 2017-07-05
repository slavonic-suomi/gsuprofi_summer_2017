package by.gsu.lesson9.strings.tasks;

import by.gsu.lesson9.strings.StringProcessor;

public class BooleanTask implements StringProcessor {
    @Override
    public Boolean process(String input) {
        return input == null || input.isEmpty();
    }

    @Override
    public String getDescription() {
        return "bool task";
    }
}
