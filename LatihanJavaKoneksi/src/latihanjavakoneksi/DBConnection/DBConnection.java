/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.DBConnection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Wibby Chandra
 */
public class DBConnection {
    public static Connection open()
    {
        Connection con;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3306/latihanjava";
            //latihanjava stands for your database name
            
            con = (Connection) DriverManager.getConnection(url,"homestead", "secret");
            //homestead is username
            //secret is password
            return con;
        }
        catch (Exception e)
        {
            System.err.println(e);
            return null;
        }
    }
}
