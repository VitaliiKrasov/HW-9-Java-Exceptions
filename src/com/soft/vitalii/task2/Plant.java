package com.soft.vitalii.task2;

/**
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized.
 * Color and type are Enum. Override the method toString( ).
 * Create classes ColorException and TypeException
 * and describe there all possible colors and types of plants.
 * In the method main create an array of five plants.
 * Check to work your exceptions.
 */

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("The plant type: %1$s, color: %2$s, size: %3$s", type, color, size);
    }
}
