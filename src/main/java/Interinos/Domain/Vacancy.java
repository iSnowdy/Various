package Interinos.Domain;

import java.util.*;

public class Vacancy {
    private int id;
    private boolean allocated; // True = allocated
    public enum VacancyType {
        TEACHER,
        DOCTOR;

        public void display() {
            System.out.println("The Vacancy type is " + this);
        }
    }
    private String vType;
    private Person p;

    public Vacancy() {}

    public Vacancy(int id, boolean allocated, VacancyType vacancyType) {
        this.id = id;
        // this.vacancies = new ArrayList<Vacancy>();

        setEmptyVacancyType(vacancyType);

        setAllocated(false);
    }

    public Vacancy(int id, boolean allocated, Person person) {
        this.id = id;
        this.p = person;
        // this.vacancies = new ArrayList<Vacancy>();

        setAllocated(true);
        setVacancyType();

        // this.people = new ArrayList<Person>();
    }

    // What kind of Person are we dealing with

    public void setEmptyVacancyType(VacancyType vacancyType) {
        switch (vacancyType) {
            case TEACHER -> setvType("TEACHER");
            case DOCTOR -> setvType("DOCTOR");
        }
    }
    private void setVacancyType() {
        if (p instanceof Teacher) {
            setvType("Teacher");
            //System.out.println("Person type:" + getvType());
        } else if (p instanceof Doctor) {
            setvType("Doctor");
            //System.out.println("Person type:" + getvType());
        } else {
            setvType("Unknown");
            //System.out.println("Person type:" + getvType());
        }
    }

    // Getters and Setters

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

    public String getvType() {
        return vType;
    }
    public void setvType(String vType) {
        this.vType = vType;
    }
}
