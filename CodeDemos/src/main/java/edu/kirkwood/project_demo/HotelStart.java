package edu.kirkwood.project_demo;

import edu.kirkwood.project_demo.view.MainMenu;
import edu.kirkwood.shared.UIUtility;

import java.util.Scanner;

public class HotelStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIUtility.displayMessage("Welcome to the Hotel Management Application");
        new MainMenu().show(scanner);
        UIUtility.displayMessage("Goodbye");
    }
}
