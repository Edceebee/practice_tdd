package com.nonsopracticetdd.tdd;

public class Multiples {

    private int number1;
    private int number2;
    private int multiple;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public boolean setMultiple(int number1, int number2) {
        if (number2 % number1 == 0) {
            return true;
        }
        else {
            return false;
        }
    }


    public String getMultiple() {
        return "multiple";
    }
}