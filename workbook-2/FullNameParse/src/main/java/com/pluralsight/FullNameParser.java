package com.pluralsight;
import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String name = ans("Please enter your full name in (First Middle Last) or (First Last) format: ");
        valid(name);
    }

    public static void valid(String name){
        String[] m = split(name);
        int n = m.length;

        if(n<2){
            System.out.println("Please enter more than one name and try again.");
            System.exit(0);
        }if(n>3){
            System.out.println("Please enter a maximum of 3 names and try again");
            System.exit(0);
        }if (n< 3) {
            System.out.println("First Name: " + m[0] +
                    "\nMiddle Name: "+ "(none)"+
                    "\nLast Name: " + m[1]);
        }
        else {
            System.out.println("First Name: " + m[0] +
                    "\nMiddle Name: " + m[1].charAt(0) +
                    "\nLast Name: " + m[2]);
//            program(choice(), name);
        }
    }

    public static String ans(String message){
        System.out.println(message);
        return scanner.nextLine().trim();
    }

    public static String[] split(String name){
        String[] n = name.split("\\s+");
        return n;
    }

//    public static int choice(){
//        System.out.println("Welcome to our Full Name Parser app.\n" +
//                "Please select one of the following formats: \n" +
//                "( 1 ) First Last\n" +
//                "( 2 ) First Middle Last");
//        return scanner.nextInt();
//    }


//    public static void fl(String[] n){
//        firstChoice(n);
//    }

//    public static void fml(String[] n){
//            if (n.length< 3) {
//                firstChoice(n);
//            }
//            else {
//                System.out.println("First Name: " + n[0] +
//                        "\nMiddle Name: " + n[1].charAt(0) +
//                        "\nLast Name: " + n[2]);
//            }
//        System.out.println("Please enter less than 4 total names and try again.");
//
//    }

//    public static void firstChoice(String[] n){
//        System.out.println("First Name: " + n[0] +
//                "\nMiddle Name: "+ "(none)"+
//                "\nLast Name: " + n[1]);
//    }

//    public static void program(int choice, String name){
//        while (split(name).length>1){
//            switch (choice){
//                case 1:
//                    fl(split(name));
//                    break;
//                case 2:
//                    fml(split(name));
//                    break;
//                default:
//                    System.out.println("Please make a proper choice and try again.");
//                    System.exit(0);
//            }
//            name ="";
//        }
//    }
}
