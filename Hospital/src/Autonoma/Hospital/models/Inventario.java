package Autonoma.Hospital.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa el inventario de medicamentos del hospital.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public class Inventario {
    
    private String codigo;
    private Date anioActualizacion;
    private ArrayList<Medicamento> medicamentos;

    /**
     * Crea un nuevo inventario con el código y la fecha de actualización especificados.
     * 
     * @param codigo El código del inventario.
     * @param anioActualizacion La fecha de actualización del inventario.
     */
    public Inventario(String codigo, Date anioActualizacion) {
        this.codigo = codigo;
        this.anioActualizacion = anioActualizacion;
        this.medicamentos = new ArrayList<>();
    }
    
    /**
     * Agrega un medicamento al inventario.
     * 
     * @param m El medicamento a agregar.
     */
    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    /**
     * Obtiene la fecha de actualización del inventario.
     * 
     * @return La fecha de actualización del inventario.
     */
    public Date getAnioActualizacion() {
        return anioActualizacion;
    }

    /**
     * Establece la fecha de actualización del inventario.
     * 
     * @param anioActualizacion La nueva fecha de actualización del inventario.
     */
    public void setAnioActualizacion(Date anioActualizacion) {
        this.anioActualizacion = anioActualizacion;
    }

    /**
     * Obtiene el código del inventario.
     * 
     * @return El código del inventario.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del inventario.
     * 
     * @param codigo El nuevo código del inventario.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
}