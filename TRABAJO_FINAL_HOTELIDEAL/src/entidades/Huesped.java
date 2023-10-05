/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author joadz
 */
public class Huesped {
    

    private int id;
    private String nombre;
    private String dni;
    private String domicilio;
    private String correo;
    private String celular;

    public Huesped(String nombre, String dni, String domicilio, String correo, String celular) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public Huesped(int id, String nombre, String dni, String domicilio, String correo, String celular) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
   
}



