<%-- 
    Document   : index.jsp
    Created on : 13/05/2023, 11:26:44 p. m.
    Author     : PEDRO DE HORTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="/CSS/main.css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <title>Document</title>
</head>
<body>

<!------ Include the above in your HEAD tag ---------->

<div class="wrapper fadeInDown">
  <div id="formContent">
    <!-- Iconos -->
          ${message}
          ${Alert}
    <div class="fadeIn first">
      <img src="/IMG/User_Avatar.png" alt="" id="icon" alt="User Icon">
    </div>

    <!-- Formulario Login -->
    <form action="/Usuarios" method="post" >
      <input type="text"  class="fadeIn second" name="username" placeholder="User">     
      <input type="password"  class="fadeIn third" name="password" placeholder="Password">
      <input type="submit" class="fadeIn fourth" name="accion" value="login">
      <input type="button" class="fadeIn fourth" onclick="location.href='VISTAS/Login/registro.jsp';" value="registro">
    </form>

    <!-- Recordar Credenciales -->
    <div id="formFooter">
      <a class="underlineHover" href="">***In User and Passowrd use admin***</a>
      <a class="underlineHover" href="VISTAS/Login/registro.jsp">***Or Register Here***</a>
    </div>

  </div>
</div>
    
</body>
</html>
