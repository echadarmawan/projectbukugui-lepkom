/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author DARMAWAN
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        // cek apakah koneksi null
        // jika null, maka kita mendeklarasikan sebuah koneksi baru
        if (koneksi == null) {
            try {
                String DB_URL = "jdbc:mysql://localhost:3306/bukugui";
                String DB_USER = "root";
                String DB_PASSWORD = "";
            
                koneksi = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            } catch(SQLException e) {
                System.out.println("Gagal Koneksi Database " + e);
            }
        }
        return koneksi;
    }
}
