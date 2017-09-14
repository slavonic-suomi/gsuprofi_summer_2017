package by.gsu.extra1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by vasili on 07.09.17.
 */
public class Main {

    public static final String[] in = {
            "1 mh",
            "2 kmh",
            "3 kmh",
            "1 mh",
            "1 mh",
            "5 ms"
    };

    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();

        for (String s : in) {
            String[] input = s.split(" ");
            int value = Integer.valueOf(input[0]);
            UnitType unitType = UnitType.valueOf(input[1]);

            Unit unit = new Unit(value, unitType);
            units.add(unit);
        }

        for (Unit unit : units) {
            System.out.println(unit.toString() + " = " + unit.getValueInMS() + " ms" );
        }

        Collections.sort(units);
        System.out.println("============");
        for (Unit unit : units) {
            System.out.println(unit);
        }

        System.out.println("============");

        Collections.sort(units, new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                int result = o1.getType().compareTo(o2.getType());
                if (result == 0) {
                    result = -o1.compareTo(o2);
                }

                return result;
            }
        });

        for (Unit unit : units) {
            System.out.println(unit);
        }

    }
}
