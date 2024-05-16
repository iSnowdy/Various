package Classroom_PC.Domain;

import java.util.ArrayList;
import java.util.List;

public class Classroom_PC {
    private final String className;
    private final String classCourse;
    private final List<DataStorage> PCs;

    public Classroom_PC() {
        this.className = "";
        this.classCourse = "";

        this.PCs = new ArrayList<DataStorage>();
    }

    public Classroom_PC(String className, String classCourse) {
        this.className = className;
        this.classCourse = classCourse;

        this.PCs = new ArrayList<DataStorage>();
    }

    public void addPC(DataStorage dataStorage) {
        this.PCs.add(dataStorage);
    }

    public void removePC(DataStorage dataStorage) {
        this.PCs.remove(dataStorage);
    }

    public int amountOfPCs() {
        return this.PCs.size();
    }

    @Override
    public String toString() {
        return "\nPC's in " + this.className + ", course " + this.classCourse + ":\n\n" + PCs;
    }

    // Getters and Setters

    public String getClassName() {
        return className;
    }

    public String getClassCourse() {
        return classCourse;
    }
}
