
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gopal ji gupta
 */
import java.sql.*;
public class Db 
{
   public static Connection getConnection() throws SQLException
    {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/shopkeeper","root","123");
        return cn;
    }
}
