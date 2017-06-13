package by.gsu.lesson5;

public class JurPerson extends Person {
    private String inn;

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        JurPerson jurPerson = (JurPerson) o;

        return inn != null ? inn.equals(jurPerson.inn) : jurPerson.inn == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (inn != null ? inn.hashCode() : 0);
        return result;
    }
}
