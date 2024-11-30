package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conn {
    public static final String LOAD_DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/mess_system";
    public static final String USER = "root";
    public static final String PASSWORD = "root";

    public static Connection getConnection() throws Exception {
        Class.forName(LOAD_DRIVER);
        Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
        return connection;
    }
}
