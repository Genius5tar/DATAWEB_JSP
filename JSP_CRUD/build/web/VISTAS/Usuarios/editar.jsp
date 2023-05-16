<%-- 
    Document   : edit_logins
    Created on : 5/05/2023, 3:41:19 p. m.
    Author     : PEDRO DE HORTA
--%>
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Usuario"%>
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao.Usuario_DAO"%>
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
    <title>Editar Usuarios</title>
</head>
            <%
                Usuario_DAO U_dao=new Usuario_DAO();
                int id=Integer.parseInt(request.getParameter("id"));
                Usuario usr=(Usuario)U_dao.readbyid(id);            
            %>

<body>
    <div class="row justify-content-center align-items-center ">

        <h1 class="text-center p3">Editar articulo Cod (<%= usr.getId()%>)</h1>
        <div class="container-xs col-4">

            <form class="" action="/Usuarios" method="POST" >
                
                <fieldset disabled>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">ID</label>
                    <input type="number" class="form-control" name="id" maxlength="8" value="<%= usr.getId()%>">
                </div>                
                </fieldset>
                
                <div class="mb-3">
                    <input type="hidden" class="form-control" name="id" maxlength="8" value="<%= usr.getId()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">NickName</label>
                    <input type="text" class="form-control" name="username" maxlength="15" required value="<%= usr.getUsername()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Nombre</label>
                    <input type="text" class="form-control" name="nombre" maxlength="11" required value="<%= usr.getNombre()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">No. documento</label>
                    <input type="number" class="form-control" name="documento" required value="<%= usr.getDocumento()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Contraseña</label>
                    <input type="password" class="form-control" name="password" maxlength="255" required value="<%= usr.getPassword()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Tipo de Usuario</label>
                    <input type="number" class="form-control" name="user_type" required value="<%= usr.getUser_type()%>">
                </div>
                
               
                <div class="p-3 m-0 border-0 justify-content-space-eveling">
                <button type="submit" class="btn btn-warning " name="accion" value="Update" >Editar</button>
                <button type="button" onclick="location.href='/VISTAS/Usuarios/listar.jsp'" class="btn btn-secondary">Volver</button>
                </div>
            </form>
        </div>


    </div>

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous">
    </script>
</body>

</html>