package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 14 Solution
 *  Copyright 2021 Luis Figueroa
 */

import java.util.Scanner; //the scanner utility

public class App {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used
        double order;
        String state;

        //if is not WI
        System.out.println("What is the order amount? ");
        order = Double.parseDouble(userInput.nextLine());

        System.out.println("What is the state? ");
        state = userInput.nextLine();

        System.out.println("The total is $"+order);

        //if it is WI

        if (state.equals("WI")) {

            double tax;
            tax = order * 0.055;
            System.out.println("\nThe tax is $"+ tax);

            double total;
            total = order + tax;

            double totalf = Math.ceil(total*100)/100;
            System.out.println("\nThe total is $"+ totalf);
        }

    }
}
