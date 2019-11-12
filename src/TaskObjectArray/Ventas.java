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
public class Ventas {
    private String id;   
    private String fecha;
    private String nombre;
    private String descuento;
    private String montoFinal;
    
    public Ventas(){
        id = null;   
        fecha = null;
        nombre = null;
        descuento = null;
        montoFinal = null;           
    }
    
    public Ventas(String id, String fecha,String nombre,String descuento,String montoFinal ){
        this.id = id;
        this.fecha = fecha;
        this.descuento = descuento;
        this.montoFinal = montoFinal;
        this.nombre = nombre;
    }
    
    public String getId(){
        return id;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public String getDescuento(){
        return descuento;
    }
    
    public String getMontoFinal(){
        return montoFinal;
    }    
}
