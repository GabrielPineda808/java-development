package com.pluralsight;
import java.util.Scanner;

public class FullNameApplicaton {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String f = ans("Please enter your first name: ");
        String l = ans("Please enter your last name: ");
        String m = ans("Please enter your middle initial: ");
    }
    public static String ans(String message){
        System.out.println(message);
        String answer = scanner.nextLine();
        scanner.nextLine();
        return answer;
    }
}
