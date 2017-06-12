package by.gsu.lesson4;

public class AviaEngine extends Engine {

    private String fuel;

    public AviaEngine(int power, int weight, String fuel) {
        super(power, weight);
        this.fuel = fuel;
    }

    public AviaEngine() {
        super(1, 2);
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

}
