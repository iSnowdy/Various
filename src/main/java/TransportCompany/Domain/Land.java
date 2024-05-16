package TransportCompany.Domain;

import java.util.Scanner;

public class Land extends Vehicles {
    private final int tireNumber;

    public Land(String licensePlate, String model, int tireNumber) {
        super(licensePlate, model);
        this.tireNumber = tireNumber;
    }

    @Override
    public boolean checkLicensePlate() {
        boolean isValid = true;

        if (getLicensePlate().length() != 7) {
            System.out.println("The license plate format is invalid. Please Type in a new one: ");
            return false;
        }

        if (isValid) {
            for (int i = 0; i <= 3; i ++) {
                if (!(Character.isDigit(getLicensePlate().charAt(i)))) {
                    System.out.println("The license plate format is invalid. Please Type in a new one: ");
                    return false;
                }
            }
        }

        if (isValid) {
            for (int i = 4; i <= 6; i ++) {
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
                "This Land Vehicle Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Number of Tires: " + getTireNumber();

        return result;
    }

    // Getters and Setters

    public int getTireNumber() {
        return tireNumber;
    }
}
