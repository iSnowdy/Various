package Classroom_PC.Domain;

import java.util.*;

public class DataStorage {
    private String CPU;
    private String GPU;
    private String RAM;
    private final int screenSize;
    private final Map<String, String> storage;
    private final String OS;
    private boolean status;

    public DataStorage() {
        this.CPU = "";
        this.GPU = "";
        this.RAM = "";
        this.screenSize = 0;
        this.storage = new HashMap<>();
        this.OS = "";
        this.status = false;
    }

    public DataStorage(String CPU, String GPU, String RAM, int screenSize, String OS) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.screenSize = screenSize;
        this.storage = new HashMap<>();
        this.OS = OS;

        this.status = true;

        if (!(Objects.equals(OS, "Windows"))) {
            System.out.println("Imagine not using Windows HAHA");
        }
    }

    public boolean isStatus() {
        return status;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public void playSomething() {
        if (!(this.status)) {
            System.out.println("Before you do anything, turn on the PC!!");
        } else {
            System.out.println("Welcome to this scuffed Rock-Paper-Scissors game!");
            Scanner scanner = new Scanner(System.in);
            String choice;
            String rules = "rockscissorspaperrockscissorspaper";

            System.out.println("Type rock/paper/scissors: ");
            choice = scanner.nextLine();

            String[] options = {"rock", "paper", "scissors"};
            Random random = new Random();
            int randomIndex = random.nextInt(options.length);
            String randomizedString = options[randomIndex];

            String result =
                    choice.equals(randomizedString) ? "Draw!" :(rules.contains(choice + randomizedString) ? "You have won! " : "You lost! Booo. Try again");

            System.out.println(result);
        }
    }

    // Getters and Setters

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public Map<String, String> getStorage() {
        return storage;
    }

    public void printStorage() {
        for (String part : storage.keySet()) {
            System.out.println("Storage Type: " + part + ". Size: " + storage.get(part));
        }
    }

    public void addStorage(String storageType, String size) {
        this.storage.put(storageType, size);
    }

    public String getOS() {
        return OS;
    }

    @Override
    public String toString() {
        return "This PC specs are:\n" +
                "CPU: " + getCPU() + "\n" +
                "GPU: " + getGPU() + "\n" +
                "RAM: " + getRAM() + "\n" +
                "Screen Size: " + getScreenSize() + "\n" +
                "Storage Info: " + this.storage.toString() + "\n" +
                "Operative System: " + getOS() + "\n";
    }
}
