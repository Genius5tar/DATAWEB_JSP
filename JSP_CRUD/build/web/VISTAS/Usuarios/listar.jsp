<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Usuario"%>
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao.Usuario_DAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/9a87f95e59.js" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="./js/sweet-alert.js"></script>
        <title>Mvc CRUD</title>
    </head>
    <body>
        <div class="row justify-content-center align-items-center">
        <div class="container-xl col-xs-6 text-center ">
            ${Alert}
            <div class="container-fluid p6 b3 text-center">
                <h3>Lista de usuarios</h3>
                <button type="button" onclick="location.href='/Usuarios?accion=agregar'" class="btn btn-outline-info">Agregar</button>
                <button type="button" onclick="location.href='/VISTAS/index.jsp'" class="btn btn-outline btn-danger">Volver</button>


                <br>
            </div>
            <div class="container">
                <table class="table">
                    <thead class="bg-info">
                        <tr>
                            <th scope="col">ID</th>
                            <th scope="col">NickName</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Identificacion</th>
                            <th scope="col">Tipo de usuario</th>
                            <th scope="col">Acciones</th>

                        </tr>
                    </thead>
                    <tbody>
                    <%
                        Usuario_DAO dao=new Usuario_DAO();
                        List<Usuario>list=dao.listar();
                        Iterator<Usuario>iter=list.iterator();
                        Usuario usr=null;
                        while(iter.hasNext()){
                            usr=iter.next();

                     %>  
                     <tbody>
                        <tr>
                            <td><%= usr.getId()%></td>
                            <td><%= usr.getUsername()%></td>
                            <td><%= usr.getNombre()%></td>
                            <td><%= usr.getDocumento()%></td>
                            <td><%= usr.getUser_type()%></td>
                            <td>                                    
                                <a type="button" href="/Usuarios?accion=actualizar&id=<%= usr.getId()%>" class="btn btn-small btn-warning"><i class="fa-solid fa-pen-to-square"></i></a>
                                <a type="button" href="/Usuarios?accion=eliminar&id=<%= usr.getId()%>" class="btn btn-danger"><i class="fa-solid fa-trash"></i></a>
                            </td>
                        </tr>
                         <%}%>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    </body>
</html>