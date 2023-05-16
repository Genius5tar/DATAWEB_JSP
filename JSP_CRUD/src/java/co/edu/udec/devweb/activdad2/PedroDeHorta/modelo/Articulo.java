/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.devweb.activdad2.PedroDeHorta.modelo;

/**
 *
 * @author PEDRO DE HORTA
 */
public class Articulo {
    int id;
    int cod;
    String marca;
    float p_venta;
    float p_compra;
    int iva;
    String modelo;
    String proveedor;
    String tienda;
    int cantidad;
    String descripcion;
    
    public Articulo(){
    
    }
    
    public int getId() {
        return id;
    }

    public int getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public float getP_venta() {
        return p_venta;
    }

    public float getP_compra() {
        return p_compra;
    }

    public int getIva() {
        return iva;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getTienda() {
        return tienda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }
    String categoria;

    public void setId(int id) {
        this.id = id;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setP_venta(float p_venta) {
        this.p_venta = p_venta;
    }

    public void setP_compra(float p_compra) {
        this.p_compra = p_compra;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Articulo(int cod, String marca, float p_venta, float p_compra, int iva, String modelo, String proveedor, String tienda, int cantidad, String descripcion, String categoria) {
        this.cod = cod;
        this.marca = marca;
        this.p_venta = p_venta;
        this.p_compra = p_compra;
        this.iva = iva;
        this.modelo = modelo;
        this.proveedor = proveedor;
        this.tienda = tienda;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

}
