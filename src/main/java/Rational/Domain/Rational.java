package Rational.Domain;

/*
Crea una clase Racional que permita trabajar con números racionales (fracciones).
Incluye los siguientes métodos: constructores (por defecto y parametrizados), toString, getters y setters. Además
los siguientes métodos:

leer(); → que la pide por teclado,
c=sumar(a,b); → que suma las fracciones a y b devolviendo la fracción simplificada c.
c=multiplicar(a,b); → que multiplica las fracciones a y b devolviendo la fracción simplificada c.
a = simplificar(b); → método que simplifica la fracción b devolviéndola en la a.
*/

import java.util.Scanner;

public class Rational {
    private String numberA;
    private String numberB;
    private String numberC;

    public Rational() {
        read();
    }

    public Rational(String numberA, String numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    private void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in Fraction A: (with format a/b): ");
        this.numberA = scanner.nextLine();

        System.out.println("Now please type in Fraction B: (with format a/b): ");
        this.numberB = scanner.nextLine();
    }

    public String sum() {
        int A = Character.getNumericValue(getNumberA().charAt(0));
        int B = Character.getNumericValue(getNumberA().charAt(2));
        int C = Character.getNumericValue(getNumberB().charAt(0));
        int D = Character.getNumericValue(getNumberB().charAt(2));

        int newNum = (A * D) + (C * B);
        int newDenom = B * D;
        int max = Math.max(newNum, newDenom);

        while (newNum % 2 == 0 && newDenom % 2 == 0) {
            newNum /= 2;
            newDenom /= 2;
        }
        setNumberC(newNum + "/" + newDenom);
        return getNumberC();
    }

    public String multiply() {
        int A = Character.getNumericValue(getNumberA().charAt(0));
        int B = Character.getNumericValue(getNumberA().charAt(2));
        int C = Character.getNumericValue(getNumberB().charAt(0));
        int D = Character.getNumericValue(getNumberB().charAt(2));

        int newNum = A * C;
        int newDenom = B * D;

        while (newNum % 2 == 0 && newDenom % 2 == 0) {
            newNum /= 2;
            newDenom /= 2;
        }
        setNumberC(newNum + "/" + newDenom);
        return getNumberC();
    }

    public String simplify() {
        int C = Character.getNumericValue(getNumberB().charAt(0));
        int D = Character.getNumericValue(getNumberB().charAt(2));

        while (C % 2 == 0 && D % 2 == 0) {
            C /= 2;
            D /= 2;
        }
        setNumberB(String.valueOf(C) + "/" + String.valueOf(D));
        setNumberA(getNumberB());
        return getNumberA();
    }


    // Getters & Setters

    public String getNumberA() {
        return numberA;
    }

    public void setNumberA(String numberA) {
        this.numberA = numberA;
    }

    public String getNumberB() {
        return numberB;
    }

    public void setNumberB(String numberB) {
        this.numberB = numberB;
    }

    public String getNumberC() {
        return numberC;
    }

    public void setNumberC(String numberC) {
        this.numberC = numberC;
    }
}
