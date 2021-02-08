/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalapp;

import java.sql.*;
import javax.swing.JOptionPane;

public class connection {

     Connection conn;
     
    public static Connection ConnectDb(){
       
       try{
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/medicleapp","root","");
           return conn;
       }catch(ClassNotFoundException | SQLException e)
       {
           JOptionPane.showMessageDialog(null,e);
           return null;
       }
   }
    
}
