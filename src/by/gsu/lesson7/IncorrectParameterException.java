package by.gsu.lesson7;

public class IncorrectParameterException extends Exception {
    private String name;

    public IncorrectParameterException(String name) {
        super("such params are wrong: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
