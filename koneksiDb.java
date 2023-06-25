package guidatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class koneksiDb {
   public static Connection conn;
   public static Statement stm;
   public String usr;
   
   public koneksiDb(String usr) {
       try {
           conn=DriverManager.getConnection("jdbc:mysql://localhost/barang","root","");
           stm=conn.createStatement();
           JOptionPane.showMessageDialog(null, 
                   "Koneksi Berhasil !");
       } catch (SQLException ex) {
           Logger.getLogger(koneksiDb.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
   
    public static Connection getConn() {
        return conn;
    }
   
    public static void main(String[] args) {
        koneksiDb Konn=new koneksiDb("barang");
    }
}
