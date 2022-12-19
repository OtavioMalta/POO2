package config;

import java.sql.*;

public class SQLConnection {


    private static java.sql.Connection conn = null;

    public static Connection getConnection() {
        if(conn == null) {

            try {

                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/meubanco","root","password");

            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
            }
            return conn;
        } else {
            return conn;
        }
    }
}
