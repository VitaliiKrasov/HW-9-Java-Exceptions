package com.soft.vitalii.Homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method. Catch all exceptions.
 */
public class MainBr {
    static double div(double d1, double d2) throws ArithmeticException{
        if (d2 != 0) {
            return d1 / d2;
        } else {
            throw new ArithmeticException();}
    }

    public static void main(String[] args) {
        boolean waitingForInput = true;
        while (waitingForInput) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Enter first double");
                double d1 = Double.parseDouble(br.readLine());
                System.out.println("Enter second double");
                double d2 = Double.parseDouble(br.readLine());
                try {
                    double dividend = div(d1, d2);
                    System.out.println(dividend);
                    waitingForInput = false;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    System.out.println("KEEP CALM!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
