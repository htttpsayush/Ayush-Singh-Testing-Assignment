package com.JDBC.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDoperations {

    public void CRUD() throws SQLException {

        String url = "jdbc:mysql://localhost:3306/seleniumautomation";
        String username = "root";
        String password = "Root@123";

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();

        String query = "UPDATE book_detl SET author = 'Ayush Singh' WHERE author = 'Raman'";

        int rowsAffected = stmt.executeUpdate(query);

        System.out.println(rowsAffected + " record(s) updated successfully.");

        stmt.close();
        con.close();
    }
}