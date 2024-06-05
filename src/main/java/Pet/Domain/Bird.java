package Pet.Domain;

public abstract class Bird extends Pet {
    private boolean beak;
    private boolean flier;

    public Bird(String name, byte age, Status status, String dateOfBirth, boolean beak, boolean flier) {
        super(name, age, status, dateOfBirth);
        this.beak = beak;
        this.flier = flier;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return super.toString() +
                "Beak? " + isBeak() + "\n" +
                "Flier? " + isFlier() + "\n";
    }

    // Getters and Setters

    public boolean isBeak() {
        return beak;
    }
    public void setBeak(boolean beak) {
        this.beak = beak;
    }

    public boolean isFlier() {
        return flier;
    }
    public void setFlier(boolean flier) {
        this.flier = flier;
    }
}
