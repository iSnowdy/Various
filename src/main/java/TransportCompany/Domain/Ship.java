package TransportCompany.Domain;

public class Ship extends Aquatic {
    private boolean hasEngine;
    
    public Ship(String licensePlate, String model, int length, boolean hasEngine) {
        super(licensePlate, model, length);
        this.hasEngine = hasEngine;
    }

    @Override
    public String printInfo() {
        String result =
                "This Ship Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Ship's Length " + getLength() + "\n" +
                        "Does it have an engine? " + isHasEngine();

        return result;
    }

    // Getters and Setters

    public boolean isHasEngine() {
        return hasEngine;
    }

    public void setHasEngine(boolean hasEngine) {
        this.hasEngine = hasEngine;
    }
}