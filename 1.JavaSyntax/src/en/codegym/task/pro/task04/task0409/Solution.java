package en.codegym.task.pro.task04.task0409;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 
Minimum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(scanner.hasNextInt()) {
            min = Integer.min(min, scanner.nextInt());
        }
        System.out.println(min);
    }
}