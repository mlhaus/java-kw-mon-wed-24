package edu.kirkwood.demo_6;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;
/*
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        // Source: https://stackoverflow.com/a/1486010
        // Written by: Michael Rutherford
        List b = Arrays.asList(ArrayUtils.toObject(nums));
        System.out.println(Collections.min(b));
        // Source: https://stackoverflow.com/a/30692454
        // Written by: Ortomala Lokni
        int min = Arrays.stream(nums).min().getAsInt();
        System.out.println(min);
        IntSummaryStatistics stat = Arrays.stream(nums).summaryStatistics();
        min = stat.getMin();
        System.out.println(min);
    }
}

