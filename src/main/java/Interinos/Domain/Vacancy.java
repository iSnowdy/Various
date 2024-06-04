package Interinos.Domain;

public class Vacancy {
    public enum VacancyType {
        TEACHER,
        DOCTOR;

        public void display() {
            System.out.println("The Vacancy type is " + this);
        }
    }
    private int id;
    private boolean allocated; // True = allocated
    private VacancyType vacancyType;
    private Person p;

    public Vacancy() {}

    public Vacancy(int id, VacancyType vacancyType) {
        this.id = id;
        setAllocated(false);
        this.vacancyType = vacancyType;
    }

    // Getters and Setters

    // ENUM getter
    public VacancyType getVacancyType() {
        return vacancyType;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public boolean isAllocated() {
        return allocated;
    }
    public void setAllocated(boolean allocated) {
        this.allocated = allocated;

        if (allocated) {
            // System.out.println("The vacancy has been filled");
        } else {
            // System.out.println("The vacancy is empty for now");
        }
    }


    public Person getPerson() {
        return p;
    }
    public void setPerson(Person person) {
        this.p = person;
        setAllocated(true);
    }

    @Override
    public String toString() {
        String texto =
                "------------------------------------\n"
                        + "ID Vacancy "+ this.getId()+"\n"
                        + "Type: " + this.getVacancyType() + "\n";
        if (this.isAllocated()) {
            texto = texto + "Allocated: ALLOCATED\n" +
                    "ID: "+ this.getPerson().getId() + "\n" +
                    "Name: "+ this.getPerson().getFirst_name() + "\n" +
                    "Sur Name: "+ this.getPerson().getSur_name() + "\n" +
                    "Last Name: "+ this.getPerson().getLast_name() + "\n";

            if (getVacancyType() == VacancyType.TEACHER) {
                texto = texto +
                        "Title: " + ((Teacher) this.getPerson()).getTitle() + "\n" +
                        "Points: " + ((Teacher) this.getPerson()).getTitle() + "\n"
                ;
            } else {
                texto = texto +
                        "Speciality: " + ((Doctor) this.getPerson()).getSpeciality() + "\n" +
                        "Days Worked: " + ((Doctor) this.getPerson()).getDaysWorked() + "\n";
            }
        } else {
            texto = texto + "Allocated: NOT ALLOCATED\n";
        }
        return texto;
    }
}
