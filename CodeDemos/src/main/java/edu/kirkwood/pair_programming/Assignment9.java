package edu.kirkwood.pair_programming;

import edu.kirkwood.shared.Helpers;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Demo Task
        System.out.print("Enter a number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = scanner.nextDouble();
        double sum = getSum(num1, num2);
        System.out.printf("%s + %s = %s\n", num1, num2, Helpers.round(sum, 1));
    }

    /**
     * @param num1 A double
     * @param num2 A double
     * @return The sum of num1 and num2
     */
    public static double getSum(double num1, double num2) {
        return num1 + num2;
    }

}
