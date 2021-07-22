package com.company;

public class Square implements Calculations {

    public void operations(int firstNumber, int secondNumber) {

        System.out.println(Math.pow(firstNumber, 2));
        System.out.println(Math.pow(secondNumber, 2));
    }
}
