package Config;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/final_project";
                String user = "root";
                String password = "";
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil!");
                return conn;
                
            } catch (Exception e) {
                System.out.println("Error Koneksi: " + e.getMessage());
            }
        }
        return conn;
    }
}
