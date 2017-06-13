package by.gsu.lesson5;

public class Person implements NamedEntity {
    private String fio;
    private int age;
    private boolean isMale;

    public Person() {
    }

    public Person(String fio, int age, boolean isMale) {
        this.fio = fio;
        this.age = age;
        this.isMale = isMale;
    }

    @Override
    public String getName() {
        return getFio();
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }

        if (!(o instanceof Person)) {
            return false;
        }

        Person other = (Person) o;

        if (!this.getFio().equals((other.getFio()))) {
            return false;
        }

        if (!(this.getAge() == other.getAge())) {
            return false;
        }

        if (!(this.isMale() && other.isMale())) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = 31 * age;

//        if (isMale) {
//            result += 1;
//        } else {
//            result += -1;
//        }
//
        result += isMale ? -1 : 1;

        result += 31 * fio.hashCode();

        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o == null) {
            return -1;
        }
        if (!(o instanceof Person)) {
            return 1;
        }

        Person person = (Person) o;


        return this.getName().compareTo(person.getName());
    }
}
