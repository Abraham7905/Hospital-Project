package Autonoma.Hospital.models;

/**
 * Representa un medicamento.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public abstract class Medicamento {
    
    private String nombre;
    private String descripcion;
    private Enfermedad enfermedadAlivia;
    private double costo;
    private double precioVenta;

    /**
     * Crea un nuevo medicamento con el nombre, la descripción, la enfermedad que alivia, y el costo especificados.
     * 
     * @param nombre El nombre del medicamento.
     * @param descripcion La descripción del medicamento.
     * @param enfermedadAlivia La enfermedad que alivia el medicamento.
     * @param costo El costo del medicamento.
     */
    public Medicamento(String nombre, String descripcion, Enfermedad enfermedadAlivia, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.enfermedadAlivia = enfermedadAlivia;
        this.costo = costo;
        this.precioVenta = calcularPrecioVenta(costo);
    }
    
    /**
     * Calcula el precio de venta del medicamento.
     * 
     * @param costo El costo del medicamento.
     * @return El precio de venta del medicamento.
     */
    public abstract double calcularPrecioVenta(double costo);

    /**
     * Obtiene el costo del medicamento.
     * 
     * @return El costo del medicamento.
     */
    public double getCosto() {
        return costo;
    }

    /**
     * Obtiene la descripción del medicamento.
     * 
     * @return La descripción del medicamento.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Obtiene la enfermedad que alivia el medicamento.
     * 
     * @return La enfermedad que alivia el medicamento.
     */
    public Enfermedad getEnfermedadAlivia() {
        return enfermedadAlivia;
    }

    /**
     * Obtiene el nombre del medicamento.
     * 
     * @return El nombre del medicamento.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el precio de venta del medicamento.
     * 
     * @return El precio de venta del medicamento.
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * Establece el costo del medicamento.
     * 
     * @param costo El nuevo costo del medicamento.
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

    /**
     * Establece la descripción del medicamento.
     * 
     * @param descripcion La nueva descripción del medicamento.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Establece la enfermedad que alivia el medicamento.
     * 
     * @param enfermedadAlivia La nueva enfermedad que alivia el medicamento.
     */
    public void setEnfermedadAlivia(Enfermedad enfermedadAlivia) {
        this.enfermedadAlivia = enfermedadAlivia;
    }

    /**
     * Establece el nombre del medicamento.
     * 
     * @param nombre El nuevo nombre del medicamento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el precio de venta del medicamento.
     * 
     * @param precioVenta El nuevo precio de venta del medicamento.
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
}