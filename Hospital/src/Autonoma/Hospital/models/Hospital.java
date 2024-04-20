package Autonoma.Hospital.models;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 * Representa un hospital.
 * Contiene información como nombre, dirección, teléfono, presupuesto, etc.
 * Además, mantiene listas de citas, medicamentos, ventas y empleados asociados.
 * 
 * @author Samuel David López Sarabia
 */
public class Hospital {
    private String nombre; // Nombre del hospital
    private String direccion; // Dirección del hospital
    private String telefono; // Teléfono del hospital
    private ImageIcon logo; // Logo del hospital
    private double presupuesto; // Presupuesto del hospital
    private double metaVentasAnual; // Meta de ventas anual del hospital
    private Date fechaFundacion; // Fecha de fundación del hospital
    private boolean estado; // Estado del hospital (activo o no)
    private Localizacion localizacion; // Localización del hospital
    private Gerente gerente; // Gerente del hospital
    private ArrayList<Cita> citas; // Lista de citas del hospital
    private ArrayList<Medicamento> medicamentos; // Lista de medicamentos del hospital
    private ArrayList<Venta> ventas; // Lista de ventas del hospital
    private ArrayList<Empleado> empleados; // Lista de empleados del hospital

    /**
     * Constructor de la clase Hospital.
     * 
     * @param nombre El nombre del hospital.
     * @param direccion La dirección del hospital.
     * @param telefono El teléfono del hospital.
     * @param logo El logo del hospital.
     * @param presupuesto El presupuesto del hospital.
     * @param metaVentasAnual La meta de ventas anual del hospital.
     * @param fechaFundacion La fecha de fundación del hospital.
     * @param localizacion La localización del hospital.
     * @param gerente El gerente del hospital.
     */
    public Hospital(String nombre, String direccion, String telefono, ImageIcon logo, double presupuesto, double metaVentasAnual, Date fechaFundacion, Localizacion localizacion, Gerente gerente) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.presupuesto = presupuesto;
        this.metaVentasAnual = metaVentasAnual;
        this.fechaFundacion = fechaFundacion;
        this.estado = true;
        this.localizacion = localizacion;
        this.gerente = gerente;
        this.citas = new ArrayList<>();
        this.medicamentos = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    // Setters y Getters

    /**
     * Obtiene el nombre del hospital.
     * 
     * @return El nombre del hospital.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del hospital.
     * 
     * @param nombre El nombre del hospital a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la dirección del hospital.
     * 
     * @return La dirección del hospital.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del hospital.
     * 
     * @param direccion La dirección del hospital a establecer.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el teléfono del hospital.
     * 
     * @return El teléfono del hospital.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono del hospital.
     * 
     * @param telefono El teléfono del hospital a establecer.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el logo del hospital.
     * 
     * @return El logo del hospital.
     */
    public ImageIcon getLogo() {
        return logo;
    }

    /**
     * Establece el logo del hospital.
     * 
     * @param logo El logo del hospital a establecer.
     */
    public void setLogo(ImageIcon logo) {
        this.logo = logo;
    }

    /**
     * Obtiene el presupuesto del hospital.
     * 
     * @return El presupuesto del hospital.
     */
    public double getPresupuesto() {
        return presupuesto;
    }

    /**
     * Establece el presupuesto del hospital.
     * 
     * @param presupuesto El presupuesto del hospital a establecer.
     */
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Obtiene la meta de ventas anual del hospital.
     * 
     * @return La meta de ventas anual del hospital.
     */
    public double getMetaVentasAnual() {
        return metaVentasAnual;
    }

    /**
     * Establece la meta de ventas anual del hospital.
     * 
     * @param metaVentasAnual La meta de ventas anual del hospital a establecer.
     */
    public void setMetaVentasAnual(double metaVentasAnual) {
        this.metaVentasAnual = metaVentasAnual;
    }

    /**
     * Obtiene la fecha de fundación del hospital.
     * 
     * @return La fecha de fundación del hospital.
     */
    public Date getFechaFundacion() {
        return fechaFundacion;
    }

    /**
     * Establece la fecha de fundación del hospital.
     * 
     * @param fechaFundacion La fecha de fundación del hospital a establecer.
     */
    public void setFechaFundacion(Date fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    /**
     * Verifica el estado del hospital.
     * 
     * @return true si el hospital está activo, false de lo contrario.
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado del hospital.
     * 
     * @param estado El estado del hospital a establecer.
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la localización del hospital.
     * 
     * @return La localización del hospital.
     */
    public Localizacion getLocalizacion() {
        return localizacion;
    }

    /**
     * Establece la localización del hospital.
     * 
     * @param localizacion La localización del hospital a establecer.
     */
    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }

    /**
     * Obtiene el gerente del hospital.
     * 
     * @return El gerente del hospital.
     */
    public Gerente getGerente() {
        return gerente;
    }

    /**
     * Establece el gerente del hospital.
     * 
     * @param gerente El gerente del hospital a establecer.
     */
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    /**
     * Obtiene la lista de citas del hospital.
     * 
     * @return La lista de citas del hospital.
     */
    public ArrayList<Cita> getCitas() {
        return citas;
    }

    /**
     * Establece la lista de citas del hospital.
     * 
     * @param citas La lista de citas del hospital a establecer.
     */
    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }

    /**
     * Obtiene la lista de medicamentos del hospital.
     * 
     * @return La lista de medicamentos del hospital.
     */
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    /**
     * Establece la lista de medicamentos del hospital.
     * 
     * @param medicamentos La lista de medicamentos del hospital a establecer.
     */
    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    /**
     * Obtiene la lista de ventas del hospital.
     * 
     * @return La lista de ventas del hospital.
     */
    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    /**
     * Establece la lista de ventas del hospital.
     * 
     * @param ventas La lista de ventas del hospital a establecer.
     */
    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    /**
     * Obtiene la lista de empleados del hospital.
     * 
     * @return La lista de empleados del hospital.
     */
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    /**
     * Establece la lista de empleados del hospital.
     * 
     * @param empleados La lista de empleados del hospital a establecer.
     */
    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}