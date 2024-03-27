package edu.kirkwood.demo_5;

public class ContDemo {
    public static void main(String[] args) {
        outer: for(int i = 1; i < 10; i++){
            inner: for(int j = 1;  j < 10; j++) {
                if(j == 5) {
                    continue;
                }
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
        }
    }
}
