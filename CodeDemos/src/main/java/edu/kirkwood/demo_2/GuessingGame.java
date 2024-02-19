package edu.kirkwood.demo_2;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        String answer = "K"; // To do: randomize the letter
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Guess the letter: ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        // To do: add a while loop
        // To do: keep track of number of guesses
        // To do: maintain a database of best scores
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
