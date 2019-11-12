/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskObjectArray;

/**
 *
 * @author juanm
 */
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private String precio;
    private String stock;
    private String nombreProveedor;
    
    
    public Producto(String idProducto, String nombreProducto, String precio, String stock, String nombreProveedor) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.nombreProveedor = nombreProveedor;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public String getStock() {
        return stock;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }
    
}
