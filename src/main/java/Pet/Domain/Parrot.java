package Pet.Domain;

public class Parrot extends Bird {
    private String origin;
    private boolean talks;

    public Parrot(String name, byte age, Status status, String dateOfBirth,
                  boolean beak, boolean flier, String origin, boolean talks) {
        super(name, age, status, dateOfBirth, beak, flier);
        this.origin = origin;
        this.talks = talks;
    }

    @Override
    public void talk() {
        if (isTalks()) {
            setStatus(Status.TALKING);
            System.out.println("The parrot is about to talk!!");
            System.out.println("Stupid human - said the Parrot");
            System.out.println("Parrot status: " + getStatus());
            setStatus(Status.ALIVE);
        } else {
            System.out.println("This parrot can't talk. Booo");
        }
    }

    @Override
    public void fly() {
        if (isFlier()) {
            setStatus(Status.FLYING);
            System.out.println("Amazing! This stupid parrot is flying");
            System.out.println("Status: " + getStatus());
            setStatus(Status.ALIVE);
        } else {
            System.out.println("Too bad. This parrot is a loser and can't fly");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Origin: " + getOrigin() + "\n" +
                "Talks? " + isTalks() + "\n";
    }

    // Getters and Setters

    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public boolean isTalks() {
        return talks;
    }
    public void setTalks(boolean talks) {
        this.talks = talks;
    }
}