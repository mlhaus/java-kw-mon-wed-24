package edu.kirkwood.demo_week1;

import java.math.BigInteger;

public class Example3 {
    public static void main(String[] args) {
        int score = 5;
        int score2 = score / 2;
        System.out.println(score2); // 2
        double score3 = score / 2.0;
        System.out.println(score3); // 2.5
        System.out.println("I scored " + score + " points."); // this uses concatenation
        System.out.printf("I scored %s points.\n", score); // this uses an f-string with a substitution variable
        System.out.println(String.format("I scored %s points.", score)); // this uses the String class's static format method

        int count = Integer.parseInt("10"); // converts a string to an int

//        int invalidInt = 2.5;
        double validDouble = 2;
        byte b = -128; // smallest byte
        byte b2 = 127; // largest byte
        long reallyBigNumber = 999999999999999999l;
        BigInteger bigInteger = new BigInteger("999999999999999999999999999999");

    }
}
