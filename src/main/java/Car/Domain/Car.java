package Car.Domain;

/*
Realiza una clase coche que tenga los atributos necesarios que permitan reflejar su marca, modelo, color y
matrícula. También debe almacenar información acerca de sus características de movimiento: motor encendido
o apagado, marchaActual, velocidadActual, subirMarcha, bajarMarcha y aquellos que creas conveniente para
manipular su información dinámica.
Crea los métodos habituales que creas conveniente y, además, los métodos necesarios que nos permitan
simular lo siguiente:

a) El coche parte de una situación de reposo.
b) Arranca.
c) Acelera e irá subiendo marchas hasta llegar a una velocidad que se ha pedido por
teclado al usuario.
d) Se mantiene esa velocidad un tiempo que se ha pedido al usuario por teclado.
e) Se va desacelerando y bajando marchas hasta que el coche se pare.
f) Punto muerto y paramos el motor.
Para hacer la simulación tendremos en cuenta:
• Rangos de marcha: 1ª 0 – 30; 2ª 30 – 50; 3ª 50 – 70; 4ª 70 – 100; 5ª 100 →
• El 10% de las veces se nos cruza un gato. Para evitar pillarlo pegamos un frenazo que para el coche y
cala el motor.
*/

import Rational.Domain.Rational;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final String plate;
    private boolean engineState;
    private final int[] gear = {1, 2, 3, 4, 5};
    private final Map<Integer, Integer> gearSpeed;
    private int currentGear;
    private int currentSpeed;
    private boolean gearState;

    private int time;

    Scanner scanner = new Scanner(System.in);


    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.plate = "";

        System.out.println("Car has been created. Engine is off");
        this.engineState = false;

        this.gearSpeed = new LinkedHashMap<>();
    }

    public Car(String brand, String model, String color, String plate) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plate = plate;

        System.out.println("Car has been created. Engine is off");
        this.engineState = false;

        this.gearSpeed = new LinkedHashMap<>();
        setGearSpeed();
    }

    public void setGearSpeed() {
        this.gearSpeed.put(1, 30);
        this.gearSpeed.put(2, 50);
        this.gearSpeed.put(3, 70);
        this.gearSpeed.put(4, 100);
        this.gearSpeed.put(5, 101);
    }

    public void turnOnEngine() {
        this.engineState = true;
    }
    public void turnOffEngine() {
        this.engineState = false;
    }

    public void accelerate() {
        System.out.println("Brum brum brum... To what speed would you like to" +
                " set the Car? ");
        int desiredSpeed = scanner.nextInt();
        System.out.println("And for how long will the Car be at that speed? (seconds) ");
        setTime(scanner.nextInt());

        if (isEngineState()) {
            while (getCurrentSpeed() < desiredSpeed) {
                if (!avoidCat()) {
                    if (getCurrentSpeed() < desiredSpeed) {
                        System.out.println("Accelerating... current speed is " + getCurrentSpeed() + " and gear " + getCurrentGear());
                        setCurrentSpeed(10);
                        setCurrentGear(1);
                    }
                } else {
                    System.out.println("------- Event -------");
                }
            }
        }


        /*while (getCurrentSpeed() <= desiredSpeed) {
            for (Map.Entry<Integer, Integer> entry : this.gearSpeed.entrySet()) {
                int speedAsOfNow = getCurrentSpeed();
                System.out.println("Accelerating... gear change to " + entry.getKey());
                if (!(avoidCat())) {
                    if (getCurrentSpeed() >= entry.getValue()) {
                        this.setCurrentGear(entry.getKey());
                        this.setCurrentSpeed(desiredSpeed);
                        break;
                    } else {
                        setCurrentSpeed(30);
                    }
                } else {
                    setCurrentSpeed(desiredSpeed);
                }
            }
        }*/
        /*
        // Iteration through the LinkedHashMap to search matches
        while (getCurrentSpeed() <= desiredSpeed) {
            for (Map.Entry<Integer, Integer> entry : this.gearSpeed.entrySet()) {
                setCurrentSpeed(getCurrentGear() + 5);
                System.out.println("Accelerating... gear change to " + entry.getKey());
                if (avoidCat()) {
                    break;
                }
                if (desiredSpeed <= entry.getValue()) {
                    this.currentGear = entry.getKey();
                    setCurrentSpeed(desiredSpeed);
                    break;
                }
            }
        }*/
        // setCurrentSpeed(getCurrentSpeed() * 0 + (desiredSpeed));
        System.out.println("After accelerating to " + getCurrentSpeed() + " the Car gear is set to " + getCurrentGear());
        System.out.println("It will remain at this speed for " + getTime() + " seconds");
    }

    public void countDown() {
        ScheduledExecutorService SCHEDULER = Executors.newScheduledThreadPool(1);
        Runnable runnable = new Runnable() {
            int countDownStart = getTime();
            @Override
            public void run() {
                System.out.println(countDownStart);
                countDownStart --;

                if (countDownStart <= 0) {
                    System.out.println("Time is up! Time to decrease the Car's speed to 0");
                    decelerate();
                    System.out.println("Shutting down the Car...");
                    turnOffEngine();
                    SCHEDULER.shutdown();
                }
            }
        };
        SCHEDULER.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
    }

    public void decelerate() {
        int desiredSpeed = 0;

        while (getCurrentSpeed() > desiredSpeed) {
            if (getCurrentSpeed() > desiredSpeed) {
                System.out.println("Decelerating... current speed is " + getCurrentSpeed() + " and gear " + getCurrentGear());
                setCurrentSpeed(-20);
                setCurrentGear(-1);
            }
        }


        /*while (getCurrentSpeed() >= desiredSpeed) {
            for (Map.Entry<Integer, Integer> entry : this.gearSpeed.entrySet()) {
                System.out.println("Decelerating... gear change to " + entry.getKey());
                if (getCurrentSpeed() <= entry.getValue()) {
                    this.currentGear = entry.getKey();
                }
            }
        }
        while (getCurrentSpeed() != desiredSpeed) {
            for (Map.Entry<Integer, Integer> entry : this.gearSpeed.entrySet()) {
                System.out.println("Decelerating... gear change to " + entry.getKey());
                if (getCurrentSpeed() >= entry.getValue()) {
                    this.setCurrentGear(entry.getKey());
                    break;
                } else {
                    setCurrentSpeed(getCurrentGear() - 5);
                }
            }
        }*/
    }

    public boolean avoidCat() {
        Random random = new Random();
        double randomNumber = random.nextDouble();
        if (randomNumber <= 0.1) {
            System.out.println("A caaat!!!! *Brakes extremely hard*");
            turnOffEngine();
            System.out.println("You have avoided the cat. But your Car has stalled :(");
            return true;
        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getPlate() {
        return plate;
    }

    public boolean isEngineState() {
        return engineState;
    }


    public int[] getGear() {
        return gear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear += currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed += currentSpeed;
    }

    public boolean isGearState() {
        return gearState;
    }

    public void setGearState(boolean gearState) {
        this.gearState = gearState;
    }

    public int getTime() {
        return this.time;
    }
    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return
        "Car Brand: " + this.getBrand() + "\n" +
        "Car Model: " + this.getModel() + "\n" +
        "Car Color: " + this.getColor() + "\n" +
        "Car Plate: " + this.getPlate() + "\n" +
        "Current Engine State " + this.isEngineState() + "\n" +
        "Current Engine Gear " + this.getCurrentGear() + "\n" +
        "Current Car Speed " + this.getCurrentSpeed() + "\n"
        ;
    }
}
