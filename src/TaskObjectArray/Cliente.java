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
public class Cliente {
    private String rut;
    private String nombre;
    private String direccion;
    private String telefono1;
    private String telefono2;
    private String telefono3;

    public Cliente(){
        this.rut = null;
        this.nombre = null;
        this.direccion = null;
        this.telefono1 = null;
        this.telefono2 = null;
        this.telefono3 = null;        
    }

    public Cliente(String rut, String nombre, String direccion, String telefono1, String telefono2, String telefono3){
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.telefono3 = telefono3;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public String getTelefono3() {
        return telefono3;
    }  
}
