package Pet.Domain;

public class Cat extends Pet {
    private String color;
    private boolean longHair;

    public Cat(String name, byte age, Status status, String dateOfBirth, String color, boolean longHair) {
        super(name, age, status, dateOfBirth);
        this.color = color;
        this.longHair = longHair;
    }

    @Override
    public void talk() {
        System.out.println("Miauuu");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cat's color: " + getColor() + "\n" +
                "Long hair?" + isLongHair() + "\n";
    }

    // Getters and Setters

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLongHair() {
        return longHair;
    }
    public void setLongHair(boolean longHair) {
        this.longHair = longHair;
    }
}