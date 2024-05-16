package TransportCompany.Domain;

import java.util.Scanner;

public class Aquatic extends Vehicles {
    private final int length;

    public Aquatic(String licensePlate, String model, int length) {
        super(licensePlate, model);
        this.length = length;
    }

    @Override
    public boolean checkLicensePlate() {
        boolean isValid = true;

        if (!((getLicensePlate().length()) < 3) && getLicensePlate().length() > 10) {
            System.out.println("The license plate format is invalid. Please Type in a new one: ");
            return false;
        }
        return true;
    }

    @Override
    public String printInfo() {
        String result =
                "This Aquatic Vehicle Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Length " + getLength();

        return result;
    }

    // Getters and Setters

    public int getLength() {
        return length;
    }
}
