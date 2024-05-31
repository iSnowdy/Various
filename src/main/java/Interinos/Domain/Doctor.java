package Interinos.Domain;

public class Doctor extends Person {
    private String speciality;
    private int daysWorked;

    public Doctor() {}

    public Doctor(int id, String first_name, String sur_name, String last_name,
                  String speciality, int daysWorked) {

        super(id, first_name, sur_name, last_name);
        this.speciality = speciality;
        this.daysWorked = daysWorked;
    }

    @Override
    public String toString() {
        String output =
                super.toString() +
                "Speciality: " + getSpeciality() + "\n" +
                "Days Worked: " + getDaysWorked();
        return output;
    }

    @Override
    public int compareTo(Person person) {
        if (person instanceof Doctor) {
            return Integer.compare(((Doctor) person).daysWorked, this.getDaysWorked());
        }
        return -2;
    }

    // Getters and Setters

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getDaysWorked() {
        return daysWorked;
    }
    public void setDaysWorked(int daysWorked) {
        this.daysWorked = daysWorked;
    }
}
