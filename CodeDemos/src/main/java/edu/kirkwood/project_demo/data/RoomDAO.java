package edu.kirkwood.project_demo.data;

import edu.kirkwood.project_demo.model.Room;
import edu.kirkwood.project_demo.model.RoomType;
import edu.kirkwood.project_demo.model.User;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RoomDAO extends Database {
    public static ArrayList<Room> getAllRoom() {
        ArrayList<Room> rooms = new ArrayList<>();
        // Get Connection
        try (Connection connection = getConnection()) {
            // Get Statement
            try (CallableStatement statement = connection.prepareCall("{CALL sp_get_all_rooms()}")) {
                // Get ResultSet
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    String roomNumber = resultSet.getString("room_number");
                    double price = resultSet.getDouble("price");
                    String roomTypeStr = resultSet.getString("room_type");
                    RoomType roomType = null;
                    boolean handicapAccessible = resultSet.getBoolean("handicap_accessible");
                    Room room = new Room(roomNumber, price, roomType, handicapAccessible);
                    rooms.add(room);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rooms;
    }

    public static void main(String[] args) {
        User.printTableHeader();
        getAllUsers().forEach(System.out::println);
    }
}
