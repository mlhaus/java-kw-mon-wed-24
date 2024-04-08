package edu.kirkwood.shared;

import java.util.Scanner;

public class UIUtility {
    public static void displayMessage(String message, String type) {
        System.out.printf("*** %s%s ***\n", type.toUpperCase() + " - ", message);
    }

    public static void displayError(String message) {
        displayMessage(message, "error");
    }

    public static void displayWarning(String message) {
        displayMessage(message, "warning");
    }

    public static void displaySuccess(String message) {
        displayMessage(message, "success");
    }

    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString("Press enter to continue", scanner);
    }

    public static void printLine() {
        printLine(50);
    }

    public static void printLine(int length) {
        for(int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printMenu(String[] menuItems) {
//        String name = "Marc";
//        name.length() // 4
//        String[] myPets = {"Velcro", "Zipper", "Waffles"};
//        myPets.length // 3
        
        // Python code
        // for i in range(len(menu_items)):
        //     print(str(i + 1) + ") " + menu_items[i])
        printLine();
        for(int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ") " + menuItems[i]);
        }
        printLine();
    }



}
