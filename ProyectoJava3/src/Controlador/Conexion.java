package Controlador;
import java.sql.*;

public class Conexion {
    private Connection conn;
    private String url = "jdbc:mysql://localhost:3306/Examen3";
    private String user = "root";
    private String pass = "root";
    
    public Conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
        }
        catch(Exception e){
            System.out.println("Error Fatal"+e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
}