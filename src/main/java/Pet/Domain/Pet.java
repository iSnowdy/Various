package Pet.Domain;

public abstract class Pet {
    public enum Status {
        ALIVE,
        DEAD,
        FLYING,
        SINGING,
        TALKING
    }
    private String name;
    private byte age;
    private Status status;
    private String dateOfBirth;

    public Pet(String name, byte age, Status status, String dateOfBirth) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.dateOfBirth = dateOfBirth;
    }

    public abstract void talk();

    public void death() {
        System.out.println("The pet just died :(");
        setStatus(Status.DEAD);
    }

    public void birthday() {
        setAge((byte) (getAge() + 1));
        System.out.println("Happy Birthday! Your pet is now " + getAge() + " years old");
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Age: " + getAge() + "\n" +
                "Status: " + getStatus() + "\n" +
                "Date of Birth: " + getDateOfBirth() + "\n";
    }

    // Getters and Setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }
    public void setAge(byte age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}