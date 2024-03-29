package edu.kirkwood.demo_2;

import edu.kirkwood.shared.Helpers;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // declare a variabe to track the player's lowest score
        
        
        int letterA = 65;
        int letterZ = 90;
        String answer = (char)Helpers.randint(letterA, letterZ) + "";
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Guess the letter: ");
        
        String guess = scanner.nextLine();
       
        if(guess.equalsIgnoreCase(answer)) {
            System.out.println("That's correct!");
        } else {
            if(guess.compareToIgnoreCase(answer) < 0) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        }
    }
}
