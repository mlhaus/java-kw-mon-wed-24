package edu.kirkwood.project_demo.model;

import edu.kirkwood.shared.Helpers;
import edu.kirkwood.shared.UIUtility;

public class Room {
    // instance variables, attributes, fields, properties
    private String roomNumber;
    private double price;
    private RoomType roomType;
    private boolean handicapAccessible;

    // default constructor
    public Room() {
        
    }
    // parameterized constructor
    public Room(String roomNumber, double price, RoomType roomType, boolean handicapAccessible) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
        this.handicapAccessible = handicapAccessible;
    }

    public static void printTableHeader() {
        UIUtility.printLine(64);
        System.out.printf("| %-11s | %-8s | %-12s | %-20s |\n",
                "Room Number", "Price", "Room Type", "Handicap Accessible");
        UIUtility.printLine(64);
    }
    
    public String toString() {
        return String.format("| %-11s | %8s | %-12s | %-20s |",
                roomNumber, Helpers.toCurrency(price), roomType, handicapAccessible ? "Yes" : "No");
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isHandicapAccessible() {
        return handicapAccessible;
    }
}
