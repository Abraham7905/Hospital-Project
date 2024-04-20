package Autonoma.Hospital.models;

import java.util.ArrayList;
import java.util.Date;

/**
* Representa el inventario de medicamentos del hospital.
* 
* @version 1.0
* @author Samuel David López Sarabia
* @author Abraham Velásquez
*/
public class Inventario {
    
    private String codigo;
    private Date anioActualizacion;
    private ArrayList<Medicamento> medicamentos;

    public Inventario(String codigo, Date anioActualizacion) {
        this.codigo = codigo;
        this.anioActualizacion = anioActualizacion;
        this.medicamentos = new ArrayList<>();
    }
    
    /**
    * Busca el índice de un medicamento en la lista de medicamentos usados del paciente.
    * 
    * @param medicamento El medicamento a buscar.
    * @return El índice del medicamento en la lista, o -1 si no se encuentra.
    */
    public int buscarIdMedicamento(Medicamento medicamento){
        for (int i = 0; i < this.medicamentos.size(); i++) {
            if (this.medicamentos.get(i).getNombre().equals(medicamento.getNombre())){
                return i;
            }
        }
        return -1;
    }
    
    /**
    * Busca un medicamento en la lista de medicamentos usados del paciente por su índice.
    * 
    * @param index El índice del medicamento a buscar.
    * @return El medicamento encontrado, o null si no se encuentra ninguno en el índice especificado.
    */
    public Medicamento buscarMedicamento(int index){
        for (int i = 0; i < medicamentos.size(); i++) {
            return medicamentos.get(i);
        }
        return null;
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
    * Actualiza un medicamento en la lista de medicamentos usados del paciente en un índice dado.
    * 
    * @param index El índice del medicamento a actualizar.
    * @param m El nuevo medicamento.
    */
    public void actualizarMedicamento(int index, Medicamento m) {
        if(index >= 0 && index < medicamentos.size()) {
            medicamentos.set(index, m);
        }
    }
    
    /**
    * Elimina un medicamento de la lista de medicamentos usados del paciente en un índice dado.
    * 
    * @param index El índice del medicamento a eliminar.
    */
    public void eliminarMedicamento(int index) {
        if(index >= 0 && index < medicamentos.size()) {
            medicamentos.remove(index);
        }
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