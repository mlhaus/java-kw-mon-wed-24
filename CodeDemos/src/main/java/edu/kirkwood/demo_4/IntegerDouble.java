package edu.kirkwood.demo_4;

import java.util.Scanner;

public class IntegerDouble {
    public static void main(String[] args) {
        double num1 = 1; // You can assign int to double
        int num2 = (int)1.0; // You cannot assign double to int, you can cast double as (int)
        System.out.println(num2);

        char ch = 'M';
        String chStr = ch + ""; // (String)ch; // Cannot cast char to (String)
        System.out.println(chStr);

        long l = 1000000L;
        double lDbl = l; // long can be assigned to a double
        long l2 = (long)num1;  // double cannot be assigned to long without casting

        System.out.println(Byte.MAX_VALUE + " to " + Byte.MIN_VALUE);
        System.out.println(Short.MAX_VALUE + " to " + Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + " to " + Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE + " to " + Long.MIN_VALUE);
        System.out.println(Float.MAX_VALUE + " to " + Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE + " to " + Double.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Integer.MIN_VALUE - 1);
        

        for(int i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions: "
                    + (double) i / 3);
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 5 integers");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++) {
            int val = scanner.nextInt();
            scanner.nextLine();
            min = Integer.min(min, val);
            max = Integer.max(max, val);
        }
        System.out.printf("Lowest: %d\nHighest: %d\n", min, max);
        


        
        System.out.print("Enter your zip code: ");
        String zipCode = scanner.nextLine();
        System.out.printf("Your zip code is %s\n", zipCode);
        int zipCodeInt = Integer.parseInt(zipCode); // Integer.valueOf() will also work
        System.out.printf("Your zip code is %d\n", zipCodeInt);
        System.out.print("Enter a number: ");
        String num = scanner.nextLine();
        double numDbl = Double.parseDouble(num); // Double.valueOf() will also work
        System.out.printf("You entered %.2f", numDbl);






    }
}
