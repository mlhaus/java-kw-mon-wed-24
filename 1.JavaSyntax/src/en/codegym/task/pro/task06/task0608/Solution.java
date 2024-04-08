package en.codegym.task.pro.task06.task0608;

/* 
A cube calculator
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(2));
        System.out.println(cube(2300000000L));
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(Long.MAX_VALUE + 1);
    }

    public static long cube(long num) {
        return (long) Math.pow(num, 3);
    }

    //write your code here
}
