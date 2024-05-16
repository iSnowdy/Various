package TransportCompany.Build;

import TransportCompany.Domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {
        // First off generic vehicles

        Land land = new Land("5P89LTP", "T-1X", 4);
        Aquatic aquatic = new Aquatic("LSKHGFF", "Jet-Engine", 55);
        Airborne airborne = new Airborne("PYRT713549", "AirBus 220", 125);

        System.out.println(land.getLicensePlate());
        System.out.println();
        System.out.println();
        System.out.println(land.printInfo());
        System.out.println();
        System.out.println("Validating License Plates: \n");

        while(!land.checkLicensePlate()) {
            Scanner scanner = new Scanner(System.in);
            land.setLicensePlate(scanner.nextLine());
        }

        System.out.println(land.getLicensePlate());

        // Specific types of Vehicles

        Car car = new Car("9876PYZ", "VW Golf", 4, true);
        Submarine submarine = new Submarine("LADR", "War101", 20, 1000);
        Helicopter helicopter = new Helicopter("LMZT453532", "HeliPotter505", 4, 10);

        // System.out.println(car.printInfo());
        System.out.println();
        System.out.println();
        // System.out.println(helicopter.printInfo());

        System.out.println("------------");
        System.out.println("\nArray List Checks\n");
        System.out.println("------------");

        List<Vehicles> vehicles = new ArrayList<Vehicles>();
        vehicles.add(land);
        vehicles.add(aquatic);
        vehicles.add(airborne);
        vehicles.add(car);
        vehicles.add(submarine);
        vehicles.add(helicopter);

        for (int i = 0; i < vehicles.size(); i ++) {
            System.out.println(vehicles.get(i).printInfo() + "\n");
        }


    }
}
