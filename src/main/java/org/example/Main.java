package org.example;

import java.sql.*;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        Connection connection;
        DriverManager driverManager;

        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement();
//            statement.execute("INSERT INTO user(name,age,email)values ('Lucy',24,'lusy@gmail.com');");
//            int res = statement.executeUpdate("UPDATE user SET name ='Muller' WHERE id = 15;");
//            System.out.println(res);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user;");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String email = resultSet.getString("email");

                System.out.println("ID: " + id + ", Name: " + name + "Age" + age + ", Email: " + email);
            }

//            statement.addBatch("INSERT INTO user(name,age,email)values ('Mary',24,'marry@gmail.com');");
//            statement.addBatch("INSERT INTO user(name,age,email)values ('Torres',14,'torres@gmail.com');");
//            statement.addBatch("INSERT INTO user(name,age,email)values ('Emilia',19,'emilia@gmail.com');");
//            statement.executeBatch();

            if (!connection.isClosed()) {
                System.err.println("There is good connection!");
            }
            connection.close();
            if (connection.isClosed()) {
                System.err.println("Connection is closed!");
            }
        } catch (SQLException e) {
            System.err.println("Something went wrong");
        }
    }
}