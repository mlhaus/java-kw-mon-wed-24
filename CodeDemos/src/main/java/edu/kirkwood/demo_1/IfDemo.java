package edu.kirkwood.demo_1;

public class IfDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c;
        if (a < b) {
            System.out.println("a is less than b");
        }
        if (a == b) {
            System.out.println("you won't see this");
        }
        c = a - b; // c contains -1
        System.out.println("c contains -1");
        if (c >= 0) {
            System.out.println("c is non-negative");
        }
        if (c < 0) {
            System.out.println("c is negative");
        }
        System.out.println();

        c = b - a; // c now contains 1
        System.out.println("c contains 1");
        if (c >= 0) {
            System.out.println("c is non-negative");
        }
        if (c < 0) {
            System.out.println("c is negative");
        }

        // From Complete Reference
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x is less than y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x now equal to y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x now greater than y");
        }
        // this won't display anything
        if (x == y) {
            System.out.println("you won't see this");
        }
    }
}
