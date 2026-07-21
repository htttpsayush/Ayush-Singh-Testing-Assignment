package com.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseTest {
	
	@Test

    public void testdatabaseconnection() throws SQLException, ClassNotFoundException {

        // Database Connection Parameters
		String url = "jdbc:mysql://localhost:3306/seleniumautomation";
        String username = "root";
        String password = "Root@123";

        // Load MySQL JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish Database Connection
        Connection con = DriverManager.getConnection(url, username, password);

        // Create Statement
        Statement stmt = con.createStatement();

        // Execute Query
        String query = "SELECT * FROM seleniumautomation.book_detl;";
        ResultSet rs = stmt.executeQuery(query);

        // Process the Results
        while (rs.next()) {
            String auth = rs.getString("author");
            String tit = rs.getString("Title");

            System.out.println("author" + auth + "title" + tit);
        }

        // Close the Connection
        con.close();

        System.out.println("Database Connection Closed.");
    }
}