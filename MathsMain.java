package com.nonsopracticetdd.tdd;

import java.util.Scanner;

public class MathsMain {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner input = new Scanner(System.in);
        Maths maths = new Maths();

        System.out.println("Enter first number");
        num1 = input.nextInt();

        System.out.println("Enter second number");
        num2 = input.nextInt();


        maths.setDivision(num1, num2);
        maths.setAddition(num1, num2);
        maths.setMultiplication(num1, num2);
        maths.setSubtraction(num1, num2);

        System.out.printf("Addition is %d%n", maths.getAddition());
        System.out.printf("Division is %d%n", maths.getDivision());
        System.out.printf("Multiplication is %d%n", maths.getMultiplication());
        System.out.printf("Subtraction is %d%n", maths.getSubtraction());

    }
}
