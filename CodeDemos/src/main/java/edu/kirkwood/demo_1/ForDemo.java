package edu.kirkwood.demo_1;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {


        //for count in range(10):
        //    print(count, end=" ")
        //    print()
        //
        for (int count = 0; count < 10; count = count + 1) {
            System.out.print(count + " ");
        }
        System.out.println();

        //for count in range(1, 11):
        //    print(count, end=" ")
        //    print()
        //
        for (int count = 1; count < 11; count++) {
            System.out.print(count + " ");
        }
        System.out.println();

        //for count in range(1, 11, 2):
        //    print(count, end=" ")
        //    print()
        for (int count = 1; count < 11; count += 2) {
            System.out.print(count + " ");
        }
        System.out.println();

        // From Beginner's Guide
        int count;
        for(count = 0; count < 5; count = count + 1) {
            System.out.println("This is count: " + count);
        }
        System.out.println("Done!");

        // From Complete Reference
        int i;
        for(i = 0; i < 10; i = i + 1) {
            System.out.println("This is x: " + i);
        }
        System.out.println();

        int x;
        for (x = 10; x >=0; x -= 2) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        // Loop until an S is typed.
        System.out.println("Press S to stop.");
        for (i = 0; !scanner.nextLine().equalsIgnoreCase("S"); i++)
            System.out.println(" - Pass #" + i);
        System.out.println();

        // This is an infinite loop
//        for(int j = 0; j < 10; j--) {
//            System.out.print(j + " ");
//        }
//        System.out.println();

//        for(;;) {
//            System.out.print(j + " ");
//        }
//        System.out.println();

    }
}
