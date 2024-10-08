package com.pluralsight;
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App 
{
    static Scanner s = new Scanner(System.in);
    public static void main( String[] args )
    {
       String[] quotes = {

               "1",
               "2",
               "3",
               "4",
               "5",
               "6",
               "7",
               "8",
               "9",
               "10"
       };

        try {
            System.out.println("Select a number 1-10: ");
            System.out.println(quotes[s.nextInt() - 1]);
            s.nextLine();
        }catch (Exception ArrayIndexOutOfBoundsException){
            System.out.println("Not a proper choice please restart the program.");
            System.exit(0);
        }


        loop: while(true){

            System.out.println("Would you want to select another quote? Enter y/n or 'r' for a random quote: ");
            switch (s.nextLine().toLowerCase()){
                case "y":
                    try{
                        System.out.println("Select a number 1-10: ");
                        System.out.println(quotes[s.nextInt() -1]);
                        s.nextLine();

                    }catch (Exception ArrayIndexOutOfBoundsException){
                        System.out.println("Please make a proper choice.");
                        s.nextLine();
                    }
                    break;
                case "n":
                    System.out.println("Thank you please come again!");
                    break loop;
                case  "r":
                    int i = (int)(Math.random() * 10) + 1;
                    System.out.println(quotes[i]);
                    break;
                default:
                    System.out.println("Not a proper choice. Please try again.");
            }
        }




    }
}
