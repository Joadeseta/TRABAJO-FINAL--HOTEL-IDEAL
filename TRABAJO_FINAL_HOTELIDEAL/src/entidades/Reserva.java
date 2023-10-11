package entidades;

import java.time.LocalDate;

public class Reserva {
    
    //Atributos de la clase.
    
    private int idReserva;
    private Huesped huesped;
    private int codigo;
    private int cantPersonas;
    private LocalDate Fecha_entrada;
    private LocalDate Fecha_salida;
    private double ImporteTotal;
    private boolean Estado;
    
    // Constructor por defecto.

    public Reserva() {
    }
    
    // Constructor para crear una nueva Reserva (sin ID).

    public Reserva(Huesped huesped, int codigo, int cantPersonas, LocalDate Fecha_entrada, LocalDate Fecha_salida, double ImporteTotal, boolean Estado) {
        this.huesped = huesped;
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.Fecha_entrada = Fecha_entrada;
        this.Fecha_salida = Fecha_salida;
        this.ImporteTotal = ImporteTotal;
        this.Estado = Estado;
    }
    
    // Constructor para crear una Reserva con un ID específico (normalmente desde la base de datos)

    public Reserva(int idReserva, Huesped huesped, int codigo, int cantPersonas, LocalDate Fecha_entrada, LocalDate Fecha_salida, double ImporteTotal, boolean Estado) {
        this.idReserva = idReserva;
        this.huesped = huesped;
        this.codigo = codigo;
        this.cantPersonas = cantPersonas;
        this.Fecha_entrada = Fecha_entrada;
        this.Fecha_salida = Fecha_salida;
        this.ImporteTotal = ImporteTotal;
        this.Estado = Estado;
    }

    // Métodos getters y setters para acceder y modificar los atributos de la entidad.
    // Estos son utilizados para obtener y establecer valores en los objetos Reserva.

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
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

    public LocalDate getFecha_entrada() {
        return Fecha_entrada;
    }

    public void setFecha_entrada(LocalDate Fecha_entrada) {
        this.Fecha_entrada = Fecha_entrada;
    }

    public LocalDate getFecha_salida() {
        return Fecha_salida;
    }

    public void setFecha_salida(LocalDate Fecha_salida) {
        this.Fecha_salida = Fecha_salida;
    }

    public double getImporteTotal() {
        return ImporteTotal;
    }

    public void setImporteTotal(double ImporteTotal) {
        this.ImporteTotal = ImporteTotal;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    // Método toString que devuelve una representación en texto de la Reserva.
    // En este caso, se muestra el ID de la Reserva, el codigo y la cantidad de personas.

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", cantPersonas=" + cantPersonas + ", ImporteTotal=" + ImporteTotal + '}';
    }
    
}
