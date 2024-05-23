package Simulacro_3T;

public class Albaricoquero extends Frutal {
    private String color;
    private boolean grafted;

    public Albaricoquero(String name, int monthsOld,
                         boolean hasFruit, String leafColor,
                         String color, boolean grafted) {
        super(name, monthsOld, hasFruit, leafColor);
        this.color = color;
        this.grafted = grafted;
    }

    @Override
    public void happyBirthday() {
        setMonthsOld();
        System.out.println("Happy Birthday Mister Albaricoquero! It is now " + getMonthsOld() + " months old");
    }

    @Override
    public void giveFruit() {
        System.out.println("Amazing! The Albaricoquero has given fruits!");
        setHasFruit(true);
    }

    @Override
    public String toString() {
        String output =
                "Albaricoquero Information:\n" +
                        "Name: " + getName() + "\n" +
                        "This plant is: " + getMonthsOld() + " months old\n" +
                        "Albaricoquero Status: " + getStatus() + "\n" +
                        "Plant Type: " + getType() + "\n" +
                        "Albaricoquero Leaf Color: " + getLeafColor() + "\n" +
                        "Does it have fruits? " + this.isHasFruit() + "\n" +
                        "And grafts?" + this.grafted + "\n" +
                        "Albaricoquero Color: " + this.color;
        return output;
    }
}
