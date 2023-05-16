package co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao;


import Config.Conexion;
import co.edu.udec.devweb.activdad2.PedroDeHorta.interfaces.CRUD_U;
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import static org.apache.tomcat.jni.User.username;


/**
 *
 * @author PEDRO DE HORTA
 */
public class Usuario_DAO implements CRUD_U {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario usr=new Usuario();
    int auth = 0;

    @Override
    public List listar() {
        String sql="select * from usuarios";
        ArrayList<Usuario>list=new ArrayList<>();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario usr=new Usuario();
                usr.setId(rs.getInt("Id"));
                usr.setUsername(rs.getString("username"));
                usr.setNombre(rs.getString("nombre"));
                usr.setDocumento(rs.getInt("documento"));
                usr.setPassword(rs.getString("password"));
                usr.setUser_type(rs.getInt("user_type"));
                list.add(usr);
            }
        } catch (Exception e) {
        }
        return list;
    }    
    
    @Override
    public boolean registro(Usuario usr) {
    String sql="insert into usuarios (username,nombre,documento,password,user_type)values ('"+usr.getUsername()+"', 'n/a', 0000, '"+usr.getPassword()+"', "+usr.getUser_type()+")";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
        }catch(SQLException e){
            }
        return false;   
    }
    
    public Usuario login(String username, String password) {
        String sql= "SELECT * FROM usuarios WHERE username=? AND password =? ";
        try{
             con=cn.getConnection();
             ps=con.prepareStatement(sql);
             ps.setString(1, username);
             ps.setString(2, password);
             rs=ps.executeQuery();      
             
            while(rs.next()){
                usr.setId(rs.getInt(1));
                usr.setUsername(rs.getString(2));
                usr.setNombre(rs.getString(3));
                usr.setDocumento(rs.getInt(4));
                usr.setUser_type(rs.getInt(6));
            } 
        }catch (SQLException e) {
            return null;
        }
        
        return usr;
    }   
        
    @Override
    public boolean create(Usuario usr) {
    String sql="insert into usuarios (username,nombre,documento,password,user_type)values ('"+usr.getUsername()+"', '"+usr.getNombre()+"', "+usr.getDocumento()+", '"+usr.getPassword()+"', "+usr.getUser_type()+")";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
            }catch(SQLException e){
            }
        return false;   
    }

    @Override
    public Usuario readbyid(int id) {
       String sql="select * from usuarios where id="+id+"";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                usr.setId(rs.getInt("Id"));
                usr.setUsername(rs.getString("username"));
                usr.setNombre(rs.getString("nombre"));
                usr.setDocumento(rs.getInt("documento"));
                usr.setPassword(rs.getString("password"));
                usr.setUser_type(rs.getInt("user_type"));
            }
        } catch (Exception e) {
        }
        return usr;
    }

    @Override
    public boolean update(Usuario usr) {
      String sql="UPDATE usuarios SET username='"+usr.getUsername()+"' ,nombre='"+usr.getNombre()+"',documento="+usr.getDocumento()+",password='"+usr.getPassword()+"',user_type="+usr.getUser_type()+" WHERE id="+usr.getId()+"";
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
        String sql="DELETE FROM `usuarios` WHERE id="+id+"";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql); 
            ps.executeUpdate();
        }catch(SQLException e){
            }
        return false;   
    }   

    
}
