package Interinos.Domain;

public abstract class Person implements Comparable<Person> {
    private int id;
    private String first_name;
    private String sur_name;
    private String last_name;
    public static int counter;

    public Person() {}

    public Person(int id, String first_name, String sur_name, String last_name) {
        this.id = id;
        this.first_name = first_name;
        this.sur_name = sur_name;
        this.last_name = last_name;

        increaseCounter();
    }

    private static void increaseCounter() {
        counter ++;
        //System.out.println("The person has been successfully added. Counter: " + counter);
    }

    @Override
    public String toString() {
        String output =
                "Name: " + getFirst_name() + "\n" +
                "Sur Name: " + getSur_name() + "\n" +
                "Last Name: " + getSur_name() + "\n";
        return output;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSur_name() {
        return sur_name;
    }
    public void setSur_name(String sur_name) {
        this.sur_name = sur_name;
    }

    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}