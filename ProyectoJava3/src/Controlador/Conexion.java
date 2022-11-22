package Controlador;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/Examen3";
    private final String user = "root";
    private final String pass = "root";
    
    public Conexion getConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        }
        catch(ClassNotFoundException | SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (Conexion) conn;
    }

}