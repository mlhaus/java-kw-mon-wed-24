package edu.kirkwood.demo_1;

public class BlockDemo {
    public static void main(String[] args) {
        // From Beginner's Guide
        int i, j, d;
        i = 4;
        j = 10;
        // the target of this if is a block
        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }

        // From Complete Reference
        int x, y;
        y = 20;
        // the target of this loop is a block
        for(x = 0; x < 10; x++) {
            System.out.print("x: " + x);
            System.out.print(", y: " + y);
            System.out.println();
            y -= 2;
        }
    }
}
