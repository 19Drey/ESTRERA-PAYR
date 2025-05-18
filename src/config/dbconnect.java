/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class dbconnect {
    public Connection connect;

    // Constructor to connect to payroll_management database
    public dbconnect() {
        try {
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll_management", "root", "");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Can't connect to database: " + ex.getMessage());
            System.out.println("Connection Error: " + ex);
        }
    }

    // Function to insert data with parameterized query
    public int insertData(String sql, String... params) {
        int result = 0;
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pst.setString(i + 1, params[i]);
            }
            result = pst.executeUpdate();
            if (result > 0) {
                System.out.println("Inserted Successfully!");
            } else {
                System.out.println("Insert Failed!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            System.out.println("Connection Error: " + ex);
        }
        return result;
    }

    // Function to update data with parameterized query
    public int updateData(String sql, String... params) {
        int result = 0;
        try (PreparedStatement pst = connect.prepareStatement(sql)) {
            for (int i = 0; i < params.length; i++) {
                pst.setString(i + 1, params[i]);
            }
            result = pst.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
            } else {
                System.out.println("Data Update Failed!");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Database error: " + ex.getMessage());
            System.out.println("Connection Error: " + ex);
        }
        return result;
    }

    // Function to retrieve data with parameterized query
    public ResultSet getData(String sql, String... params) throws SQLException {
        PreparedStatement pst = connect.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pst.setString(i + 1, params[i]);
        }
        return pst.executeQuery();
    }

    // Function to get the connection (for custom queries)
    public Connection getConnection() {
        return connect;
    }

    // Function to close the connection
    public void closeConnection() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException ex) {
            System.out.println("Error closing connection: " + ex);
    }
}       
        
        public void deleteData(String sql) {
        try {
            PreparedStatement pst = connect.prepareStatement(sql);
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Data Deleted Successfully!");
            } else {
                System.out.println("No records deleted.");
            }

            pst.close();
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
        }
    }
    
 
 
}
