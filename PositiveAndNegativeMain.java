package com.nonsopracticetdd.tdd;

/*Write a program that inputs five numbers and determines and prints the number of negative numbers input, the
        number of positive numbers input and the number of zeros input */

import java.util.Scanner;

public class PositiveAndNegativeMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PositiveAndNegative main = new PositiveAndNegative();

        int number;
        int counter = 1;

        while (counter <= 5 ){
            System.out.println("Enter number");
            number = input.nextInt();

            main.setNegative(number);
            main.setPositive(number);


                System.out.println(main.getNegative());

                System.out.println(main.getPositive());



            counter++;

        }

    }
}
