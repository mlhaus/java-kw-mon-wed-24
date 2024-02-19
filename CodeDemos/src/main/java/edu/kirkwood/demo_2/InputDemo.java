package edu.kirkwood.demo_2;

import java.util.Scanner;

public class InputDemo {

    private static final double LITERS_PER_GALLON = 3.78541;
    public static void main(String[] args) {
        // I asked ChatGPT to convert this Python code to Java
//        name = input("What is your name? ")
//        age = int(input("How old are you? "))
//        print(f"Hello {name}, you are {age} years old")
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine(); // reads the enter key press after typing a number
        System.out.printf("Hello %s. You are %d years old.\n", name, age);

        System.out.print("What is your favorite color? ");
        String favColor = scanner.nextLine();

        System.out.print("Enter number of gallons: ");
        double gallons = scanner.nextDouble();
        scanner.nextLine(); // reads the enter key press after typing a number
        double liters = gallons * LITERS_PER_GALLON;
        System.out.printf("%.2f gallons is %.2f liters\n", gallons, liters);

    }
}
