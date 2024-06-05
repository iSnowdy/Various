package Pet.Domain;

public class Doggo extends Pet {
    private String breed;
    private boolean ticks;

    public Doggo(String name, byte age, Status status, String dateOfBirth, String breed, boolean ticks) {
        super(name, age, status, dateOfBirth);
        this.breed = breed;
        this.ticks = ticks;
    }

    @Override
    public void talk() {
        System.out.println("Guau guau!");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Dog Breed: " + getBreed() + "\n" +
                "Ticks? " + isTicks() + "\n";
    }

    // Getters and Setters

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isTicks() {
        return ticks;
    }
    public void setTicks(boolean ticks) {
        this.ticks = ticks;
    }
}