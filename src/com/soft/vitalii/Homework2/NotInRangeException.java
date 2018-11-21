package com.soft.vitalii.Homework2;

public class NotInRangeException extends Exception {

    public NotInRangeException(String s) {
        super(s);
    }

    public NotInRangeException() {
        super("The number is out of range");
    }
}
