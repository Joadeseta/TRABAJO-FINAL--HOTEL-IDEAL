/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Alan
 */
public class Habitacion {
    private int idHabitacion;
    private int codigo;
    private int numeroHabitacion;
    private boolean estado;
    private TipoHabitacion tipoHabitacion;

    // Constructor
    public Habitacion(int idHabitacion, int codigo, int numeroHabitacion, boolean estado, TipoHabitacion tipoHabitacion) {
        this.idHabitacion = idHabitacion;
        this.codigo = codigo;
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }
    
    public Habitacion(int codigo, int numeroHabitacion, boolean estado, TipoHabitacion tipoHabitacion) {
        this.codigo = codigo;
        this.numeroHabitacion = numeroHabitacion;
        this.estado = estado;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Habitacion() {
    }
    

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
     @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", codigo=" + codigo + ", numero de habitacion=" + numeroHabitacion + ", estado" + estado + ", tipo de habitacion" + tipoHabitacion + '}';
    }

}    

}    

