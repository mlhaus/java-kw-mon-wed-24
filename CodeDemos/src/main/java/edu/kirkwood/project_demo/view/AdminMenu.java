package edu.kirkwood.project_demo.view;

import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class AdminMenu implements Menu {
    @Override
    public void show(Scanner scanner) {
        String[] menuItems = {"View all customers", "View all reservations", "View all rooms", "Add new room", "Exit"};
        while(true) {
            UIUtility.printMenu("Admin Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    // view customers
                    break;
                case 2:
                    // view reservations
                    break;
                case 3:
                    // view rooms
                    break;
                case 4:
                    // add room
                    break;
                default:
                    // exit
                    return;
            }
        }
    }
}
