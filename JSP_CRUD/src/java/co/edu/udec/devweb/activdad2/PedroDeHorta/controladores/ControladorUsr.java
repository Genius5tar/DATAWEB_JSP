/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.udec.devweb.activdad2.PedroDeHorta.controladores;

/*import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;*/
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Usuario;
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao.Usuario_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author PEDRO DE HORTA
 */
public class ControladorUsr extends HttpServlet {
    
    String agregar="/VISTAS/Usuarios/agregar.jsp";
    String editar="/VISTAS/Usuarios/editar.jsp";
    String listar="/VISTAS/Usuarios/listar.jsp";
    String principal="/VISTAS/index.jsp";
    String login="/index.jsp";
    String acceso="";
    Usuario usr=new Usuario();
    Usuario_DAO U_dao=new Usuario_DAO();
    
    

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          
    }
        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("listar")){
            acceso=listar;
        }else if(accion.equalsIgnoreCase("logout")){
            HttpSession session = request.getSession(false);
            if (session != null) {
                session.invalidate(); // Invalida la sesión actual
            }
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }else if(accion.equalsIgnoreCase("agregar")){
            acceso=agregar;
        }else if(accion.equalsIgnoreCase("eliminar")){
           int id=Integer.parseInt(request.getParameter("id"));
           usr.setId(id);
           U_dao.delete(id);
           request.setAttribute("Alert","<div class=\"alert alert-success\" role=\"alert\">\n" +
"            Usuario Elimindao con exito.\n" +
"            </div>");
           acceso=listar;
        }else if(accion.equalsIgnoreCase("actualizar")){
            acceso=editar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);  
    }   
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        HttpSession sesion=request.getSession();
        Usuario_DAO U_dao=new Usuario_DAO();   
        
        if (accion.equalsIgnoreCase("login")) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if (username.isEmpty() || password.isEmpty()) {
                request.setAttribute("message", "<div class=\"alert alert-danger\" role=\"alert\">\n" +
"        Error al iniciar Sesion<a class=\"alert-link\">Nombre de usuario y contraseña son obligatorios</a>.\n" +
"    </div>");
                request.setAttribute("usr_error","Usuario no Existe");
                acceso=login;
            } else {
                Usuario ulog=U_dao.login(username, password);
                sesion.setAttribute("username", ulog.getUsername());
                acceso=principal;
            }
        }else if(accion.equalsIgnoreCase("Create")){   
            String username=request.getParameter("username");
            String nombre=request.getParameter("nombre");
            String documento=request.getParameter("documento");
            String password=request.getParameter("password");
            String user_type=request.getParameter("user_type");
            
            usr.setUsername(username);
            usr.setNombre(nombre);
            usr.setDocumento(Integer.parseInt(documento));
            usr.setPassword(password);
            usr.setUser_type(Integer.parseInt(user_type));
            U_dao.create(usr);
            request.setAttribute("Alert","<div class=\"alert alert-success\" role=\"alert\">\n" +
"            Usuario <a class=\"alert-link\">"+username+"</a>. Creado con exito.\n" +
"            </div>");
            acceso=listar; 
        }else if(accion.equalsIgnoreCase("Registro")){
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            String user_type=request.getParameter("user_type");
            usr.setUsername(username);
            usr.setPassword(password);
            usr.setUser_type(Integer.parseInt(user_type));
            U_dao.registro(usr);
            request.setAttribute("Alert","<div class=\"alert alert-success\" role=\"alert\">\n" +
"            Registro exitoso, Por Favor Inicie sesion.\n" +
"            </div>");
            acceso=login;            
        }else if(accion.equalsIgnoreCase("Update")){
            String id=request.getParameter("id");
            String username=request.getParameter("username");
            String nombre=request.getParameter("nombre");
            String documento=request.getParameter("documento");
            String password=request.getParameter("password");
            String user_type=request.getParameter("user_type");
            
            usr.setId(Integer.parseInt(id));
            usr.setUsername(username);
            usr.setNombre(nombre);
            usr.setDocumento(Integer.parseInt(documento));
            usr.setPassword(password);
            usr.setUser_type(Integer.parseInt(user_type));
            U_dao.update(usr);
            request.setAttribute("Alert","<div class=\"alert alert-success\" role=\"alert\">\n" +
"            Nuevo usuario agregado con exito.\n" +
"            </div>");
            acceso=listar;
        }
       RequestDispatcher vista=request.getRequestDispatcher(acceso);
       vista.forward(request, response);  
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
