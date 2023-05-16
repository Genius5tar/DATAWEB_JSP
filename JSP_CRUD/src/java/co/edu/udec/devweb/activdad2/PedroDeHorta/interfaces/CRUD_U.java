
package co.edu.udec.devweb.activdad2.PedroDeHorta.interfaces;

import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Usuario;
import java.util.List;
/**
 *
 * @author PEDRO DE HORTA
 */
public interface CRUD_U {
        public List listar();
        public boolean registro(Usuario usr);
        public boolean create(Usuario usr);
        public Usuario readbyid(int id);
        public boolean update(Usuario usr);
        public boolean delete(int id);
}


