package edu.kirkwood.demo_5;

import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();
        for(int i = 0; i < firstName.length(); i++) {
            System.out.println(firstName.charAt(i));
//            for(int j = 0; j <= i; j++) {
//                System.out.print(firstName.charAt(i));
//            }
//            System.out.println();
        }
    }
}
