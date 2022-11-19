package Modelo;

import Controlador.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Logear {
    //Variables para login
    private String usuario;
    private String contraseña;
    
    //Variables de conexion
    Conexion connSeg = new Conexion();
    private Connection connect;
    private DefaultTableModel modelo;
    private Statement st;
    private ResultSet rs;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public boolean ValLogin(usuario usr){
        connect = connSeg.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        connect = connSeg.getConnection();
        
        String sql = "select  from seguridad where usuario = ?";
        
        try{
            ps = connect.prepareStatement(sql);
            ps.setString(1, usr.);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
                
            }
            
            return 1;
            
        }catch(SQLException ex){
         Logger.getLogger(Logear.class.getName()).log(Level.SEVERE, null, ex);
         return 1;
        }  
    }
    
   public int existeUsuario(String usuario){
        connect = connSeg.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        connect = connSeg.getConnection();
        
        String sql = "select count(id) from seguridad where usuario = ?";
        
        try{
            ps = connect.prepareStatement(sql);
            ps.setString(1,usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
                
            }
            
            return 1;
            
        }catch(SQLException ex){
         Logger.getLogger(Logear.class.getName()).log(Level.SEVERE, null, ex);
         return 1;
        }  
   }
}
