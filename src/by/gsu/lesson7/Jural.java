package by.gsu.lesson7;

public class Jural extends Person {

    private int employersCount;

    public Jural() {
    }

    public Jural(int employersCount, String name, int inn) {
        super(name, inn);
        this.employersCount = employersCount;
    }


    public int getEmployersCount() {
        return employersCount;
    }

    public void setEmployersCount(int employersCount) {
        this.employersCount = employersCount;
    }

    @Override
    public String toString() {
        return "Jural{" +
                super.toString() + ", " +
                "employersCount=" + employersCount +
                '}';
    }
}
