package TransportCompany.Domain;

import java.util.Scanner;

public class Airborne extends Vehicles {
    private final int seatAmount;

    public Airborne(String licensePlate, String model, int seatAmount) {
        super(licensePlate, model);
        this.seatAmount = seatAmount;
    }

    @Override
    public boolean checkLicensePlate() {
        boolean isValid = true;

        if (getLicensePlate().length() != 10) {
            System.out.println("The license plate format is invalid. Please Type in a new one: ");
            return false;
        }

            if (isValid) {
                for (int i = 0; i <= 3; i++) {
                    if (!(Character.isLetter(getLicensePlate().charAt(i)))) {
                        System.out.println("The license plate format is invalid. Please Type in a new one: ");
                        return false;
                    }
                }
            }

            if (isValid) {
                for (int i = 4; i <= 9; i++) {
                    if (!(Character.isLetter(getLicensePlate().charAt(i)))) {
                        System.out.println("The license plate format is invalid. Please Type in a new one: ");
                        return false;
                    }
                }
            }
        return true;
    }

    @Override
    public String printInfo() {
        String result =
                "This Airbone Vehicle Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Total Number of Seats " + getSeatAmount();

        return result;
    }

    // Getters and Setters

    public int getSeatAmount() {
        return seatAmount;
    }
}
