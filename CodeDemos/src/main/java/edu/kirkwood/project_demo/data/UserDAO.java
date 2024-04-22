package edu.kirkwood.project_demo.data;

import edu.kirkwood.project_demo.model.User;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO extends Database {
    public static ArrayList<User> getAllUsers() {
        ArrayList<User> users = new ArrayList<>();
        // Get Connection
        try (Connection connection = getConnection()) {
            // Get Statement
            try (CallableStatement statement = connection.prepareCall("{CALL sp_get_all_users()}")) {
                // Get ResultSet
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int userId = resultSet.getInt("user_id");
                    String firstName = resultSet.getString("first_name");
                    String lastName = resultSet.getString("last_name");
                    String email = resultSet.getString("email");
                    User user = new User(userId, firstName, lastName, email);
                    users.add(user);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return users;
    }

    public static void main(String[] args) {
        User.printTableHeader();
        getAllUsers().forEach(System.out::println);
    }

}
