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
        String[] partsA = numberA.split("/");
        String[] partsB = numberB.split("/");

        int A = Integer.parseInt(partsA[0]);
        int B = Integer.parseInt(partsA[1]);
        int C = Integer.parseInt(partsB[0]);
        int D = Integer.parseInt(partsB[1]);

        int newNum = (A * D) + (C * B);
        int newDenom = B * D;
        int mcd = mcd(newNum, newDenom);

        newNum /= mcd;
        newDenom /= mcd;

        numberC = newNum + "/" + newDenom;
        return numberC;
    }

    public String multiply() {
        String[] partsA = numberA.split("/");
        String[] partsB = numberB.split("/");

        int A = Integer.parseInt(partsA[0]);
        int B = Integer.parseInt(partsA[1]);
        int C = Integer.parseInt(partsB[0]);
        int D = Integer.parseInt(partsB[1]);

        int newNum = A * C;
        int newDenom = B * D;
        int mcd = mcd(newNum, newDenom);

        newNum /= mcd;
        newDenom /= mcd;

        numberC = newNum + "/" + newDenom;
        return numberC;
    }

    public String simplify() {
        String[] partsB = numberB.split("/");

        int C = Integer.parseInt(partsB[0]);
        int D = Integer.parseInt(partsB[1]);
        int mcd = mcd(C, D);

        C /= mcd;
        D /= mcd;

        numberA = C + "/" + D;
        numberB = numberA; // Overwrite numberB with the simplified value
        return numberA;
    }

    // Máximo común divisor
    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
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
