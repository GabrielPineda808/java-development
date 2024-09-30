package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to the Basic Calculator app! ENJOY! :)");

        double num1 = choice();
        double num2 = choice();


        calc(num1,num2);

    }

    public static double choice(){
        System.out.println("Enter a number: ");
        double num = scanner.nextDouble();
        scanner.nextLine();
        return num;
    }

    public static String op(){
        System.out.println(
                "Possible calculations:\n" +
                        "(A)dd\n" +
                        "(S)ubtract\n" +
                        "(M)ultiply\n" +
                        "(D)ivide\n" +
                        "Please select an option: ");

        return scanner.nextLine();
    }

    public static void calc( double x, double y){

        switch (op().toUpperCase()){
            case "A":
                System.out.println(x+ " + " + y + " = " + (x + y));
                break;
            case "S":
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case "M":
                System.out.println(x + " * " + y + " = " + (x * y));
                break;
            case "D":
                System.out.println(x + " / " + y + " = " + (x / y));
                break;
            default:
                System.out.println("That is not a proper choice. Try again.");
        }

    }

}
