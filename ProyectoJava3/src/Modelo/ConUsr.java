package Modelo;

import Controlador.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConUsr extends Conexion{
    
    public boolean registrar(RUsuario usr)
    {
        PreparedStatement ps = null;
        Connection con = (Connection) getConexion();
        
        String sql = "insert into usuarios (usuario, password, nombre, correo, ultima_conexion, id_tip_usr) values (?,?,?,?,?,?)";
        
        try{
        ps = con.prepareStatement(sql);
        ps.setString(1, usr.getUsuario());
        ps.setString(2, usr.getPassword());
        ps.setString(3, usr.getNombre());
        ps.setString(4, usr.getCorreo());
        ps.setInt(5, usr.getId_tip_usr());
        ps.execute();
        return true;
        }catch(SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}
