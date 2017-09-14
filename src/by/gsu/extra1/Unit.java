package by.gsu.extra1;

/**
 * Created by vasili on 07.09.17.
 */
public class Unit implements Comparable<Unit>{
    private int value;
    private UnitType type;

    public Unit(int value, UnitType type) {
        this.value = value;
        this.type = type;
    }

    public int getValueInMS() {
        int result = value;
        switch (type) {
            case mh: result *= 2; break;
            case kmh: result *= 5; break;
        }
        return result;
    }

    @Override
    public int compareTo(Unit o) {
        return Double.compare(this.getValueInMS(), o.getValueInMS());
    }

    @Override
    public String toString() {
        return value + " " + type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public UnitType getType() {
        return type;
    }

    public void setType(UnitType type) {
        this.type = type;
    }
}
