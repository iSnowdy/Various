package Watch.Domain;

/*
Realiza una clase reloj que sea capaz de almacenar la hora de un reloj (hora, minuto y segundo)
y el modo en el que se mostrará la hora (versión 12 24 horas). Realiza los métodos habituales y
alguno especial que permita recargar pila. Sobrecarga el método toString para mostrar la hora.
*/

import java.util.Random;
import java.util.Scanner;

public class Watch {
    private int seconds;
    private int hours;
    private int minutes;
    private boolean chargeWatch;
    private final Random random;
    private String printTime;


    public Watch() {
        this.random = new Random();

        int randomInt = random.nextInt(5);
        switch (randomInt) {
            case 0, 1, 2 -> {
                System.out.println("The Watch Battery is Healthy :)");
                this.chargeWatch = true;
            }
            case 3, 4 -> {
                System.out.println("The Watch Battery is Dead x.x . Please recharge it before continuing...");
                this.chargeWatch = false;
            }
        }
    }

    public Watch(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
        this.random = new Random();

        int randomInt = random.nextInt(5);
        switch (randomInt) {
            case 0, 1, 2 -> {
                System.out.println("The Watch Battery is Healthy :)");
                this.chargeWatch = true;
            }
            case 3, 4 -> {
                System.out.println("The Watch Battery is Dead x.x . Please recharge it before continuing...");
                this.chargeWatch = false;
            }
        }
    }

    // Methods to askTime if the user didn't input the parameters/get them random and just print them
    public boolean askTime() {
        if (chargeWatch) {
            System.out.println("Type in the hour you wish to save...\n");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seconds: ");
            this.seconds = scanner.nextInt();

            System.out.println("Minutes: ");
            this.minutes = scanner.nextInt();

            System.out.println("Hour: ");
            this.hours = scanner.nextInt();

            System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
            return true;
        } else {
            System.out.println("You still haven't charged the Watch Battery! Do it using .charge() :D\n");
            return false;
        }
    }

    public boolean randomTime() {
        if (chargeWatch) {
            System.out.println("Generating random time...");
            this.seconds = random.nextInt(61);
            System.out.println("Seconds: " + seconds);

            this.minutes = random.nextInt(61);
            System.out.println("Minutes: " + minutes);

            this.hours = random.nextInt(25);
            System.out.println("Hour: " + hours);

            System.out.println(String.format("%02d:%02d:%02d", hours, minutes, seconds));
            return true;
        } else {
            System.out.println("You still haven't charged the Watch Battery! Do it using .setChargeWatch() :D\n");
            return false;
        }
    }

    public void printTime() {
        if (chargeWatch) {
            this.printTime = String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
            System.out.println(this.printTime);
        } else System.out.println("You still haven't charged the Watch Battery! Do it using .setChargeWatch() :D\n");
    }

    @Override
    public String toString() {
        return
            "Hours: " + this.getHours() + "\n" +
            "Minutes: " + this.getMinutes() + "\n" +
            "Seconds: " + this.getSeconds() + "\n"
            ;
    }

    // Getters & Setters

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public boolean getChargeWatch() {
        return chargeWatch;
    }
    public void setChargeWatch(boolean value) {
        this.chargeWatch = value;
    }
}
