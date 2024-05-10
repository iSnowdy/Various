package Car.Build;

import Car.Domain.Car;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car1 = new Car("Opel Corsa", "GSLine", "Blue", "7777-LZY");

        while(!(car1.isEngineState())) {
            System.out.println("You must turn on the engine first!");
            System.out.println("Would you like to? Y/N");
            String choice = scanner.nextLine();
            if (Objects.equals(choice.toLowerCase(), "y")) {
                car1.turnOnEngine();
            }
        }
        System.out.println("Preparing to accelerate the car...\n");
        car1.accelerate();

        System.out.println("Decelerating now...\n");
        car1.countDown();
    }
}
