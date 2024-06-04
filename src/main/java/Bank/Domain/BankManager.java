package Bank.Domain;

public class BankManager {
    public String name;
    private String tlp;
    double maxQtt;

    public BankManager(String name, String tlp) {
        this(name, tlp, 1000); // this() calls the other constructor depending on the parameters
    }

    public BankManager(String name, String tlp, double maxQtt) {
        this.name = name;
        this.tlp = tlp;
        this.maxQtt = maxQtt;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + tlp);
        System.out.println("Max quantity: " + maxQtt);
    }

    // Getters and Setters

    public String getTlp() {
        return this.tlp;
    }
}
