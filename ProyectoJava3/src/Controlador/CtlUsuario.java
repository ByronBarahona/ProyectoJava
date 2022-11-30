package Controlador;

import Conexion.Conexion;
import Modelo.Usuario;
import java.sql.*;
import javax.swing.JOptionPane;

public class CtlUsuario {
    
    public boolean loginUser(Usuario ob){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        String sql = "select usuario, password from tb_usuario where usuario = '" + ob.getUsuario()+ "' and password = '" + ob.getPassword() + "'";
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                respuesta = true;
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesion" + e);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion, por favor contacte con al administrador");
        }
        return respuesta;
    }
}
