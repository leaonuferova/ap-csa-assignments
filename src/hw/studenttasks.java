package src.hw;

import java.util.Scanner;

public class studenttasks {
    public static void main(String[] args) {
         one(); 
         /*Mike: Write a function that prints random 10 numbers and adds “even”
         * if the number is even. [10 is even, 11 is odd] two(); three();
         */ 
        double i = twoscanning(); 
        twoprinting(i);
          
         /* Create a degrees Celsius to Fahrenheit function. Input Celsius degrees,
         * Output check below [1 degree Celsius = 33.8 degrees Fahrenheit]
         */

        double g = threescanning();
        threeprinting(g);
        /**
         * Zofia: Create a function that responds with the appropriate part of the day
         * (morning, afternoon, night) to the time of the Day. Input - hourOfTheDay
         * (0-24). Output check below. [The String should be “morning” if time is on the
         * interval from 5 to 12, 12 excluded. From 12 to 17, it should be labeled
         * “afternoon”. For every other integer, it should be “night”.]
         */

    }

    static void one() {
        for (long i = 0; i <= 9; i++) {
            int x = (int) (1 + Math.random() * 41);
            System.out.print(x);
            if (x % 2 == 0) {
                System.out.println(" even");
            } else {
                System.out.println(" odd");
            }
        }

    }

    static double twoscanning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input degrees in celsium and we shall do the magic: ");
        double s = sc.nextInt();
        return s;
    }

    static void twoprinting(double x) {
        double t = x * 33.8;
        System.out.println("cool number! " + x + " is " + t + " in fahrenheit:0");
    }

    static double threescanning() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a chosen hour of the day (0-24): ");
        double s = sc.nextInt();
        return s;

    }

    static void threeprinting(double g) {
        if (5 <= g) {
            if (g < 12) {
                System.out.println("morning");
            } else {
                if (g <= 17) {
                    System.out.println("afternoon");
                } else {
                    System.out.println("night");
                }
            }
        }

        else {
            System.out.println("night");
        }
    }
}
