<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="/CSS/main.css">
    <script src="https://kit.fontawesome.com/9a87f95e59.js" crossorigin="anonymous"></script>
    <title>Adicionar Productos</title>
</head>

<body>
    <div class="row justify-content-center align-items-center ">

        <h1 class="text-center p3">Agregar un articulo</h1>
        <div class="container-xs col-4">
            <form class="" action="/Articulos" method="POST">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Cod</label>
                    <input type="number" class="form-control" name="codigo" maxlength="8">
                </div>
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label">Marca</label>
                    <input type="text" class="form-control" name="marca" maxlength="10" required>
                </div>
                <label class="form-label">Precio De Venta</label>
                <div class="input-group mb-3">
                    <span class="input-group-text">$</span>
                    <input type="text" class="form-control" name="p_venta" required
                        aria-label="Amount (to the nearest dollar)">
                    <span class="input-group-text">.00</span>
                </div>
                <label for="exampleInputEmail1" class="form-label">Precio Compra</label>
                <div class="input-group mb-3">
                    <span class="input-group-text">$</span>
                    <input type="text" class="form-control" name="p_compra" required"
                        aria-label="Amount (to the nearest dollar)">
                    <span class="input-group-text">.00</span>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Iva</label>
                    <input type="number" class="form-control" name="iva" maxlength="25" required>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Modelo</label>
                    <input type="text" class="form-control" name="modelo" required >
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Proveedor</label>
                    <input type="text" class="form-control" name="proveedor" required >
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Tienda</label>
                    <input type="text" class="form-control" name="tienda" required >
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Cantidad</label>
                    <input type="number" class="form-control" name="cantidad" required >
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Descripcion</label>
                    <input type="text" class="form-control" name="descripcion" required>
                </div>
                <div class="mb-3">
                    <label for="exampleInputPassword1" class="form-label">Categoria</label>
                    <input type="text" class="form-control" name="categoria" required >
                </div>
                
                <div class="p-3 m-0 border-0 justify-content-space-eveling">
                    <button type="submit" class="btn btn-success " name="accion" value="Create" >Agregar</button>
                    <button type="clear" class="btn btn-danger">Limpiar</button>
                    <button type="button" onclick="location.href='/VISTAS/Articulos/listar.jsp'"class="btn btn-secondary">Volver</button>
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