package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        int bobSalary = 100000;
        int garySalary = 150000;
        int highestSalary = Math.max(bobSalary,garySalary);

        System.out.println("The highest salary is " + highestSalary);

        int carPrice = 5000;
        int truckPrice = 10000;
        int lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is " + lowestPrice);

        float circleRadious = 7.25f;
        float circleArea = (float) (circleRadious*circleRadious*3.14);

        System.out.println("The area of the circle is " + circleArea);

        double square = 5.0;
        double root = Math.sqrt(square);

        System.out.println("The square root of " + square + " is " + root);

        float neg = -3.8f;
        float fin = Math.abs(neg);
        System.out.println("The absolute value of " + neg + " is " + fin);

        double rng = Math.random();
        System.out.println("Here is a random number enjoy! " + rng);

        double xone= 5;
        double xtwo= 85;
        double yone= 10;
        double ytwo = 50;

        double distance = Math.sqrt(Math.pow((xtwo-xone),2)+Math.pow((ytwo-yone),2));

        double input = distance;

        System.out.println("salary : " + input);

        // round half-up, no way control
        // 1205.64
        System.out.println("salary : " + String.format("%.2f", input));

        // 1205.64
        System.out.format("salary : %.2f", input);

        System.out.println("The distance between the two points are " + distance);


    }
}
