package Interinos.Build;

import Interinos.Domain.Doctor;
import Interinos.Domain.Person;
import Interinos.Domain.Teacher;
import Interinos.Domain.Vacancy;

import java.util.*;

public class Main  {
    public static void printVacancies(Vacancy vacancy) {
        System.out.print("Vacancy ID: " + vacancy.getId() + "\n");
        System.out.print("Vacancy Type: " + vacancy.getvType() + "\n");
        System.out.print("Allocated: " + vacancy.isAllocated() + "\n");
    }
    public static void showVacancies(List<Vacancy> vacancyList, List<Person> peopleList) {
        System.out.println("================================");
        System.out.println("Vacancies allocated to TEACHERS");
        System.out.println("================================");

        // System.out.println(peopleList.get(2).toString());;

        for (int i = 0; i < vacancyList.size(); i ++) {
            if (Objects.equals(vacancyList.get(i).getvType(), "TEACHER")) {
                if (vacancyList.get(i).isAllocated()) {
                    printVacancies(vacancyList.get(i));
                    for (int j = 0; j < peopleList.size(); i ++) {
                        if (peopleList.get(j) instanceof Teacher) {
                            System.out.println(peopleList.get(j).toString());
                        }
                    }
                    System.out.println("-----------------------------");
                } else {
                    printVacancies(vacancyList.get(i));
                    System.out.println("-----------------------------");
                }
            }
        }

        System.out.println("================================");
        System.out.println("Vacancies allocated to DOCTORS");
        System.out.println("================================");

        for (int i = 0; i < vacancyList.size(); i ++) {
            if (Objects.equals(vacancyList.get(i).getvType(), "DOCTOR")) {
                if (vacancyList.get(i).isAllocated()) {
                    printVacancies(vacancyList.get(i));
                    for (int j = 0; j < peopleList.size(); j ++) {
                        if (peopleList.get(j) instanceof Doctor) {
                            System.out.println(peopleList.get(i).toString());
                        }
                    }
                    System.out.println("-----------------------------");
                } else {
                    printVacancies(vacancyList.get(i));
                    System.out.println("-----------------------------");
                }
            }
        }
    }

    public static void adjudicateVacancies(List<Vacancy> vacancyList, List<Person> peopleList) {

        // Sorts
       /* Collections.sort(vacancyList, new Comparator<Vacancy>() {
            @Override
            public int compare(Vacancy o1, Vacancy o2) {
                return o1.getId() - o2.getId();
            }
        });*/

        Collections.sort(peopleList);

        System.out.println("**************************");
        for (Person p : peopleList) {
            if (p instanceof Teacher) {
                System.out.println("Teacher Points:");
                System.out.println(((Teacher) p).getPoints());
            } else if (p instanceof Doctor) {
                System.out.println("Doctor's Days Worked");
                System.out.println(((Doctor) p).getDaysWorked());
            }
        }
        System.out.println("**************************\n");


        System.out.println("--------------------------");
        for (Vacancy v : vacancyList) {
            System.out.println("Vacancies ID: ");
            System.out.println(v.getId());
        }
        System.out.println("--------------------------\n");



        for (int i = 0; i < vacancyList.size(); i ++) {
            if (!(vacancyList.get(i).isAllocated())) {
                if (peopleList.get(i) instanceof Teacher) {
                    vacancyList.get(i).setEmptyVacancyType(Vacancy.VacancyType.TEACHER);
                } else if (peopleList.get(i) instanceof Doctor) {
                    vacancyList.get(i).setEmptyVacancyType(Vacancy.VacancyType.DOCTOR);
                }
            }
        }
    }

    public static void main(String[] args) {

        Person p1 = new Teacher(1, "Alejandro", "Sánchez",
                "Molinos", "Matemático", 5.1);

        Person p2 = new Teacher(2, "Miguel", "Gómez",
                "Olvedo", "Programador", 4.5);

        Person p3 = new Teacher(3, "Luis", "Ángel",
                "Ventura", "Historiador", 9.1);

        Person p4 = new Teacher(4, "Kafka", "Torre",
                "Molinas", "Matemático", 8.9);


        Person p5 = new Doctor(1, "Pepito", "Papito",
                "Pimpin", "Cardiólogo", 152);

        Person p6 = new Doctor(2, "Pablo", "Motos",
                "Motero", "Oftalmólogo", 54);

        Person p7 = new Doctor(3, "Laura", "Jac",
                "Into", "Cirujana", 26);


        Vacancy v1 = new Vacancy(1, false, Vacancy.VacancyType.TEACHER);
        Vacancy v2 = new Vacancy(2, false, Vacancy.VacancyType.TEACHER);
        Vacancy v3 = new Vacancy(3, false, Vacancy.VacancyType.TEACHER);
        Vacancy v4 = new Vacancy(4, false, Vacancy.VacancyType.DOCTOR);
        Vacancy v5 = new Vacancy(5, false, Vacancy.VacancyType.DOCTOR);

        Vacancy v6 = new Vacancy(6, true, p1);
        Vacancy v7 = new Vacancy(7, true, p2);
        Vacancy v8 = new Vacancy(8, true, p3);
        Vacancy v9 = new Vacancy(9, true, p4);

        Vacancy v10 = new Vacancy(10, true, p5);
        Vacancy v11 = new Vacancy(11, true, p6);
        Vacancy v12 = new Vacancy(12, true, p7);

        List<Person> people = new ArrayList<Person>();
        List<Vacancy> vacancies = new ArrayList<Vacancy>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);
        people.add(p7);

        vacancies.add(v1);
        vacancies.add(v2);
        vacancies.add(v3);
        vacancies.add(v4);
        vacancies.add(v5);
        vacancies.add(v6);
        vacancies.add(v7);
        vacancies.add(v8);
        vacancies.add(v9);
        vacancies.add(v10);
        vacancies.add(v11);
        vacancies.add(v12);

        showVacancies(vacancies, people);
        System.out.println();

        adjudicateVacancies(vacancies, people);

        showVacancies(vacancies, people);
    }
}
