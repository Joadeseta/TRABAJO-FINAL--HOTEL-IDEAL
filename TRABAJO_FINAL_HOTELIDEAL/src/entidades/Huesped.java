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

    private int idHuesped;
    private String nombre;
    private int dni;
    private String domicilio;
    private String correo;
    private int celular;
    private boolean estado;

    public Huesped(String nombre, int dni, String domicilio, String correo, int celular, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
    }

    public Huesped(int id, String nombre, int dni, String domicilio, String correo, int celular, boolean estado) {
        this.idHuesped = id;
        this.nombre = nombre;
        this.dni = dni;
        this.domicilio = domicilio;
        this.correo = correo;
        this.celular = celular;
        this.estado = estado;
    }

    public Huesped() {
    }

    

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int id) {
        this.idHuesped = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String huesped = "Huesped [idHuesped=" + idHuesped + ", dni=" + dni + " , nombre=" + nombre + "]";
        return huesped;
    }

}
