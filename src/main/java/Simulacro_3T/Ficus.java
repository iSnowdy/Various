package Simulacro_3T;

public class Ficus extends Planta {
    private final String origin;
    private double size;

    public Ficus() {
        this.origin = "Unkwown";
    }

    public Ficus(String name, int monthsOld, String origin, double size) {
        super(name, monthsOld);
        this.origin = origin;
        this.size = size;
    }

    @Override
    public void happyBirthday() {
        setMonthsOld();
        System.out.println("Happy Birthday Mister Ficus! It is now " + getMonthsOld() + " months old");
    }

    @Override
    public String toString() {
        String output =
                "Ficus Information:\n" +
                        "Name: " + getName() + "\n" +
                        "This plant is: " + getMonthsOld() + " months old\n" +
                        "Ficus Status: " + getStatus() + "\n" +
                        "Plant Type: " + getType() + "\n" +
                        "Ficus Origin: " + this.origin + "\n" +
                        "Ficus Size: " + this.size;
        return output;
    }
}