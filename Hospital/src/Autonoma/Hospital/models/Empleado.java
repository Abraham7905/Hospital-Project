package Autonoma.Hospital.models;

/**
 * Representa un empleado del hospital.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public abstract class Empleado {
    
    private String id;
    private String nombre;
    private int edad;
    private double salario;

    /**
     * Crea un nuevo empleado con un identificador, nombre, edad y salario base especificados.
     * 
     * @param id El identificador del empleado.
     * @param nombre El nombre del empleado.
     * @param edad La edad del empleado.
     * @param salarioBase El salario base del empleado.
     */
    public Empleado(String id, String nombre, int edad, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = calcularSalario(salarioBase);
    }
    
    /**
     * Calcula el salario del empleado.
     * 
     * @param salario El salario base del empleado.
     * @return El salario del empleado.
     */
    public abstract double calcularSalario(double salario);

    /**
     * Obtiene la edad del empleado.
     * 
     * @return La edad del empleado.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del empleado.
     * 
     * @param edad La nueva edad del empleado.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el nombre del empleado.
     * 
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del empleado.
     * 
     * @param nombre El nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el identificador del empleado.
     * 
     * @return El identificador del empleado.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del empleado.
     * 
     * @param id El nuevo identificador del empleado.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el salario del empleado.
     * 
     * @return El salario del empleado.
     */
    public double getSalario() {
        return salario;
    }

    /**
     * Establece el salario del empleado.
     * 
     * @param salario El nuevo salario del empleado.
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}