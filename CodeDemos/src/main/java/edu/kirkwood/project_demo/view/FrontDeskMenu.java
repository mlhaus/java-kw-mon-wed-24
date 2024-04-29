package edu.kirkwood.project_demo.view;

import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class FrontDeskMenu implements Menu {
    @Override
    public void show(Scanner scanner) {
        String[] menuItems = {"Create customer", "Create reservation", "Lookup reservation by customer", "Exit"};
        while(true) {
            UIUtility.printMenu("Front Desk Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    // create customer
                    break;
                case 2:
                    // create reservation
                    break;
                case 3:
                    // lookup reservation
                    break;
                default:
                    // exit
                    return;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
    }
}
