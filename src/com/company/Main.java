package com.company;

public class Main {

    public static void main(String[] args) {
        Calculations subtract = new Subtract();
        subtract.operations(177,66);

        Calculations add = new Add();
        add.operations(34,79);

        Calculations multiplication = new Multiplication();
        multiplication.operations(54,7);

        Calculations division = new Division();
        division.operations(96,32);

        Calculations square = new Square();
        square.operations(7,3);

        Calculations squareroot = new Squareroot();
        squareroot.operations(1523,78);
    }
}
