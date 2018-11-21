package com.soft.vitalii.task2;

public enum Color {
    BLUE,
    RED,
    WHITE;

    public static Color getColor(String color) throws ColorException {
        switch(color.toUpperCase()){
            case "BLUE" : return Color.BLUE;
            case "RED" : return Color.RED;
            case "WHITE" : return Color.WHITE;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }

}
