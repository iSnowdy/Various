package Car.Build;

import Car.Domain.Car2;

public class Main1 {
    public static void main(String[]args){
        Car2 car1 = new Car2("Nissan","Supra","Amarillo","1111PBC",false,3,3);
        car1.inputAceleracion();
        car1.acelerar();
        car1.frenazoGato();
        car1.inputMantenerVelocidad();
        car1.mantenerVelocidad();
        car1.decelerar();
        car1.deadPoint();
    }
}
