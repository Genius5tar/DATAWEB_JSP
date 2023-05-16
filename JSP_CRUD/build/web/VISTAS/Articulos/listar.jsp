<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Articulo"%>
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao.Articulo_DAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://kit.fontawesome.com/9a87f95e59.js" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="/JS/main.js"></script>
    <script src="/JS/sweet-alert.js"></script>
    <title>Mvc CRUD</title>
</head>
    <body>
        <div class="row justify-content-center align-items-center">
        <div class="container-xl col-xs-6 text-center ">
            <div class="container-fluid p6 b3 text-center">
                <h3>Lista de Articulos</h3>
                <button type="button" onclick="location.href='/Articulos?accion=agregar'" class="btn btn-outline-info">Agregar</button>
                <button type="button" onclick="location.href='/VISTAS/index.jsp'" class="btn btn-outline btn-danger">Volver</button>
                <br>
                </div>
                <div class="container">
                    <table class="table">
                        <thead class="bg-info">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Cod</th>
                                <th scope="col">Marca</th>
                                <th scope="col">Precio Venta</th>
                                <th scope="col">Precio Compra</th>
                                <th scope="col">Iva</th>
                                <th scope="col">Modelo</th>
                                <th scope="col">Tienda</th>
                                <th scope="col">Cantidad</th>
                                <th scope="col">Descripcion</th>
                                <th scope="col">Categoria</th>
                                <th scope="col">Acciones</th>


                            </tr>
                        </thead>
                        <tbody>
                         <%
                            Articulo_DAO dao=new Articulo_DAO();
                            List<Articulo>list=dao.listar();
                            Iterator<Articulo>iter=list.iterator();
                            Articulo art=null;
                            while(iter.hasNext()){
                                art=iter.next();
                         %>  
                            <tr>
                                <td><%= art.getId() %></td>  
                                <td><%= art.getCod() %></td>
                                <td><%= art.getMarca() %></td>
                                <td class="currency"><%= art.getP_venta() %></td>
                                <td class="currency"><%= art.getP_compra() %></td>
                                <td><%= art.getIva() %></td>
                                <td><%= art.getModelo() %></td>
                                <td><%= art.getTienda() %></td>
                                <td><%= art.getCantidad() %></td>
                                <td><%= art.getDescripcion() %></td>
                                <td><%= art.getCategoria() %></td>
                                <td>                                    
                                    <a type="button" href="/Articulos?accion=actualizar&id=<%= art.getId()%>" class="btn btn-small btn-warning"><i class="fa-solid fa-pen-to-square"></i></a>
                                    <a type="button" href="/Articulos?accion=eliminar&id=<%= art.getId()%>" class="btn btn-danger"><i class="fa-solid fa-trash"></i></a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        </div>
    </div>
    </body>
</html>
