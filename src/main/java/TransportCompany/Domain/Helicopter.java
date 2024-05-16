package TransportCompany.Domain;

public class Helicopter extends Airborne {
    private int helixAmount;

    public Helicopter(String licensePlate, String model, int seatAmount, int helixAmount) {
        super(licensePlate, model, seatAmount);
        this.helixAmount = helixAmount;
    }


    @Override
    public String printInfo() {
        String result =
                "This Helicopter Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Total Number of Seats " + getSeatAmount() + "\n" +
                        "Number of helixes: " + getHelixAmount();

        return result;
    }

    // Getters and Setters

    public int getHelixAmount() {
        return helixAmount;
    }

    public void setHelixAmount(int helixAmount) {
        this.helixAmount = helixAmount;
    }
}
