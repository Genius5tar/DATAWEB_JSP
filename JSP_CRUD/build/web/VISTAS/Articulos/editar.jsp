
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.Articulo"%>
<%@page import="co.edu.udec.devweb.activdad2.PedroDeHorta.modelo.dao.Articulo_DAO"%>
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

    <title>Editar Productos</title>
</head>

            <%
                Articulo_DAO U_dao=new Articulo_DAO();
                int id=Integer.parseInt(request.getParameter("id"));
                Articulo art=(Articulo)U_dao.readbyid(id);            
            %>

<body>
    <div class="row justify-content-center align-items-center ">

        <h1 class="text-center p3">Editar articulo Cod (<%= art.getCod()%>)</h1>
        <div class="container-xs col-4">
            <form class="" action="/Articulos" method="POST" >
                
                <fieldset disabled>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Cod</label>
                    <input type="number" class="form-control" name="codigo" maxlength="8" value="<%= art.getCod()%>">
                </div>
                </fieldset>
                
                <input type="hidden" class="form-control" name="id" maxlength="8" value="<%= art.getId()%>">
                <input type="hidden" class="form-control" name="codigo" maxlength="8" value="<%= art.getCod()%>">

                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Marca</label>
                    <input type="text" class="form-control" name="marca" maxlength="10" required value="<%= art.getMarca()%>">
                </div>
                <label class="form-label">Precio De Venta</label>
                <div class="input-group mb-3">
                    <span class="input-group-text">$</span>
                    <input type="text" class="form-control" name="p_venta" required value="<%= art.getP_venta()%>"
                        aria-label="Amount (to the nearest dollar)">
                    <span class="input-group-text">.00</span>
                </div>
                <label for="exampleInputEmail1" class="form-label">Precio Compra</label>
                <div class="input-group mb-3">
                    <span class="input-group-text">$</span>
                    <input type="text" class="form-control" name="p_compra" required value="<%= art.getP_compra()%>"
                        aria-label="Amount (to the nearest dollar)">
                    <span class="input-group-text">.00</span>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Iva</label>
                    <input type="number" class="form-control" name="iva" maxlength="25" required value="<%= art.getIva()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Modelo</label>
                    <input type="text" class="form-control" name="modelo" required value="<%= art.getModelo()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Proveedor</label>
                    <input type="text" class="form-control" name="proveedor" required value="<%= art.getProveedor()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Tienda</label>
                    <input type="text" class="form-control" name="tienda" required value="<%= art.getTienda()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Cantidad</label>
                    <input type="number" class="form-control" name="cantidad" required value="<%= art.getCantidad()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Descripcion</label>
                    <input type="text" class="form-control" name="descripcion" required value="<%= art.getDescripcion()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Categoria</label>
                    <input type="text" class="form-control" name="categoria" required value="<%= art.getCategoria()%>">
                </div>
                
                <div class="p-3 m-0 border-0 justify-content-space-eveling">
                <button type="submit" class="btn btn-warning " value="Update" name="accion">Editar</button>
                <button type="button" onclick="location.href='/VISTAS/Articulos/listar.jsp'" class="btn btn-secondary">Volver</button>
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