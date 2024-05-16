package TransportCompany.Domain;

public class Bike extends Land {
    private String bikeColor;

    public Bike(String licensePlate, String model, int tireNumber, String bikeColor) {
        super(licensePlate, model, tireNumber);
        this.bikeColor = bikeColor;
    }

    @Override
    public String printInfo() {
        String result =
                "This Land Vehicle Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Number of Tires: " + getTireNumber() + "\n" +
                        "Bike Color: " + getBikeColor();

        return result;
    }

    // Getters and Setters

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
        this.bikeColor = bikeColor;
    }
}
