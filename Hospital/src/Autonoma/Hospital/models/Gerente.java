package Autonoma.Hospital.models;

/**
 *
 * @author Samuel David López Sarabia
 * @author Abraham Velásquez
 */
public class Gerente extends Empleado {
    
    private String carrera;

    public Gerente(String id, String nombre, int edad, double salarioBase, String carrera) {
        super(id, nombre, edad, salarioBase);
        this.carrera = carrera;
    }

    @Override
    public double calcularSalario(double salario) {
        return salario*2;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
}
