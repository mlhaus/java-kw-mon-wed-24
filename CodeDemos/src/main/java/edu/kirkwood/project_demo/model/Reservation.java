package edu.kirkwood.project_demo.model;

import edu.kirkwood.shared.Helpers;
import edu.kirkwood.shared.UIUtility;

import java.time.LocalDate;

public class Reservation {
    private int reservationId;
    private User customer;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Reservation(int reservationId, User customer, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.reservationId = reservationId;
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public static void printTableHeader() {
        UIUtility.printLine(93);
        System.out.printf("| %-20s | %-11s | %-15s | %-8s | %-12s | %-8s |\n",
                "Name", "Room Number", "Check In", "Price", "Room Type", "Handicap");
        UIUtility.printLine(93);
    }

    @Override
    public String toString() {
        return String.format("| %-20s | %-11s | %-15s | %8s | %-12s | %-8s |",
                customer.getFirstName() + " " + customer.getLastName(),
                room.getRoomNumber(), Helpers.printDate(this.checkInDate), Helpers.toCurrency(room.getPrice()),
                room.getRoomType(), room.isHandicapAccessible() ? "Yes" : "No");
    }

    public int getReservationId() {
        return reservationId;
    }

    public User getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
}
