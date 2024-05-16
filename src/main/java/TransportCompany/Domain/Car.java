package TransportCompany.Domain;

public class Car extends Land {
    private boolean airCon;

    public Car(String licensePlate, String model, int tireNumber, boolean airCon) {
        super(licensePlate, model, tireNumber);
        this.airCon = airCon;
    }


    @Override
    public String printInfo() {
        String result =
                "This Car Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Number of Tires: " + getTireNumber() + "\n" +
                        "Does it have aircon? " + isAirCon();

        return result;
    }

    // Getters and Setters

    public boolean isAirCon() {
        return airCon;
    }

    public void setAirCon(boolean airCon) {
        this.airCon = airCon;
    }
}
