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
    
    private Paciente paciente;
    private EmpleadoSalud medico;
    private Date fechaRealizacion;
    private double valor;
    private ArrayList<Medicamento> medicamentosUsados;
    private Venta venta;

    /**
     * Crea una nueva cita médica con el paciente, médico, fecha de realización y valor inicial especificados.
     * 
     * @param paciente El paciente que asiste a la cita.
     * @param medico El médico que realiza la cita.
     * @param fechaRealizacion La fecha en que se realiza la cita.
     * @param valorInicial El valor inicial de la cita.
     * @param idVenta El identificador de la venta asociada a la cita.
     */
    public Cita(Paciente paciente, EmpleadoSalud medico, Date fechaRealizacion, double valorInicial, String idVenta) {
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
    
}