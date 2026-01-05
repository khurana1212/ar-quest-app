
package com.arquest.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static Connection con;

    public static Connection getConnection() {
        try {
            if (con == null || con.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/arquest", "root", "password");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return con;
    }
}
