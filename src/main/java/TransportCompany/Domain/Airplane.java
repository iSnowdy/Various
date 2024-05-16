package TransportCompany.Domain;

public class Airplane extends Airborne {
    private int maxAirTime;
    
    public Airplane(String licensePlate, String model, int seatAmount, int maxAirTime) {
        super(licensePlate, model, seatAmount);
        this.maxAirTime = maxAirTime;
    }


    @Override
    public String printInfo() {
        String result =
                "This Airplane Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Total Number of Seats " + getSeatAmount() + "\n" +
                        "Max Airtime: " + getMaxAirTime();

        return result;
    }


    // Getters and Setters

    public int getMaxAirTime() {
        return maxAirTime;
    }

    public void setMaxAirTime(int maxAirTime) {
        this.maxAirTime = maxAirTime;
    }
}
