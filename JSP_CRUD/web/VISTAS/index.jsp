<%-- 
    Document   : index
    Created on : 4/05/2023, 8:59:49 p. m.
    Author     : PEDRO DE HORTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if(session.getAttribute("username")==null){
        response.sendRedirect("/index.jsp"); 
    }

%>

<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<title>Bienvenido</title>
	<!-- Incluye los archivos CSS y JavaScript de Bootstrap -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	    <link rel="stylesheet" href="/CSS/main.css">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<!-- Estilo personalizado para los botones -->

</head>
<body>
    <div class="card-body d-flex justify-content-between align-items-center">
        Crud de Articulos con sus respectivos Usuarios de acceso y control
        <a href="/Usuarios?accion=logout" class="btn btn-primary btn-sm btn-exit">Cerrar Sesion</a>
    </div>
    <div class="text-center margin-top-2cm">
        <h1>Bienvenido</h1>
        <h2><%=session.getAttribute("username")%></h2>

    </div>
	<div class="d-flex align-items-center justify-content-center" style="height: 100vh">
		
        <div class="text-center">
            <a class="btn btn-lg btn-custom" href="/Usuarios?accion=listar">Ver Usuarios</a>
            <a class="btn btn-lg btn-primary" href="/Articulos?accion=listar">Ver Articulos</a>
		</div>
		
	</div>
</body>
</html>
