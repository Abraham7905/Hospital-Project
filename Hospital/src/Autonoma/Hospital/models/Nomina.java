package Autonoma.Hospital.models;

import java.util.ArrayList;

/**
 * Representa la nómina de empleados del hospital.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public class Nomina {
    
    private String codigo;
    private double total;

    /**
     * Crea una nueva nómina con un código y una lista de empleados especificados.
     * Calcula automáticamente el total de la nómina en base a los salarios de los empleados.
     * 
     * @param codigo El código de la nómina.
     * @param empleados La lista de empleados incluidos en la nómina.
     */
    public Nomina(String codigo, ArrayList<Empleado> empleados) {
        this.codigo = codigo;
        this.total = calcularNomina(empleados);
    }
    
    /**
     * Calcula el total de la nómina sumando los salarios de todos los empleados.
     * 
     * @param empleados La lista de empleados incluidos en la nómina.
     * @return El total de la nómina.
     */
    public double calcularNomina(ArrayList<Empleado> empleados) {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.getSalario();
        }
        return totalNomina;
    }

    /**
     * Obtiene el código de la nómina.
     * 
     * @return El código de la nómina.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código de la nómina.
     * 
     * @param codigo El nuevo código de la nómina.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el total de la nómina.
     * 
     * @return El total de la nómina.
     */
    public double getTotal() {
        return total;
    }

    /**
     * Establece el total de la nómina.
     * 
     * @param total El nuevo total de la nómina.
     */
    public void setTotal(double total) {
        this.total = total;
    }
    
}