package com.soft.vitalii.task2;

import java.util.EnumMap;
import java.util.Map;

public enum Type{
    CACTUS,
    MOSS,
    FLYTRAP;

    public static Type getType(String color) throws ColorException {
        switch(color.toUpperCase()){
            case "CACTUS" : return Type.CACTUS;
            case "MOSS" : return Type.MOSS;
            case "FLYTRAP" : return Type.FLYTRAP;
            default : throw new ColorException("Input only CACTUS, MOSS, or FLYTRAP");
        }
    }

}
