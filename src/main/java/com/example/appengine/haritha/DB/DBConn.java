/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author milinda
 */
public class DBConn {

    private static Connection conn;

    private DBConn() {
    }

    public static Connection getConn() throws Exception{
        if (conn == null) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://146.148.63.129:3306/haritha", "root", "IronMan@123");
        }
        return conn;
    }

}
