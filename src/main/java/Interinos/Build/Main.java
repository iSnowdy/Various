package Interinos.Build;

import Interinos.Domain.Doctor;
import Interinos.Domain.Person;
import Interinos.Domain.Teacher;
import Interinos.Domain.Vacancy;

import java.util.*;

public class Main  {
    public static void showVacancies(List<Vacancy> vacancyList) {
        System.out.println("================================");
        System.out.println("Vacancies allocated to TEACHERS");
        System.out.println("================================");

        for (int i = 0; i < vacancyList.size(); i ++) {
            if (vacancyList.get(i).getVacancyType() == Vacancy.VacancyType.TEACHER) {
                System.out.println(vacancyList.get(i).toString());
            }
        }

        System.out.println("================================");
        System.out.println("Vacancies allocated to DOCTORS");
        System.out.println("================================");

        for (int j = 0; j < vacancyList.size(); j ++) {
            if (vacancyList.get(j).getVacancyType() == Vacancy.VacancyType.DOCTOR) {
                System.out.println(vacancyList.get(j).toString());
            }
        }
    }

    public static void adjudicateVacancies(List<Vacancy> vacancyList, List<Person> peopleList) {

        Collections.sort(peopleList);

        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();

        for (Person person : peopleList) {
            if (person instanceof Teacher) {
                teachers.add((Teacher) person);
            } else {
                doctors.add((Doctor) person);
            }
        }

        for (Vacancy vacancy : vacancyList) {
            if (!vacancy.isAllocated()) {
                if (vacancy.getVacancyType() == Vacancy.VacancyType.TEACHER) {
                    if (!(teachers.isEmpty())) {
                        vacancy.setPerson(teachers.get(0)); // 0 because we will remove it later on
                        teachers.remove(0);
                    } else {
                        System.out.println("No more available teachers to adjudicate a vacancy...");
                    }
                } else {
                    if (!(doctors.isEmpty())) {
                        vacancy.setPerson(doctors.get(0));
                        doctors.remove(0);
                        System.out.println("No more available doctors to adjudicate a vacancy...");
                    }
                }
            }
        }
    }

    public static void simulation(List<Vacancy> vacancyList, List<Person> personList) {
        String[][] vacancies = {
                {"0", "TEACHER"}, {"1", "DOCTOR"}, {"2", "TEACHER"}, {"3", "DOCTOR"},
                {"4", "TEACHER"}, {"5", "DOCTOR"}, {"6", "TEACHER"}, {"7", "DOCTOR"},
                {"8", "TEACHER"}, {"9", "DOCTOR"}
        };

        for (String[] vac : vacancies) {
            int id = Integer.parseInt(vac[0]);
            String vacancyType = vac[1];

            Vacancy vacancy = new Vacancy(id, vacancyType.equals("TEACHER") ? Vacancy.VacancyType.TEACHER : Vacancy.VacancyType.DOCTOR);
            vacancyList.add(vacancy);
        }

        // Using array of Objects just to try it. But we could also use a String
        // and then Integer/Double.parseInt the numbers

        Object[][] teachers = {
                {1, "Alejandro", "Sánchez", "Molinos", "Matemático", 5.1},
                {2, "Miguel", "Gómez", "Olvedo", "Programador", 4.5},
                {3, "Luis", "Ángel", "Ventura", "Historiador", 9.1},
                {4, "Kafka", "Torre", "Molinas", "Matemático", 8.9}
        };

        Object[][] doctors = {
                {1, "Pepito", "Papito", "Pimpin", "Cardiólogo", 155},
                {2, "Pablo", "Motos", "Motero", "Oftalmólogo", 54},
                {3, "Laura", "Jac", "Into", "Cirujana", 26}
        };

        for (Object[] teach : teachers) {
            // We must cast to each type of Data Type because when we recover data from an Object, they are treated as such
            int id = (int) teach[0];
            String name = (String) teach[1];
            String sur_name = (String) teach[2];
            String last_name = (String) teach[3];
            String title = (String) teach[4];
            double points = (double) teach[5];

            Person teacher = new Teacher(id, name, sur_name, last_name, title, points);
            personList.add(teacher);
        }

        for (Object[] doc : doctors) {
            int id = (int) doc[0];
            String name = (String) doc[1];
            String sur_name = (String) doc[2];
            String last_name = (String) doc[3];
            String speciality = (String) doc[4];
            int daysWorked = (int) doc[5];

            Person doct = new Doctor(id, name, sur_name, last_name, speciality, daysWorked);
            personList.add(doct);
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<Person>();
        List<Vacancy> vacancies = new ArrayList<Vacancy>();

        simulation(vacancies, people);

        // showVacancies(vacancies);
        System.out.println();

        adjudicateVacancies(vacancies, people);

        showVacancies(vacancies);
        // System.out.println(vacancies.size());

        // for (Person p : people) System.out.println(p.toString());

        // for (Vacancy v : vacancies) System.out.println(v.toString());
    }
}
