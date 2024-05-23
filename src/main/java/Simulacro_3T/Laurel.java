package Simulacro_3T;

public class Laurel extends Planta {
    private String barkColor;

    public Laurel() {}

    public Laurel(String name, int monthsOld, String barkColor) {
        super(name, monthsOld);
        this.barkColor = barkColor;
    }

    @Override
    public void happyBirthday() {
        setMonthsOld();
        System.out.println("Happy Birthday Miss Laurel! It is now " + getMonthsOld() + " months old");
    }

    @Override
    public String toString() {
        String output =
                "Laurel Information:\n" +
                        "Name: " + getName() + "\n" +
                        "This plant is: " + getMonthsOld() + " months old\n" +
                        "Laurel Status: " + getStatus() + "\n" +
                        "Plant Type: " + getType() + "\n" +
                        "Bark Color: " + this.barkColor;
        return output;
    }
}