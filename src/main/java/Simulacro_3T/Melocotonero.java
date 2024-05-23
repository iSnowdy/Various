package Simulacro_3T;

public class Melocotonero extends Frutal {
    private String variety;
    private boolean hasPlague;

    public Melocotonero(String name, int monthsOld,
                        boolean hasFruit, String leafColor,
                        String variety, boolean hasPlague) {
        super(name, monthsOld, hasFruit, leafColor);
        this.variety = variety;
        this.hasPlague = hasPlague;
    }

    @Override
    public void happyBirthday() {
        setMonthsOld();
        System.out.println("Happy Birthday Mister Melocotonero! It is now " + getMonthsOld() + " months old");
    }

    @Override
    public void giveFruit() {
        System.out.println("Amazing! The melocotonero has given fruits!");
        setHasFruit(true);
    }

    @Override
    public String toString() {
        String output1 =
                "Melocotonero Information:\n" +
                        "Name: " + getName() + "\n" +
                        "This plant is: " + getMonthsOld() + " months old\n" +
                        "Melocotonero Status: " + getStatus() + "\n" +
                        "Plant Type: " + getType() + "\n" +
                        "Melocotonero Leaf Color: " + getLeafColor() + "\n" +
                        "Does it have fruits? " + this.isHasFruit() + "\n" +
                        "And plague?" + this.hasPlague + "\n" +
                        "Melocotonery Variety: " + this.variety;

        String output =
                "Melocotonero Information with Super:\n" +
                        super.toString() + "\n" +
                        "Does it have fruits? " + this.isHasFruit() + "\n" +
                        "And plague?" + this.hasPlague + "\n" +
                        "Melocotonery Variety: " + this.variety;

        return output;
    }
}
