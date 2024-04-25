package edu.kirkwood.project_demo.data;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Database {
    public static Connection getConnection() {
        Dotenv dotenv = Dotenv.load();
        String dbDriver = dotenv.get("DB_DRIVER");
        String dbConnectionString = String.format("%s%s", dotenv.get("DB_CONNECTION"), dotenv.get("HOTEL_SCHEMA"));
        String dbUsername = dotenv.get("DB_USERNAME");
        String dbPassword = dotenv.get("DB_PASSWORD");
        try {
            Class.forName(dbDriver);
//            System.out.println("Driver was found");
        } catch(ClassNotFoundException e) {
//            System.out.println("Driver not found");
            return null;
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(dbConnectionString, dbUsername, dbPassword);
//            System.out.println("Connection established");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
