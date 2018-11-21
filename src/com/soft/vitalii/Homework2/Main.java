package com.soft.vitalii.Homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 * Write a method readNumber(int start, int end), that read from console integer number
 * and return it, if it is in the range [start...end].
 * If an invalid number or non-number text is read, the method should throw an exception.
 * Using this method write a method main(), that has to enter 10 numbers:
 * 	a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 * Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
 */

public class Main {
    static int readNumber(int start, int end) throws NotInRangeException, InputMismatchException, NumberFormatException, IOException {
        int result = Integer.parseInt(br.readLine());
        if ((start < result) && (result < end)) {
            return result;
        } else throw new NotInRangeException();
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        int[] array = new int[10];
        int start = 1;
        int end = 100;
        for (int i = 0; i < array.length; /*i++ is in block try*/ ) {
            System.out.println("Enter int");
            try {
                array[i] = readNumber(start, end);
                start = array[i++];
            } catch (NotInRangeException e) {
                e.printStackTrace();
//            } catch (InputMismatchException e) {
//                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }


    }
}
