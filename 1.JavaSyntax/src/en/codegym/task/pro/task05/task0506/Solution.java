package en.codegym.task.pro.task05.task0506;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
/* 
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int lowest = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
            lowest = Integer.min(lowest, nums[i]);
        }

        System.out.println(lowest);
    }
}
