package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class App 
{
    static Scanner s = new Scanner(System.in);
    public static void main( String[] args ) throws FileNotFoundException {
        System.out.println("Select an option to read that story:\n" +
                "goldilocks.txt\n" +
                "hansel_and_gretel.txt\n" +
                "mary_had_a_little_lamb.txt");
        String ans = s.nextLine();
        FileInputStream fis = new FileInputStream("DataFiles/"+ans);
        Scanner read = new Scanner(fis);
        String input;
        int count = 1;
        while(read.hasNextLine()) {
            input = read.nextLine();
            System.out.println(count +". "+input);
            count++;
        }
        s.close();


    }
}
