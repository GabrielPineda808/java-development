package com.pluralsight;

import java.util.Scanner;


public class App 
{
    static Scanner s = new Scanner(System.in);
    public static void main( String[] args )
    {
        String score = ans("Please enter the score in the follow format\n" +
                "Home:Visitor|21:9");

        win(score);

    }

    public static String ans(String message){
        System.out.println(message);
        return s.nextLine().trim();
    }

    public static void win(String score){
        String[] s = score.split("\\|");
        String[] teams = s[0].split(":");
        String[] scores = s[1].split(":");
        int t1score = Integer.parseInt(scores[0]);
        int t2score = Integer.parseInt(scores[1]);
        if(t1score>t2score){
            System.out.println("Winner: "+ teams[0]);
        } else if (t1score<t2score) {
            System.out.println("Winner: " + teams[1]);
        } else{
            System.out.println("The game ended in a tie. NO WINNER!");
        }
    }
}
