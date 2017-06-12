package by.gsu.lesson4;

import java.util.Scanner;

public class Lesson4Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(10, 20);

        engine1.setPower(10);

        System.out.println(engine1.getPower());

        int x = 10;
        engine1.setCost( x * engine1.getPower() );

        AviaEngine aviaEngine1 = new AviaEngine();

        aviaEngine1.setWeight(10);

        Scanner scanner = new Scanner(System.in);
//        String fuel = scanner.nextLine();
//        AviaEngine aviaEngine2 = new AviaEngine(0, 1, fuel);

        ScannerWrapper wrapper = new ScannerWrapper();
        int weight3 = wrapper.readInt();
        String fuel3 = wrapper.readLine();
        AviaEngine aviaEngine3 = new AviaEngine(0,1,fuel3);

    }
}
