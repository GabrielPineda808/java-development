package com.pluralsight;
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SandwhichShop {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double custChoice = SammyOp();
        double custAge = age();
        finalPrice(custChoice,custAge);
    }

    public static double SammyOp(){
        System.out.println("Hello and welcome to my sandwich shop! :)\n " +
                "Enter a sandwich number option below\n" +
                "1: Regular: base price $5.45\n" +
                "2: Large: base price $8.95");
        int choice = scanner.nextInt();
        scanner.nextLine();

        while(true){
            switch (choice){
                case 1:
                    System.out.println("Would you like your sandwich loaded for an extra $1.00? Enter y/n :");
                    String ans = scanner.nextLine();
                    ans.toLowerCase();
                    if(ans.equals("y") || ans.equals("yes")){
                        double disc = 6.45;
                        return disc;
                    }
                    return 5.45;
                case 2:
                    System.out.println("Would you like your sandwich loaded for an extra $1.75? Enter y/n :");
                    String ans2 = scanner.nextLine();
                    ans2.toLowerCase();
                    if(ans2.equals("y") || ans2.equals("yes")){
                        double ld = 8.95+ 1.75;
                        return ld;
                    }
                    return 8.95;
                default:
                    System.out.println("That is not a proper choice. try again!");
            }
        }
    }

    public static double loaded(double x){
        System.out.println("Would you like your sandwich loaded? ");

        return 0;
    }

    public static double age(){
        System.out.println("Do you qualify for a discount?\n" +
                "Enter your age below to find out!");
        float num = scanner.nextFloat();
        scanner.nextLine();
        if (num<=17){
            System.out.println("Nice you qualify for a 10% discount!");
            return .10;
        } else if (num>=65) {
            System.out.println("Nice you qualify for a 10% discount!");
            return .20;
        }


        return 1.0;
    }

    public static void finalPrice(double x, double y){

        if(y==1.0){
            System.out.printf("You owe %.2f for your sandwhich. Have a nice day! :)", x);
        }
        else {
            double discount = x*y;
            double fin = x-discount;
            System.out.printf("You owe %.2f for your sandwhich. Have a nice day! :)", fin);
        }

    }





}
