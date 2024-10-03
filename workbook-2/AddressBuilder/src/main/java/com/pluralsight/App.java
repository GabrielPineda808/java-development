package com.pluralsight;
import java.util.Scanner;

public class App 
{
    static Scanner s = new Scanner(System.in);

    public static void main( String[] args )
    {
        String name = ans("Please enter your full name: ");

        System.out.println("Please enter your billing info below \n");

        String bStreet = ans("Please enter your billing street: ");
        String bCity = ans("Please enter your billing city: ");
        String bState = ans("Please enter your billing state: ").toUpperCase();
        String bZip = ans("Please enter your billing zip code: ");
        String choice = ans("Is your shipping address the same as your billing address? (y/n)");

        String billing = build(bStreet,bCity,bState,bZip);

        ship(name,billing,choice);

    }

    public static String ans(String message){
        System.out.println(message);
        return s.nextLine().trim();
    }

    public static String build(String s, String c, String st, String z){
        StringBuilder addy = new StringBuilder();
        addy.append(s);
        addy.append("\n");
        addy.append(c);
        addy.append(" ");
        addy.append(st);
        addy.append(", ");
        addy.append(z);
        return addy.toString();
    }

    public static void ship(String n, String a, String c){

        switch (c.toLowerCase()){
            case "n":
                System.out.println("Please enter your shipping info below: \n");

                String sStreet = ans("Please enter your shipping street: ");
                String sCity = ans("Please enter your shipping city: ");
                String sState = ans("Please enter your shipping state: ").toUpperCase();
                String sZip = ans("Please enter your shipping zip code: ");
                String ship = build(sStreet,sCity,sState,sZip);
                System.out.println(n +"\n \nBilling Address: \n"+ a +"\n \nShipping Address: \n"+ ship);
                break;
            case "y":
                System.out.println(n +"\n \nBilling Address: \n"+ a +"\n \nShipping Address: \n"+ a);
                break;
            default:
                System.out.println("Please enter a valid answer and try again.");
                System.exit(0);


        }
    }



}
