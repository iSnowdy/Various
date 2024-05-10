package Rational.Build;

import Rational.Domain.Rational;

public class Main {
    public static void main (String[] args) {

        // 1/3 & 2/4

       /* Rational rational1 = new Rational();
        System.out.println(rational1.sum());
        System.out.println(rational1.multiply());
        System.out.println(rational1.simplify());*/

        Rational rational2 = new Rational("3/21", "5/9");
        System.out.println("Sum: " + rational2.sum());
        System.out.println("Multiply: " + rational2.multiply());
        System.out.println("Simplify B -> A: " + rational2.simplify());




        /*String a;
        String b;

        int A;
        int B;
        int C;
        int D;


        // 1/3 && 2/4
        Scanner scanner = new Scanner(System.in);
        System.out.println("a");
        a = scanner.nextLine();
        System.out.println(a);
        System.out.println("a");
        b = scanner.nextLine();
        System.out.println(b);

        A = Character.getNumericValue(a.charAt(0));
        B = Character.getNumericValue(a.charAt(2));
        C = Character.getNumericValue(b.charAt(0));
        D = Character.getNumericValue(b.charAt(2));

        int newNum = (A * D) + (C * B);
        int newDenom = (B * D);

        while (newNum % 2 == 0 && newDenom % 2 == 0) {
            newNum /= 2;
            newDenom /= 2;
        }

        String fractionResult = newNum + "/" + newDenom;
        System.out.println(fractionResult);*/
    }
}
