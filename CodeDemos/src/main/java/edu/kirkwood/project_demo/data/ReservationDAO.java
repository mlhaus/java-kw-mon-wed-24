package edu.kirkwood.project_demo.data;

import edu.kirkwood.project_demo.model.Reservation;
import edu.kirkwood.project_demo.model.Room;
import edu.kirkwood.project_demo.model.RoomType;
import edu.kirkwood.project_demo.model.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReservationDAO extends Database {
    public static ArrayList<Reservation> getAllReservations() {
        ArrayList<Reservation> reservations = new ArrayList<>();
        // Get Connection
        try (Connection connection = getConnection()) {
            // Get Statement
            try (CallableStatement statement = connection.prepareCall("{CALL sp_get_all_reservations()}")) {
                // Get ResultSet
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int userId = resultSet.getInt("user_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    User user = new User(userId, firstName, lastName, email);
                    
                    String roomNumber = resultSet.getString("room_number");
                    double price = resultSet.getDouble("price");
                    String description = resultSet.getString("room_type");
                    RoomType roomType = RoomType.getRoomType(description);
                    boolean handicapAccessible = resultSet.getBoolean("handicap_accessible");
                    Room room = new Room(roomNumber, price, roomType, handicapAccessible);

                    int reservationId = resultSet.getInt("reservation_id");
                    LocalDate checkIn = resultSet.getDate("check_in").toLocalDate();
                    LocalDate checkOut = resultSet.getDate("check_out").toLocalDate();
                    Reservation reservation = new Reservation(reservationId, user, room, checkIn, checkOut);
                            
                    reservations.add(reservation);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservations;
    }

    public static void main(String[] args) {
        getAllReservations().forEach(System.out::println);
    }
}
