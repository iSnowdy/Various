package TransportCompany.Domain;

public class Submarine extends Aquatic {
    private int maxDepth;
    
    public Submarine(String licensePlate, String model, int length, int maxDepth) {
        super(licensePlate, model, length);
        this.maxDepth = maxDepth;
    }

    @Override
    public String printInfo() {
        String result =
                "This Submarine Information is: \n" +
                        "License Plate: " + getLicensePlate() + "\n" +
                        "Model: " + getModel() + "\n" +
                        "Submarine's Length " + getLength() + "\n" +
                        "Reachable Max Depth: " + getMaxDepth();

        return result;
    }

    // Getters and Setters

    public int getMaxDepth() {
        return maxDepth;
    }

    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }
}
