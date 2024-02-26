package edu.kirkwood.demo_3;

public class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j"); // Do not use != with Strings
        if(i == j) System.out.println("i == j"); // Do not use == with Strings
        if(i >= j) System.out.println("i >= j");
        if(i > j) System.out.println("i > j");

        b1 = true;
        b2 = true;
        if(b1 && b2) System.out.println("b1 & b2"); // both are true
        if(!(b1 && b2)) System.out.println("!(b1 & b2)"); // one or both are false
        if(b1 || b2) System.out.println("b1 | b2"); // one or both are true
        if(b1 ^ b2) System.out.println("b1 ^ b2"); // exactly one is true
    }
}
