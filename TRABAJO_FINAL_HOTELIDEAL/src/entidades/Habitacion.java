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

    public boolean isEstado() {
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

    public class TipoHabitacion {
    private int codigo;
    private int cantPersonas;
    private int cantCamas;
    private String tipoCamas;
    private double precioNoche;

    // Constructor
    public TipoHabitacion(int codigo, int cantPersonas, int cantCamas, String tipoCamas, double precioNoche) {
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precioNoche = precioNoche;
    }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public int getCantPersonas() {
            return cantPersonas;
        }

        public void setCantPersonas(int cantPersonas) {
            this.cantPersonas = cantPersonas;
        }

        public int getCantCamas() {
            return cantCamas;
        }

        public void setCantCamas(int cantCamas) {
            this.cantCamas = cantCamas;
        }

        public String getTipoCamas() {
            return tipoCamas;
        }

        public void setTipoCamas(String tipoCamas) {
            this.tipoCamas = tipoCamas;
        }

        public double getPrecioNoche() {
            return precioNoche;
        }

        public void setPrecioNoche(double precioNoche) {
            this.precioNoche = precioNoche;
        }
    }
}    
