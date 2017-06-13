package by.gsu.lesson5;

public class Cat implements NamedEntity  {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
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
        if (!(o instanceof Cat)) {
            return 1;
        }

        Cat cat = (Cat) o;


        return this.getName().compareTo(cat.getName());
    }
}
