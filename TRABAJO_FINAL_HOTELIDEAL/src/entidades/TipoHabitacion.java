package entidades;

public class TipoHabitacion {
    
    //Atributos de la clase.
    
    private int idTipoHabitacion;
    private int codigo;
    private int capMaxima;
    private int cantCamas;
    private String tipoCamas;
    private double precPorNoche;
    private boolean Estado;
    
    // Constructor por defecto.

    public TipoHabitacion() {
    }
    
    // Constructor para crear un nuevo TipoHabitacion (sin ID).

    public TipoHabitacion(int codigo, int capMaxima, int cantCamas, String tipoCamas, double precPorNoche, boolean Estado) {
        this.codigo = codigo;
        this.capMaxima = capMaxima;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precPorNoche = precPorNoche;
        this.Estado = Estado;
    }
    
    // Constructor para crear un TipoHabitacion con un ID específico (normalmente desde la base de datos)

    public TipoHabitacion(int idTipoHabitacion, int codigo, int capMaxima, int cantCamas, String tipoCamas, double precPorNoche, boolean Estado) {
        this.idTipoHabitacion = idTipoHabitacion;
        this.codigo = codigo;
        this.capMaxima = capMaxima;
        this.cantCamas = cantCamas;
        this.tipoCamas = tipoCamas;
        this.precPorNoche = precPorNoche;
        this.Estado = Estado;
    }
    
    // Métodos getters y setters para acceder y modificar los atributos de la entidad.
    // Estos son utilizados para obtener y establecer valores en los objetos TipoHabitacion.

    public int getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(int idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
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

    public double getPrecPorNoche() {
        return precPorNoche;
    }

    public void setPrecPorNoche(double precPorNoche) {
        this.precPorNoche = precPorNoche;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    // Método toString que devuelve una representación en texto del TipoHabitacion.
    // En este caso, se muestra el ID del TipoHabitacion, el codigo, la capacidad máxima y el tipo de camas.

    @Override
    public String toString() {
        return "TipoHabitacion{" + "idTipoHabitacion=" + idTipoHabitacion + ", codigo=" + codigo + ", capMaxima=" + capMaxima + ", tipoCamas=" + tipoCamas + '}';
    }   
    
    
}
