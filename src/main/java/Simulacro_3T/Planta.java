package Simulacro_3T;

public abstract class Planta {
    private String name;
    private int monthsOld;
    private String status;
    private String type;
    private static int counter;

    public enum PlantType {
        ALIVE,
        DEAD;

        public void display() {
            System.out.println("The plant is " + this);
        }
    }

    public Planta() {}

    public Planta(String name, int monthsOld) {
        this.name = name;
        this.monthsOld = monthsOld;
        this.status = String.valueOf(PlantType.ALIVE);

        PlantType.ALIVE.display();

        increaseCounter();
    }

    public abstract void happyBirthday();

    public void killPlant() {
        System.out.println("The plant has died");
        this.status = String.valueOf(PlantType.DEAD);
    }

    private static void increaseCounter() {
        counter++;
        System.out.println("The plant has been successfully added. Now there are " + counter + " plants");
    }

    @Override
    public String toString() {
        String output =
                "Plant Information:\n" +
                "Name: " + this.name + "\n" +
                "This plant is: " + this.monthsOld + " months old\n" +
                "Plant Status: " + this.status + "\n" +
                "Plant Type: " + this.type;
        return output;
    }

    // Getters and Setters

    public String getName() {
        return this.name;
    }
    public String getType() {
        return this.type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getMonthsOld() {
        return monthsOld;
    }
    public void setMonthsOld() {
        monthsOld ++;
    }
    public String getStatus() {
        return status;
    }
}
