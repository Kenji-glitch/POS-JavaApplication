package higopproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class database {
    
    public static Connection mycon(){
    
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos", "root", "");
            System.out.println("Connection established successfully!");
            return  con;
            
        } catch (ClassNotFoundException | SQLException e) {
            
            System.out.println(e);
            return null;
        }
    }
}
