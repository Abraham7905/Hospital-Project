package Autonoma.Hospital.models;

/**
 * Representa un empleado operativo del hospital.
 * Extiende la clase Empleado y agrega un campo adicional para el área de trabajo.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public class EmpleadoOperativo extends Empleado {
    
    private String areaTrabajo;

    public EmpleadoOperativo(String id, String nombre, int edad, double salarioBase, String areaTrabajo) {
        super(id, nombre, edad, salarioBase);
        this.areaTrabajo = areaTrabajo;
    }

    /**
    * Calcula el salario del empleado operativo.
    * El salario se calcula sumando un 20% al salario base.
    * 
    * @param salarioBase El salario base del empleado.
    * @return El salario total del empleado operativo.
    */
    @Override
    public double calcularSalario(double salarioBase) {
        return salarioBase + (salarioBase * 0.2);
    }

    /**
    * Obtiene el área de trabajo del empleado operativo.
    * 
    * @return El área de trabajo del empleado operativo.
    */
    public String getAreaTrabajo() {
        return areaTrabajo;
    }

    /**
    * Establece el área de trabajo del empleado operativo.
    * 
    * @param areaTrabajo El nuevo área de trabajo del empleado operativo.
    */
    public void setAreaTrabajo(String areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }
    
}