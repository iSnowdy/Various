package Pet.Domain;

public class Canary extends Bird {
    private String color;
    private boolean singer;

    public Canary(String name, byte age, Status status, String dateOfBirth,
                  boolean beak, boolean flier, String color, boolean singer) {
        super(name, age, status, dateOfBirth, beak, flier);
        this.color = color;
        this.singer = singer;
    }

    @Override
    public void talk() {
        setStatus(Status.TALKING);
        System.out.println("Hey look! The Canary is talking!!");
        System.out.println("Pio pio");
    }

    @Override
    public void fly() {
        if (isFlier()) {
            setStatus(Status.FLYING);
            System.out.println("Amazing! This shitter is flying");
            System.out.println("Status: " + getStatus());
            setStatus(Status.ALIVE);
        } else {
            System.out.println("Too bad. This canary is a loser and can't fly");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Canary color: " + getColor() + "\n" +
                "Singer? " + isSinger() + "\n";
    }

    // Getters and Setters

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSinger() {
        return singer;
    }
    public void setSinger(boolean singer) {
        this.singer = singer;
    }
}