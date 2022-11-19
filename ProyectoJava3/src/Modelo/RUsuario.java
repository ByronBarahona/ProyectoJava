
package Modelo;

public class RUsuario {
    private int id;
    private String usuario;
    private String password;
    private String nombre;
    private String correo;
    private String ultima_conexion;
    private int Id_tip_usr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUltima_conexion() {
        return ultima_conexion;
    }

    public void setUltima_conexion(String ultima_conexion) {
        this.ultima_conexion = ultima_conexion;
    }

    public int getId_tip_usr() {
        return Id_tip_usr;
    }

    public void setId_tip_usr(int Id_tip_usr) {
        this.Id_tip_usr = Id_tip_usr;
    }
    
    
    
}
