package edu.kirkwood.demo_3;

import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        String str1 = "Kirkwood";
        Scanner scanner = new Scanner(System.in);
        System.out.print("What school do you attend? ");
        String str2 = scanner.nextLine();
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
