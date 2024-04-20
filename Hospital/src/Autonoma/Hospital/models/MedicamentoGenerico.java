package Autonoma.Hospital.models;

/**
 * Representa un medicamento genérico.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public class MedicamentoGenerico extends Medicamento {

    /**
     * Crea un nuevo medicamento genérico con el nombre, la descripción, la enfermedad que alivia, y el costo especificados.
     * 
     * @param nombre El nombre del medicamento genérico.
     * @param descripcion La descripción del medicamento genérico.
     * @param enfermedadAlivia La enfermedad que alivia el medicamento genérico.
     * @param costo El costo del medicamento genérico.
     */
    public MedicamentoGenerico(String nombre, String descripcion, Enfermedad enfermedadAlivia, double costo) {
        super(nombre, descripcion, enfermedadAlivia, costo);
    }

    /**
     * Calcula el precio de venta del medicamento genérico.
     * 
     * @param costo El costo del medicamento genérico.
     * @return El precio de venta del medicamento genérico.
     */
    @Override
    public double calcularPrecioVenta(double costo) {
        return costo + (costo * 0.10); // Se agrega un 10% al costo como precio de venta
    }
    
}