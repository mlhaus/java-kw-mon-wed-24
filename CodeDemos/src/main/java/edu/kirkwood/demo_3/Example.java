package edu.kirkwood.demo_3;

import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Denominator: ");
        int denominator = scanner.nextInt();
        if(denominator != 0 && (numerator % denominator) == 0) {
            System.out.println(denominator + " is a factor of " + numerator);
        } else {
            System.out.println(denominator + " is NOT a factor of " + numerator);
        }
        System.out.print("Favorite Food: ");
        String favFood = scanner.nextLine();
        System.out.println("I like " + favFood + " too.");
    }
}
