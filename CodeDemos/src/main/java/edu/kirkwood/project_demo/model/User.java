package edu.kirkwood.project_demo.model;

import edu.kirkwood.shared.UIUtility;

public class User {
    // Declare attributes (aka instance variables or properties) without values
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    

    
    public User() {
        
    }

    // Constructor methods create User objects
    public User(int userId, String firstName, String lastName, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public static void printTableHeader() {
        UIUtility.printLine(78);
        System.out.printf("| %-5s | %-15s | %-15s | %-30s |\n",
                "ID", "First Name", "Last Name", "Email");
        UIUtility.printLine(78);
    }

    // toString creates a string representation of a User.
    public String toString() {
        return String.format("| %5d | %-15s | %-15s | %-30s |",
                userId, firstName, lastName, email);
    }
    
    // Getter methods, allow us to access data (accessors)
    
    public int getUserId() {
        return userId;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getEmail() {
        return email;
    }
    


}
