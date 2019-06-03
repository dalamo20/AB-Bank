package com.Connection;
import java.sql.*;

public class Connect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //mysql@123 is a dbName
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql@123", "root", "");
            System.err.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
