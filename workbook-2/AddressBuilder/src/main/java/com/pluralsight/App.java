package com.pluralsight;
import java.util.Scanner;

public class App 
{
    static Scanner s = new Scanner(System.in);
    static StringBuilder addy = new StringBuilder();

    public static void main( String[] args )
    {
        addy.append(ans("Hello and Welcome to the Address Builder App \n" +
                "Please enter your full name: "));
        ship(prompt("billing"));
    }

    public static String prompt(String s){
        addy.append("\n");
        addy.append(ans("Please enter your "+ s +" street: "));
        addy.append("\n");
        addy.append(ans("Please enter your "+ s +" city: "));
        addy.append(", ");
        addy.append(ans("Please enter your "+ s +" state: ").toUpperCase());
        addy.append(" ");
        addy.append(ans("Please enter your "+ s +" zip code: "));

        return addy.toString();
    }

    public static String ans(String message){
        System.out.println(message);
        return s.nextLine().trim();
    }

    public static void ship(String b){
        String c = ans("Is your shipping address the same as your billing address? (y/n)");
        addy.setLength(0);
        switch (c.toLowerCase()){
            case "n":
                System.out.println("Please enter your shipping info below: \n");
                String n = ans("Please enter your full name: ");
                String s =prompt("shipping");
                System.out.println(n+"\n \nBilling Address: \n"+ b +"\n \nShipping Address: \n"+ s);
                break;
            case "y":
                System.out.println("\n \nBilling Address: \n"+ b +"\n \nShipping Address: \n"+ b);
                break;
            default:
                System.out.println("Please enter a valid answer and try again.");
                System.exit(0);


        }
    }



}
