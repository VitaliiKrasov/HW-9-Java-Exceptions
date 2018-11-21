package com.soft.vitalii.Homework1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method. Catch all exceptions.
 */
public class Main {
    static double div(double d1, double d2) throws ArithmeticException{
        if (d2 != 0) {
            return d1 / d2;
        } else {
            throw new ArithmeticException();}
    }

    public static void main(String[] args) {
        boolean waitingForInput = true;
        while (waitingForInput) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter first double");
                double d1 = scanner.nextDouble();
                System.out.println("Enter first double");
                double d2 = scanner.nextDouble();
                try {
                    double dividend = div(d1, d2);
                    System.out.println(dividend);
                    waitingForInput = false;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    System.out.println("KEEP CALM!");
                }
            } catch (InputMismatchException e) {
                e.printStackTrace();
                System.out.println("KEEP CALM!");
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("KEEP CALM!");
            }
        }
    }
}
