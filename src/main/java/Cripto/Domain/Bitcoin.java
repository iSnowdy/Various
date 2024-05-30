package Cripto.Domain;

public class Bitcoin extends Coin {
    private int nodesNumber;
    private int id;
    private static int globalID;

    public Bitcoin(int currentValue) {
        super(currentValue);
    }
    public Bitcoin(int currentValue, int nodesNumber) {
        super(currentValue);
        this.nodesNumber = nodesNumber;

        globalIDIncreaser();
        this.id = globalID;
        System.out.println("The BitCoin has been successfully created. The ID number is: " + this.id);
    }

    private static void globalIDIncreaser() {
        globalID ++;
    }

    @Override
    public String print() {
        String output =
                "Bitcoin Information:\n" +
                super.toString() + "\n" +
                "Bitcoin ID: " + this.id + "\n" +
                "Nodes Number: " + getNodesNumber();

        return output;
    }

    @Override
    public String toString() {
        String output =
                "Bitcoin Information:\n" +
                        super.toString() + "\n" +
                        "Bitcoin ID: " + this.id + "\n" +
                        "Nodes Number: " + getNodesNumber() + "\n";

        return output;
    }

    // Interface Methods

    @Override
    public int applyFluctuation(double fluctuation) {
        this.setCurrentValue((int) (calculateCurrentValue() * (1 + fluctuation)));
        return this.getCurrentValue();
    }
    @Override
    public int calculateCurrentValue() {
        return Math.abs(getCurrentValue());
    }
    @Override
    public int calculateFutureValue(double value) {
        int futureValue = (int) (this.getCurrentValue() * value);
        return futureValue;
    }

    // Getters and Setters
    public int getNodesNumber() {
        return this.nodesNumber;
    }
    public void setNodesNumber(int nodesNumber) {
        this.nodesNumber = nodesNumber;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
