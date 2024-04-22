package edu.kirkwood.project_demo.model;

public class Room {
    private String roomNumber;
    private double price;
    private RoomType roomType;
    private boolean handicapAccessible;
    
    public Room() {
        
    }
    
    public Room(String roomNumber, double price, RoomType roomType, boolean handicapAccessible) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
        this.handicapAccessible = handicapAccessible;
    }
    
    public String toString() {
        return String.format("Room{%s, %.2f, %s, %s}", roomNumber, price, roomType, handicapAccessible);
    }
    
    
}
