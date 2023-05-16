/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.udec.devweb.activdad2.PedroDeHorta.interfaces;
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Articulo;
import java.util.List;
/**
 *
 * @author PEDRO DE HORTA
 */


public interface CRUD_A {
     public List listar();
        public boolean create(Articulo art);
        public Articulo readbyid(int id);
        public boolean update(Articulo art);
        public boolean delete(int id);
}
