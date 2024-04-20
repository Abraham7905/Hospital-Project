package Autonoma.Hospital.models;

/**
 * Representa una enfermedad.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 * @author Abraham Velásquez
 */
public class Enfermedad {
    
    private String nombre;
    private String descripción;

    /**
     * Crea una nueva enfermedad con el nombre y la descripción especificados.
     * 
     * @param nombre El nombre de la enfermedad.
     * @param descripción La descripción de la enfermedad.
     */
    public Enfermedad(String nombre, String descripción) {
        this.nombre = nombre;
        this.descripción = descripción;
    }

    /**
     * Obtiene el nombre de la enfermedad.
     * 
     * @return El nombre de la enfermedad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la enfermedad.
     * 
     * @param nombre El nuevo nombre de la enfermedad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción de la enfermedad.
     * 
     * @return La descripción de la enfermedad.
     */
    public String getDescripción() {
        return descripción;
    }

    /**
     * Establece la descripción de la enfermedad.
     * 
     * @param descripción La nueva descripción de la enfermedad.
     */
    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
}