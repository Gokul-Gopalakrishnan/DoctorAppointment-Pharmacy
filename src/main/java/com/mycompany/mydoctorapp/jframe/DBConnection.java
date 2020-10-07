/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mydoctorapp.jframe;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Gokul-Anju
 */
public class DBConnection {
    static final String DB_URL = "jdbc:mysql://localhost:3307/docappointment";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            return conn;
        }catch(Exception ex){
            System.out.println("There were errors while connecting to Database.");
            return null;
        }
    }
}
