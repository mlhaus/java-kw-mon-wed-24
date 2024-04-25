package edu.kirkwood.project_demo.view;

import edu.kirkwood.project_demo.data.RoomDAO;
import edu.kirkwood.project_demo.data.UserDAO;
import edu.kirkwood.project_demo.model.Room;
import edu.kirkwood.project_demo.model.User;
import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class AdminMenu implements Menu {
    @Override
    public void show(Scanner scanner) {
        String[] menuItems = {"View all users", "View all reservations", "View all rooms", "Add new room", "Exit"};
        while(true) {
            UIUtility.printMenu("Admin Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    // view customers
                    UIUtility.displayMessage(menuItems[0]);
                    User.printTableHeader();
                    for(User user : UserDAO.getAllUsers()) {
                        System.out.println(user);
                    }
                    break;
                case 2:
                    // view reservations
                    break;
                case 3:
                    // view rooms
                    UIUtility.displayMessage(menuItems[2]);
                    Room.printTableHeader();
                    for(Room room : RoomDAO.getAllRooms()) {
                        System.out.println(room);
                    }
                    break;
                case 4:
                    // add room
                    break;
                default:
                    // exit
                    return;
            } // end switch
            UIUtility.pressEnterToContinue(scanner);
        } // end loop
    }
}
