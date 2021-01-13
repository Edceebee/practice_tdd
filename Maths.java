package com.nonsopracticetdd.tdd;

/*program that multiply two integers, sum two integers and subtract the integers and divide the integer */

public class Maths {
    private int number1;
    private int number2;
    private int multiplication;
    private int division;
    private int addition;
    private int subtraction;


    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }


    public void setMultiplication(int number1, int number2) {
        multiplication = number1 * number2;
    }

    public int getMultiplication() {
        return multiplication;
    }

    public void setDivision(int number1, int number2) {
        division = number1 / number2;
    }

    public int getDivision() {
        return division;
    }

    public void setAddition(int number1, int number2) {
        addition = number1 + number2;
    }

    public int getAddition() {
        return addition;
    }

    public void setSubtraction(int number1, int number2) {
        subtraction = number1 - number2;
    }

    public int getSubtraction() {
        return subtraction;
    }
}
