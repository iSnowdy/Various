package TransportCompany.Domain;

public abstract class Vehicles {
    private String licensePlate;
    private final String model;

    public Vehicles() {
        this.licensePlate = "";
        this.model = "";
    }

    public Vehicles(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
    }

    // Method to check whether each type of Vehicle has a proper license
    // plate in 'em
    public abstract boolean checkLicensePlate();
    public abstract String printInfo();

    // Getters and Setters

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }
}
