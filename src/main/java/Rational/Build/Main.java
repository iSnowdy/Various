package Rational.Build;

import Rational.Domain.Rational;

public class Main {
    public static void main (String[] args) {

        // 1/3 & 2/4

       /* Rational rational1 = new Rational();
        System.out.println(rational1.sum());
        System.out.println(rational1.multiply());
        System.out.println(rational1.simplify());*/

        Rational rational2 = new Rational("25/13", "7/6");
        System.out.println("Sum: " + rational2.sum());
        System.out.println("Multiply: " + rational2.multiply());
        System.out.println("Simplify B -> A: " + rational2.simplify());
    }
}
