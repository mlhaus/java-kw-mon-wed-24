package edu.kirkwood.demo_5;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
//        while(false) {
//            System.out.println("This code never runs");
//        }
        do {
            System.out.println("This runs at least one time");
        } while(false);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press S to stop.");
        int i = 0;
        do {
            System.out.println(" - Pass #" + i++);
        } while(!scanner.nextLine().equalsIgnoreCase("S"));
        
    }
}