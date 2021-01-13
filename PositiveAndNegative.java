
package com.nonsopracticetdd.tdd;

/*Write a program that inputs five numbers and determines and prints the number of negative numbers input, the
              number of positive numbers input and the number of zeros input */


public class PositiveAndNegative {

    private int fig;
    private int positive;
    private int negative;



    public void setNumber(int fig1) {
        this.fig = fig1;
    }

    public int getNumber() {
        return fig;
    }

    public void setPositive(int number) {
        if(number > 0) {
            positive = number;
        }
    }

    public static String getPositive(){
        return "positive";
    }

    public void setNegative(int number) {
        if(number < 0) {
            negative = number;
        }
    }

    public String getNegative() {
        return "negative";
    }
}
