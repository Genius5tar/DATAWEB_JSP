
package co.edu.udec.devweb.activdad2.PedroDeHorta.modelo;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Usuario {
    int id;
    String username;
    String nombre;
    int documento;
    String password;
    int user_type;

    public Usuario() {
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public String getPassword() {
        return password;
    }

    public int getUser_type() {
        return user_type;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public Usuario(int id, String username, String nombre, int documento, String password, int user_type) {
        this.username = username;
        this.nombre = nombre;
        this.documento = documento;
        this.password = password;
        this.user_type = user_type;
    }

}
