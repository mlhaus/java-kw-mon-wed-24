package edu.kirkwood.project_demo.view;

import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class MainMenu implements Menu {
    @Override
    public void show(Scanner scanner) {
        String[] menuItems = {"Front Desk Menu", "Admin Menu", "Quit"};
        while(true) {
            UIUtility.printMenu("Main Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    // show front desk menu
                    new FrontDeskMenu().show(scanner);
                    break;
                case 2:
                    // show admin menu
                    new AdminMenu().show(scanner);
                    break;
                default:
                    // quit
                    return;
            }
        }
    }
}
