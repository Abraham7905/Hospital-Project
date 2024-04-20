package autonoma.HospitalSanJose.models;

/**
 * Representa un medicamento de marca que alivia una enfermedad específica.
 * Extiende la clase Medicamento y agrega un campo adicional para el fabricante.
 * Calcula el precio de venta del medicamento basado en un porcentaje adicional del costo.
 * 
 * @author Samuel David López Sarabia
 * @version 1.0
 */
public class MedicamentoMarca extends Medicamento {
    
    /** El fabricante del medicamento de marca. */
    private String fabricante;

    /**
     * Crea un nuevo medicamento de marca con el nombre, descripción, enfermedad que alivia y costo especificados.
     * 
     * @param nombre El nombre del medicamento.
     * @param descripcion La descripción del medicamento.
     * @param enfermedadAlivia La enfermedad que alivia el medicamento.
     * @param costo El costo del medicamento.
     */
    public MedicamentoMarca(String nombre, String descripcion, Enfermedad enfermedadAlivia, double costo) {
        super(nombre, descripcion, enfermedadAlivia, costo);
    }

    /**
     * Calcula el precio de venta del medicamento de marca.
     * 
     * @param costo El costo base del medicamento.
     * @return El precio de venta del medicamento.
     */
    @Override
    public double calcularPrecioVenta(double costo) {
        return costo + (costo * 0.2); // Aumenta el costo en un 20%
    }

    /**
     * Obtiene el fabricante del medicamento de marca.
     * 
     * @return El fabricante del medicamento.
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Establece el fabricante del medicamento de marca.
     * 
     * @param fabricante El fabricante del medicamento.
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
