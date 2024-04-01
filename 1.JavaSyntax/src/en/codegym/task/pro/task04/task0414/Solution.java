package en.codegym.task.pro.task04.task0414;

import java.util.Scanner;

/* 
There's never too much of a good thing
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num = scanner.nextInt();
        do {
            System.out.println(str);
            num--;
        } while(num > 0 && num < 5);
    }
}