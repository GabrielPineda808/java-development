package com.pluralsight;
import java.util.Scanner;

public class RentalCarCalculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String date = pickDate();
        int days = rentDays();
        double elec= options(days, "Would you like to rent an electronic toll tag at $3.95 per day? Enter y/n: ",3.95);
        double gps = options(days, "Would you like to rent an GPS at $2.95 per day? Enter y/n: ",2.95);
        double roadSide = options(days, "Would you like to rent an Road Side Assistance at $3.95 per day? Enter y/n: ",3.95);
        int custAge = custAge();
        display(date,days,elec,gps,roadSide,custAge);
    }

    public static String pickDate(){
        System.out.println("Hello please enter the pickup date in DD-MM-YYYY format. Thank you!");
        return scanner.nextLine();
    }

    public static int rentDays(){
        System.out.println("Enter the number of days you will be renting: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    public static double options(int x, String message, double price){

        while(true){
            System.out.println(message);
            String ans = scanner.nextLine();
            if(ans.equals("y") || ans.equals("yes")){
                return price*x;
            } else if (ans.equals("n") || ans.equals("no")) {
                return 0;
            }
            else {
                System.out.println("Please try again and make a proper choice.");
            }
        }
    }



    public static int custAge(){
        System.out.println("Please enter your age : ");
        return scanner.nextInt();
    }

    public static void display(String date, int days, double etag, double gps, double road, int age ){
        double basePrice = 29.99;
        double youngTax = 29.99*0.30;
        if (age < 25){
            double yTotal = youngTax*days;
            double young = (basePrice*days)+yTotal+etag+gps+road;

            System.out.printf("Thank you for your order.\n" +
                    "Your rental will begin on " + date+
                    "\n"+
                    "You will be renting for " + days + " days \n" +
                    "The total cost of the Electronic Toll Tag add on will be  $%.2f" +
                    "\n"
                    +"The total cost of the GPS add on will be $%.2f"+
                    "\n"
                    +"The total cost for Road Side Assistance will be $%.2f"+
                    "\n"
                    +"You will be charged an additional fees for being under the age of 25 which amount to $%.2f \n"+
                    "Your total cost will be $%.2f", etag,gps,road,yTotal,young);

        }
        else {
            double total = (basePrice*days)+etag+gps+road;
            System.out.printf("Thank you for your order.\n" +
                    "Your rental will begin on " + date+"\n"+
                    "You will be renting for " + days + " days \n" +
                    "The total cost of the Electronic Toll Tag add on will be  $" + etag+
                    "\n"+
                    "The total cost of the GPS add on will be $"+gps+
                    "\n"+
                    "The total cost for Road Side Assistance will be $"+road+
                    "\n"+
                    "Your total cost will be $%.2f", total);
        }




    }





}
