

package com.nonsopracticetdd.tdd;

import java.util.Scanner;

public class AdditionMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Addition addition= new Addition();

        System.out.println("Enter the firstNumber");
        int a= input.nextInt();
        addition.setNumber1(a);

        System.out.println("Enter the secondNumber");
        int b= input.nextInt();
        addition.setNumber2(b);

       addition.setSum(a,b);
        int sum=addition.getSum();

        System.out.printf("the sum is %d",sum);
    }
}
