package edu.kirkwood.demo_5;

public class BreakDemo2 {
    public static void main(String args[]) throws Exception{
        outer:
        {
            for(int i = 65; i <=90; i++) {
                String firstLetter = (char) i + "";
                inner:
                {
                    for (int j = 65; j <= 90; j++) {
                    
                        String secondLetter = (char) j + "";
                        if (j == 70) {
                            break outer;
                        }
                        System.out.println(firstLetter + secondLetter);
                    }
                }
            }
        }



        // Example 1: Another example of using break with a label.
        for (int i = 1; i < 4; i++) {
            one: {
                two: {
                    three: {
                        System.out.println("\ni is " + i);
                        if (i == 1)
                            break one;
                        if (i == 2)
                            break two;
                        if (i == 3)
                            break three;

                        // this is never reached
                        System.out.println("won't print");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
        System.out.println("After for.");
        System.out.println();

        // Example 2
        done: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.println(k + " ");
                    if (k == 5)
                        break done; // jump to done
                }
                System.out.println("After k loop"); // won't execute
            }
            System.out.println("After j loop"); // won't execute
        }
        System.out.println("After i loop");
        System.out.println();

        // Example 3: Where you put a label is important.
        int x = 0, y = 0;

        // here, put label before for statement.
        stop1: for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                if (y == 2)
                    break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println();

        // Example 4: now, put label immediately before {
        for (x = 0; x < 5; x++)
            stop2: {
                for (y = 0; y < 5; y++) {
                    if (y == 2)
                        break stop2;
                    System.out.println("x and y: " + x + " " + y);
                }
            }

    }
}
