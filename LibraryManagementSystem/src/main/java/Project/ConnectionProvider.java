/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MANDA MANOJ KUMAR
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        Connection con=null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","");
        }   
        catch(Exception e)
                {
                   // JOptionPane.showMessageDialog(null, e);
                    System.out.println(e);
                }
        return con;
    }
}
