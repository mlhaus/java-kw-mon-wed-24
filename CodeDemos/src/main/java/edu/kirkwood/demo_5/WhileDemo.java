package edu.kirkwood.demo_5;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        // Python code
//        i = 1
//        while i < 11:
//          print(i, end=" ")
//          i += 1
//        print()
        int i = 1;
        while(i < 11) {
            System.out.print(i + " ");
            i += 1;
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        // Loop until an S is typed.
//        System.out.println("Press S to stop.");
//        for (i = 0; !scanner.nextLine().equalsIgnoreCase("S"); i++)
//            System.out.println(" - Pass #" + i);
//        System.out.println();
        System.out.println("Press S to stop.");
        // Step 1: Create an infinite loop
        i = 0;
        while(true) {
            System.out.println(" - Pass #" + i++);
            if(scanner.nextLine().equalsIgnoreCase("S")) {
                break;
            }
        }
        System.out.println();
    }
}
