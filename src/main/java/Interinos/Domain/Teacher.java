package Interinos.Domain;

public class Teacher extends Person {
    private String title;
    private double points;

    public Teacher() {}

    public Teacher(int id, String first_name, String sur_name, String last_name,
                   String title, double points) {

        super(id, first_name, sur_name, last_name);
        this.title = title;
        this.points = points;
    }

    @Override
    public String toString() {
        String output =
                super.toString() +
                "Title: " + getTitle() + "\n" +
                "Points: " + getPoints();
        return output;
    }

    @Override
    public int compareTo(Person person) {
        if (person instanceof Teacher) {
            return Double.compare(((Teacher) person).getPoints(), this.getPoints());
        }
        return -2;

      /*  if (this.getPoints() > ((Teacher) person).getPoints()) {
            return 1;
        } else if (this.getPoints() < ((Teacher) person).getPoints()) {
            return -1;
        } else {
            return 0;
        }*/
    }

    // Getters and Setters

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public double getPoints() {
        return points;
    }
    public void setPoints(double points) {
        this.points = points;
    }
}
