package by.gsu.lesson2.animals;


public class Cat extends Animal {
    private int caughtMouses = 0;

    public void catchMouse() {
        caughtMouses++;
    }

    public int getОбъём() {
        int result = weight / 1 ;// масса плотность %);
        return result;
    }

    String getName() {
        return name;
    }

    public void покормить(int foodWeight) {
        weight += foodWeight;
    }


}
