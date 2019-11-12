/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaskObjectArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author juanm
 */
public class TareaArrglodeObjetos {
   
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("*************** Ingrese datos***************");
        
        System.out.println("Ingrese nombre de cliente: ");
        String nombre = br.readLine();
        System.out.println("Ingrese rut de cliente: ");
        String rut = br.readLine();
        System.out.println("Ingrese direccion de cliente: ");
        String direccion = br.readLine();
        System.out.println("Ingrese telefono de cliente: ");
        String telefono1 = br.readLine();
        
        Cliente cliente = new Cliente(rut,nombre,direccion,telefono1,null,null);
        
        System.out.println("Ingrese numero de productos a guardar: ");
        int numProductos = Integer.valueOf(br.readLine());
        
        Producto producto[] = new Producto[numProductos];
        
        for (int i=0; i<producto.length; i++) {
            System.out.println("Ingrese codigo de producto " + (i+1) + " : ");
            String idProducto =  br.readLine();
            System.out.println("Ingrese nombre de producto " + (i+1) + " : ");
            String nombreProducto = br.readLine();
            System.out.println("Ingrese precio de producto " + (i+1) + " : ");
            String precio = br.readLine();
            System.out.println("Ingrese stock de producto " + (i+1) + " : ");
            String stock = br.readLine();
            System.out.println("Ingrese proveedor de producto " + (i+1) + " : ");
            String nombreProveedor = br.readLine();
            producto[i] = new Producto(idProducto,nombreProducto,precio,stock,nombreProveedor); 
        }  
        
       System.out.println("Ingrese nombre de proveedor: ");
       nombre = br.readLine();
       System.out.println("Ingrese rut de proveedor: ");
       rut = br.readLine();
       System.out.println("Ingrese direccion de proveedor: ");
       direccion = br.readLine();
       System.out.println("Ingrese telefono de proveedor: ");
       String telefono = br.readLine();
       System.out.println("Ingrese pagina web de proveedor: ");
       String web = br.readLine();
        
       Proveedor proveedor = new Proveedor(rut,nombre,direccion,telefono,web);        
       
       System.out.println("Ingrese codigo de la venta: ");
       String id = br.readLine();
       System.out.println("Ingrese fecha de la venta: ");
       String fecha = br.readLine();
       System.out.println("Ingrese nombre: ");       
       nombre = br.readLine();
       System.out.println("Ingrese descuento de la venta: ");        
       String descuento = br.readLine();
       System.out.println("Ingrese monto final de la venta: "); 
       String montoFinal = br.readLine();  
        
       Ventas venta = new Ventas(id,fecha,nombre,descuento,montoFinal);        
       
        System.out.println("Nombre Cliente: " + cliente.getNombre());
        System.out.println("Rut Cliente: " + cliente.getRut());
        System.out.println("Direccion Cliente: " + cliente.getDireccion());
        System.out.println("Telefono Cliente: " + cliente.getTelefono1());

        for(int i=0; i<producto.length;i++){
            System.out.println("Codigo de producto " + (i+1) + " : " + producto[i].getIdProducto());
            System.out.println("Nombre de producto " + (i+1) + " : " + producto[i].getNombreProducto());
            System.out.println("Precio de producto " + (i+1) + " : " + producto[i].getPrecio());
            System.out.println("Stock de producto " + (i+1) + " : " + producto[i].getStock());   
            System.out.println("Proveedor de producto " + (i+1) + " : " + producto[i].getNombreProveedor()); 
        } 
        
        System.out.println("Nombre proveedor: " + proveedor.getNombre());
        System.out.println("Rut proveedor: " + proveedor.getRut());
        System.out.println("Direccion proveedor: " + proveedor.getDireccion());
        System.out.println("Telefono proveedor: " + proveedor.getTelefono());  
        System.out.println("Web proveedor: " + proveedor.getWeb());

        System.out.println("Codigo de la venta: " + venta.getNombre());
        System.out.println("Fecha de la venta: " + venta.getFecha());
        System.out.println("Nombre: " + venta.getNombre());
        System.out.println("Descuento de la venta: " + venta.getDescuento()); 
        System.out.println("Monto final de la venta: " + venta.getMontoFinal());         
    }    
    
}
