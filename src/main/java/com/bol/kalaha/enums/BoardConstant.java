package com.bol.kalaha.enums;

public enum BoardConstant {
    NO_OF_STONES(6);

    private int value;

    BoardConstant(int i) {
        value = i;
    }

    public int getValue(){
        return value;
    }

}
