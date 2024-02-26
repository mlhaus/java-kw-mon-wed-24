package edu.kirkwood.demo_3;

import java.util.Scanner;

public class Booleans {
    public static void main(String[] args) {
//        age = 15
//        if(age < 18):
//          print("off to school you go!")
//        elif(age >= 18 and age <= 25):
//          print("enjoy college")
//        elif(age > 25 and age < 65):
//          print("It's time to work")
//        else:
//          print("Enjoy retirement")
        int age = 25;
        if(age < 18) {
            System.out.println("off to school you go!");
        } else if(age >= 18 && age <= 25) {
            System.out.println("enjoy college");
        } else if(age > 25 && age < 65) {
            System.out.println("It's time to work");
        } else {
            System.out.println("Enjoy retirement");
        }

//        likesPizza = input("Do you like pizza? [Y or N] ").upper()
//        if(likesPizza != "Y" and likesPizza != "N"):
//          print("Input not recognized")
//        elif(likesPizza == "N"):
//          print("Why not?")
//        else:
//          print("Me too!")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you like pizza? [Y or N] ");
        String likesPizza = scanner.nextLine().toUpperCase();
        if(!likesPizza.equals("Y") && !likesPizza.equals("N")) {
            System.out.println("Input not recognized");
        } else if(likesPizza.equals("N")) {
            System.out.println("Why not?");
        } else {
            System.out.println("Me too!");
        }


        boolean a = true;
        boolean b = false;
        boolean c = false;
        System.out.println(a || !b && c);
        //                  a || true && c
        //                  a || false
        //                  true
        System.out.println((a || !b) && c);
        //                  (a || true) && c
        //                  true && c
        //                  false
    }
}
