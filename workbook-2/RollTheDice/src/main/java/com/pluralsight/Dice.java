package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        int count2 =0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;
        for(int i = 0; i <= 100; i++){
            int roll1 = roll();
            int roll2 = roll();
            int sum = roll1 + roll2;
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);
            switch (sum){
                case 2:
                    count2+= 1;
                    break;
                case 4:
                    count4+= 1;
                    break;
                case 6:
                    count6+= 1;
                    break;
                case 7:
                    count7+= 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("The number 2 was rolled "+ count2+ " times.");
        System.out.println("The number 4 was rolled "+ count4+ " times.");
        System.out.println("The number 6 was rolled "+ count6+ " times.");
        System.out.println("The number 7 was rolled "+ count7+ " times.");

    }
    public static int roll() {
        return (int)(Math.random() * 6) + 1;
    }
}

