package Autonoma.Hospital.models;

import java.util.ArrayList;
import java.util.Date;

/**
 * Representa una cita médica realizada en la clínica.
 * 
 * @author Samuel David López Sarabia
 * @version 1.0
 */
public class Cita {
    
    private String codigo;
    private Paciente paciente;
    private EmpleadoSalud medico;
    private Date fechaRealizacion;
    private double valor;
    private ArrayList<Medicamento> medicamentosUsados;
    private Venta venta;

    /**
     * Crea una nueva cita médica con el paciente, médico, fecha de realización y valor inicial especificados.
     * 
     * @param codigo El codigo de la cita
     * @param paciente El paciente que asiste a la cita.
     * @param medico El médico que realiza la cita.
     * @param fechaRealizacion La fecha en que se realiza la cita.
     * @param valorInicial El valor inicial de la cita.
     * @param idVenta El identificador de la venta asociada a la cita.
     */
    public Cita(String codigo, Paciente paciente, EmpleadoSalud medico, Date fechaRealizacion, double valorInicial, String idVenta) {
        this.codigo = codigo;
        this.paciente = paciente;
        this.medico = medico;
        this.fechaRealizacion = fechaRealizacion;
        this.valor = valorInicial;
        this.medicamentosUsados = new ArrayList<>();
        this.venta = new Venta(idVenta, medicamentosUsados);
    }
    
    /**
     * Realiza el proceso de curación del paciente durante la cita.
     * Agrega el medicamento utilizado a la lista de medicamentos usados, cura la enfermedad del paciente y actualiza el valor total de la venta asociada a la cita.
     * 
     * @param idVenta El identificador de la venta asociada a la cita.
     * @param medicamento El medicamento utilizado durante la cita.
     * @param enfermedad La enfermedad que se está tratando.
     */
    public void curarPaciente(String idVenta, Medicamento medicamento, Enfermedad enfermedad){
        this.medicamentosUsados.add(medicamento);
        this.paciente.curarEnfermedad(medicamento, enfermedad);
        this.venta.sumarTotal();
    }
    
    /**
     * Obtiene el codigo de la cita
     * 
     * @return El codigo de la cita
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el codigo de la cita
     * 
     * @param codigo El codigo a establecer
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    /**
    * Busca el índice de un medicamento en la lista de medicamentos usados del paciente.
    * 
    * @param medicamento El medicamento a buscar.
    * @return El índice del medicamento en la lista, o -1 si no se encuentra.
    */
    public int buscarIdMedicamento(Medicamento medicamento){
        for (int i = 0; i < this.medicamentosUsados.size(); i++) {
            if (this.medicamentosUsados.get(i).getNombre().equals(medicamento.getNombre())){
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
        for (int i = 0; i < medicamentosUsados.size(); i++) {
            return medicamentosUsados.get(i);
        }
        return null;
    }
    
    /**
    * Agrega un medicamento a la lista de medicamentos usados del paciente.
    * 
    * @param m El medicamento a agregar.
    */
    public void agegarMedicamento(Medicamento m){
        medicamentosUsados.add(m);
    }
    
    /**
    * Actualiza un medicamento en la lista de medicamentos usados del paciente en un índice dado.
    * 
    * @param index El índice del medicamento a actualizar.
    * @param m El nuevo medicamento.
    */
    public void actualizarMedicamento(int index, Medicamento m) {
        medicamentosUsados.set(index, m);
    }
    
    /**
    * Elimina un medicamento de la lista de medicamentos usados del paciente en un índice dado.
    * 
    * @param index El índice del medicamento a eliminar.
    */
    public void eliminarMedicamento(int index) {
        medicamentosUsados.remove(index);
    }
    
}