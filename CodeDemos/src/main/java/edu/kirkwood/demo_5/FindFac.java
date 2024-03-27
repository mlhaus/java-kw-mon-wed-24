package edu.kirkwood.demo_5;

public class FindFac {
    public static void main(String[] args) {
        outer: for(int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    continue outer;
                }
            }
            System.out.println(i + " ");
        }
        System.out.println();
        
        for(int i = 2; i < 100; i++) {
            boolean isPrime = true;
            System.out.print("Factors of " + i + ": ");
            for(int j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    System.out.print(j + " ");
                    isPrime = false;
                }
            }
            System.out.println(isPrime ? "Prime Number" : "");
        }
    }
}
