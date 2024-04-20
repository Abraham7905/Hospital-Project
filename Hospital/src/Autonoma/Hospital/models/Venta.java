package Autonoma.Hospital.models;

import java.util.ArrayList;

/**
 * Representa una venta de medicamentos realizada en la clínica.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 * @author Abraham Velásquez
 */
public class Venta {
    
    private String id;
    private ArrayList<Medicamento> medicamentos;
    private double valorTotal;

    /**
     * Crea una nueva venta con un identificador y una lista de medicamentos.
     * 
     * @param id El identificador de la venta.
     * @param medicamentos La lista de medicamentos vendidos.
     */
    public Venta(String id, ArrayList<Medicamento> medicamentos) {
        this.id = id;
        this.medicamentos = medicamentos;
        this.valorTotal = 0;
    }
    
    /**
     * Calcula el valor total de la venta sumando el precio de venta de todos los medicamentos vendidos.
     */
    public void sumarTotal() {
        for (Medicamento medicamento : medicamentos) {
            valorTotal += medicamento.getPrecioVenta();
        }
    }

    /**
     * Obtiene el identificador de la venta.
     * 
     * @return El identificador de la venta.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador de la venta.
     * 
     * @param id El identificador de la venta.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene la lista de medicamentos vendidos en la venta.
     * 
     * @return La lista de medicamentos vendidos.
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Establece la lista de medicamentos vendidos en la venta.
     * 
     * @param medicamentos La lista de medicamentos vendidos.
     */
    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * Obtiene el valor total de la venta.
     * 
     * @return El valor total de la venta.
     */
    public double getValorTotal() {
        return valorTotal;
    }

    /**
     * Establece el valor total de la venta.
     * 
     * @param valorTotal El valor total de la venta.
     */
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
