package edu.kirkwood.demo_6;

import edu.kirkwood.shared.UIUtility;

import java.util.ArrayList;
import java.util.Arrays;

import static edu.kirkwood.shared.UIUtility.printMenu;

public class ArrayDemo {
    public static void main(String[] args) {
        // Python code - Tuple
//        menu_items = ("View customers", "View rooms", "View reservations", "Add new room") #tuple
//        print(menu_items)


        // Array
        String[] menuItems = {"View customers", "View rooms", "View reservations", "Add new room"};
        System.out.println(Arrays.toString(menuItems));
        printMenu("Demo Menu", menuItems);
        for(int i = 0; i < menuItems.length; i++) {
            System.out.println(menuItems[i]);
        }
        System.out.println();
        for(String item : menuItems) {
            System.out.println(item);
        }
        System.out.println();


        // Python code
//        my_pets = [] #list
//
//        my_pets.append("Zipper")
//        my_pets.append("Waffles")
//        my_pets.insert(0, "Velcro")
//        print(my_pets)
//        for i in range(len(my_pets)):
//        print(my_pets[i])
//#print(my_pets[0])
//#print(my_pets[1])
//#print(my_pets[2])
        ArrayList<String> myPets = new ArrayList<>();
        myPets.add("Zipper");
        myPets.add("Waffles");
        myPets.add(0, "Velcro");
        System.out.println(myPets);
        for(int i = 0; i < myPets.size(); i++) {
            System.out.println(myPets.get(i));
        }
        for(String pet : myPets) {
            System.out.println(pet);
        }
        

    }
}
