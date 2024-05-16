package Classroom_PC.Build;

import Classroom_PC.Domain.Classroom_PC;
import Classroom_PC.Domain.DataStorage;

public class Main {
    public static void main (String[] args) {

        DataStorage PC1 = new DataStorage("AMD Ryzen", "RTX 3060", "16GB DDR4 3200MHz", 24, "Windows");
        DataStorage PC2 = new DataStorage("AMD Ryzen", "RTX 3060 Ti", "8GB DDR4 1600MHz", 16, "Windows");
        DataStorage PC3 = new DataStorage("Intel 7", "RTX 4090 Ti", "64GB DDR5 3200MHz", 32, "Windows");
        DataStorage PC4 = new DataStorage("Intel 99", "Radeon IDK", "16GB DDR3 2400MHz", 21, "Ubuntu");

        PC1.addStorage("HDD", "2TB");
        PC1.addStorage("SDD", "500GB");

        System.out.println("------ PC Info --------");
        System.out.println(PC1);

        Classroom_PC newClass1 = new Classroom_PC("IT-Adv", "5B");
        newClass1.addPC(PC1);
        newClass1.addPC(PC2);
        newClass1.addPC(PC3);
        newClass1.addPC(PC4);

        System.out.println("Currently in this Class there are " + newClass1.amountOfPCs() + " PC's.");
        System.out.println(newClass1);

        System.out.println("\nNow lets try playing something!\n");
        System.out.println("Turning ON the PC ...\n");
        PC1.turnOn();
        PC1.playSomething();

        // PC1.playSomething();
    }
    /*
    Crea la clase que almacén la información técnica de un ordenador.
    Crea también la clase que permita almacenar la información de todos los ordenadores almacenados en un aula,
    así como el nombre del aula y el curso que se imparte en la misma.
    Dejo a tu elección los atributos y métodos necesarios.

    El programa principal debe permitir gestionar dicha aula.

    Almacén:
    - almacenará la información técnica sobre los ordenadores, sus especificaciones
    - tendrá un contador estático para contar la cantidad de ordenadores que hay almacenados / size del array
    - mostrará con un toString las características del ordenador
    - el ordenador estará apagado. hay que encenderlo para poder hacer algo con él
    - podrás jugar n juego simple de peidra/papel/tijera en el ordenador vs CPU

    Clase:
    - tendrá el nombre y curso del aula
    - podrá añadir/eliminar ordenadores
    - podrá imprimir cuántos ordenadores tiene el aula y los detalles del mismo
    - podrá ordenar por especificaciones el ordenador?
    -

     */




}
