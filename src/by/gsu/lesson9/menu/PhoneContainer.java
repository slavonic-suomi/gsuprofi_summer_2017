package by.gsu.lesson9.menu;

public class PhoneContainer {
    private Phone[] phones;

    public void add(Phone phone) {

    }

    public void delete(long id) {}

    public void update(long id, Phone newPhone) {}

    //это плохо
    public Phone[] getAll() { return phones; }
}
