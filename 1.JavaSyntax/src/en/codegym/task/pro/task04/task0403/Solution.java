package en.codegym.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Summation
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(scanner.hasNextInt()) {
            int num = scanner.nextInt();
            sum += num;
        }
        System.out.println(sum);
    }
}