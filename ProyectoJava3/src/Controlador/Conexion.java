package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
 private String user = "root";
 private String pass = "root";
 private String srv = "jdbc:mysql://localhost/Examen3";

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getSrv() {
        return srv;
    }

    public void setSrv(String srv) {
        this.srv = srv;
    }

    public Conexion(String user, String pass, String srv) {
        this.user = user;
        this.pass = pass;
        this.srv = srv;
    }
    
    
 
 
 public boolean conexion(){
     boolean resultado = false;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection(srv, user,pass);
         
     }catch(Exception e) {
            e.printStackTrace();
     }
     return false;
 }
 
}
