package by.gsu.lesson21;

import java.util.List;

public class User extends BaseEntity {
    private long id;

    @NotEmpty(false)
    public String name;

    @NotEmpty
    public List<Integer> someInts;

    public long getId() {
        System.out.println("getter invocation");

        return id;
    }


    public void setSomeInts(List<Integer> someInts) {
        this.someInts = someInts;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
