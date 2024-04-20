package autonoma.HospitalSanJose.models;

/**
 * Representa un empleado del área de salud del hospital.
 * Extiende la clase Empleado y agrega campos adicionales para la especialidad y la cantidad de horas trabajadas.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public class EmpleadoSalud extends Empleado {
    
    private String especialidad;
    private int cantidadHorasTrabajadas;

    /**
     * Crea un nuevo empleado del área de salud con la especialidad, identificador, nombre, edad y salario base especificados.
     * 
     * @param especialidad La especialidad del empleado del área de salud.
     * @param id El identificador del empleado.
     * @param nombre El nombre del empleado.
     * @param edad La edad del empleado.
     * @param salarioBase El salario base del empleado.
     */
    public EmpleadoSalud(String especialidad, String id, String nombre, int edad, double salarioBase) {
        super(id, nombre, edad, salarioBase);
        this.especialidad = especialidad;
        this.cantidadHorasTrabajadas = 0;
    }

    /**
     * Calcula el salario del empleado del área de salud.
     * El salario se calcula como el salario base multiplicado por 1.2% por cada hora trabajada, más el salario base.
     * 
     * @param salarioBase El salario base del empleado.
     * @return El salario total del empleado del área de salud.
     */
    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase * 0.012 * this.cantidadHorasTrabajadas + salarioBase;
    }

    /**
     * Obtiene la especialidad del empleado del área de salud.
     * 
     * @return La especialidad del empleado.
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del empleado del área de salud.
     * 
     * @param especialidad La nueva especialidad del empleado.
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * Obtiene la cantidad de horas trabajadas por el empleado del área de salud.
     * 
     * @return La cantidad de horas trabajadas por el empleado.
     */
    public int getCantidadHorasTrabajadas() {
        return cantidadHorasTrabajadas;
    }

    /**
     * Establece la cantidad de horas trabajadas por el empleado del área de salud.
     * 
     * @param cantidadHorasTrabajadas La nueva cantidad de horas trabajadas por el empleado.
     */
    public void setCantidadHorasTrabajadas(int cantidadHorasTrabajadas) {
        this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
    }
    
}