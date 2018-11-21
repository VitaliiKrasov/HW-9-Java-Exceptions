package com.soft.vitalii;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Create a method for calculating the area of a rectangle
 * 	int squareRectangle (int a, int b),
 * which should throw an exception if the user enters negative value.
 * Input values a and b from console.
 * Check the squareRectangle method in the method main.
 * Check to input nonnumeric value.
 */
public class PracticalTasc1 {
    static Scanner scanner = new Scanner(System.in);
    static int getSquareRectangle(int a, int b) {
        return a * b;
    }
    static int scannInteger () throws InputMismatchException{
        return scanner.nextInt();
    }
    public static void main(String[] args) {
        System.out.println("Enter integers a and b");
        int a = 0;
        int b = 0;
        try {
            a = scannInteger();
            b = scannInteger();
        } catch (InputMismatchException e) {
            System.out.println("\nNot integer entered");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("\nSomething wrong");
        }
        if(a > 0 && b > 0) {
            System.out.println("Rectangle square: " + getSquareRectangle(a, b));
        } else System.err.println("Enter integer value a and b > 0");

    }
}
