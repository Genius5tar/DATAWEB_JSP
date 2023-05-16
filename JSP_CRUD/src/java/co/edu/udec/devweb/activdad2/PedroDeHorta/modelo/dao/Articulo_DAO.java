/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao;


import Config.Conexion;
import co.edu.udec.devweb.activdad2.PedroDeHorta.interfaces.CRUD_A;
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Articulo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Articulo_DAO implements CRUD_A {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Articulo art=new Articulo();
    
    
    @Override
    public List listar() {
        String sql="select * from articulos";
        ArrayList<Articulo>list=new ArrayList<>();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Articulo art=new Articulo();
                art.setId(rs.getInt("id"));
                art.setCod(rs.getInt("cod"));                
                art.setMarca(rs.getString("marca"));
                art.setP_venta(rs.getFloat("p_venta"));
                art.setP_compra(rs.getFloat("p_compra"));
                art.setIva(rs.getInt("iva"));
                art.setModelo(rs.getString("modelo"));
                art.setProveedor(rs.getString("proveedor"));
                art.setTienda(rs.getString("tienda"));
                art.setCantidad(rs.getInt("cantidad"));
                art.setDescripcion(rs.getString("descripcion"));
                art.setCategoria(rs.getString("categoria"));
                list.add(art);
            }
        } catch (Exception e) {
        }
        return list;   
        
    }

    @Override
    public boolean create(Articulo art) {
        String sql="insert into articulos (cod, marca, p_venta, P_compra, iva, modelo, proveedor, tienda, cantidad, descripcion, categoria)"
                + " values ("+art.getCod()+",'"+art.getMarca()+"',"+art.getP_venta()+","+art.getP_compra()+","+art.getIva()+",'"+art.getModelo()+"',"
                + "'"+art.getProveedor()+"','"+art.getTienda()+"',"+art.getCantidad()+",'"+art.getDescripcion()+"','"+art.getCategoria()+"')";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
            }catch(SQLException e){
            }
        return false; 
    
    }

    @Override
    public Articulo readbyid(int id) {
        String sql="select * from articulos where id="+id+"";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();           
            while(rs.next()){
                art.setId(rs.getInt("id"));
                art.setCod(rs.getInt("cod"));                
                art.setMarca(rs.getString("marca"));
                art.setP_venta(rs.getFloat("p_venta"));
                art.setP_compra(rs.getFloat("p_compra"));
                art.setIva(rs.getInt("iva"));
                art.setModelo(rs.getString("modelo"));
                art.setProveedor(rs.getString("proveedor"));
                art.setTienda(rs.getString("tienda"));
                art.setCantidad(rs.getInt("cantidad"));
                art.setDescripcion(rs.getString("descripcion"));
                art.setCategoria(rs.getString("categoria"));
            }
        } catch (Exception e) {
        }
        return art;         
    }

    @Override
    public boolean update(Articulo art) {
    String sql="UPDATE articulos SET cod="+art.getCod()+",marca='"+art.getMarca()+"',p_venta="+art.getP_venta()+",p_compra="+art.getP_compra()+",iva="+art.getIva()+",modelo='"+art.getModelo()+"'"
                + ", proveedor='"+art.getProveedor()+"',tienda='"+art.getTienda()+"',cantidad="+art.getCantidad()+",descripcion='"+art.getDescripcion()+"',categoria='"+art.getCategoria()+"' WHERE id="+art.getId()+"";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
            }catch(SQLException e){
            }
        return false; 
    
    }

    @Override
    public boolean delete(int id) {
        String sql="DELETE FROM `articulos` WHERE id="+id+"";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
        }catch(SQLException e){
            }
        return false; }
   
}