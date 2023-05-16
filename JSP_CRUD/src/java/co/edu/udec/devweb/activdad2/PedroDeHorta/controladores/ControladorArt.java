/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.edu.udec.devweb.activdad2.PedroDeHorta.controladores;

/*import jakarta.servlet.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;*/
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Articulo;
import co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao.Articulo_DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControladorArt extends HttpServlet {
    
    String agregar="/VISTAS/Articulos/agregar.jsp";
    String editar="/VISTAS/Articulos/editar.jsp";
    String listar="/VISTAS/Articulos/listar.jsp";
    String acceso="";
    Articulo art=new Articulo();
    Articulo_DAO A_dao=new Articulo_DAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControladorArt</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControladorArt at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        if(accion.equalsIgnoreCase("listar")){
            acceso=listar;
        }else if(accion.equalsIgnoreCase("agregar")){
            acceso=agregar;
        }else if(accion.equalsIgnoreCase("eliminar")){
           int id=Integer.parseInt(request.getParameter("id"));
           art.setId(id);
           A_dao.delete(id);
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
        if(accion.equalsIgnoreCase("Create")){   
            String cod=request.getParameter("codigo");            
            String marca=request.getParameter("marca");
            String p_venta=request.getParameter("p_venta");
            String p_compra=request.getParameter("p_compra");
            String iva=request.getParameter("iva");
            String modelo=request.getParameter("modelo");
            String proveedor=request.getParameter("proveedor");
            String tienda=request.getParameter("tienda");
            String cantidad=request.getParameter("cantidad");
            String descripcion=request.getParameter("descripcion");
            String categoria=request.getParameter("categoria");
            
            art.setCod(Integer.parseInt(cod));
            art.setMarca(marca);
            art.setP_venta(Float.parseFloat(p_venta));
            art.setP_compra(Float.parseFloat(p_compra));
            art.setIva(Integer.parseInt(iva));
            art.setModelo(modelo);            
            art.setProveedor(proveedor);           
            art.setTienda(tienda);            
            art.setCantidad(Integer.parseInt(cantidad));
            art.setDescripcion(descripcion);
            art.setCategoria(categoria);
            
            A_dao.create(art);
            acceso=listar; 
            
        }else if(accion.equalsIgnoreCase("Update")){
            String id=request.getParameter("id");
            String cod=request.getParameter("codigo");            
            String marca=request.getParameter("marca");
            String p_venta=request.getParameter("p_venta");
            String p_compra=request.getParameter("p_compra");
            String iva=request.getParameter("iva");
            String modelo=request.getParameter("modelo");
            String proveedor=request.getParameter("proveedor");
            String tienda=request.getParameter("tienda");
            String cantidad=request.getParameter("cantidad");
            String descripcion=request.getParameter("descripcion");
            String categoria=request.getParameter("categoria");
            
            art.setId(Integer.parseInt(id));
            art.setCod(Integer.parseInt(cod));
            art.setMarca(marca);
            art.setP_venta(Float.parseFloat(p_venta));
            art.setP_compra(Float.parseFloat(p_compra));
            art.setIva(Integer.parseInt(iva));
            art.setModelo(modelo);            
            art.setProveedor(proveedor);           
            art.setTienda(tienda);            
            art.setCantidad(Integer.parseInt(cantidad));
            art.setDescripcion(descripcion);
            art.setCategoria(categoria);
            
            A_dao.update(art);
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
