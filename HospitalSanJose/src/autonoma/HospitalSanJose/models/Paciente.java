package autonoma.HospitalSanJose.models;

import autonoma.HospitalSanJose.exceptions.*;
import java.util.ArrayList;

/**
 * Representa un paciente del hospital.
 * 
 * @version 1.0
 * @author Samuel David López Sarabia
 */
public class Paciente {
    
    private String id;
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;
    private boolean estado;
    private ArrayList<Enfermedad> enfermedades;
    private ArrayList<Medicamento> medicinas;

    /**
     * Crea un nuevo paciente con la información especificada.
     * 
     * @param id El identificador del paciente.
     * @param nombre El nombre del paciente.
     * @param edad La edad del paciente.
     * @param correo El correo electrónico del paciente.
     * @param telefono El número de teléfono del paciente.
     * @param estado El estado del paciente (activo o inactivo).
     * @param enfermedades La lista de enfermedades del paciente.
     * @param medicinas La lista de medicamentos del paciente.
     */
    public Paciente(String id, String nombre, int edad, String correo, String telefono, boolean estado, ArrayList<Enfermedad> enfermedades, ArrayList<Medicamento> medicinas) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.telefono = telefono;
        this.estado = estado;
        this.enfermedades = enfermedades;
        this.medicinas = medicinas;
    }
    
    /**
     * Intenta curar una enfermedad del paciente con un medicamento especificado.
     * 
     * @param medicina El medicamento a utilizar para curar la enfermedad.
     * @param enfermedad La enfermedad que se intenta curar.
     * @return true si la enfermedad se curó correctamente, false si no se pudo curar.
     * @throws ErrorMedicinaException Si el medicamento no es adecuado para curar la enfermedad.
     * @throws ErrorPacienteSanoException Si el paciente no tiene la enfermedad que se intenta curar.
     */
    public boolean curarEnfermedad(Medicamento medicina, Enfermedad enfermedad) throws ErrorMedicinaException, ErrorPacienteSanoException {
        int indice = buscarEnfermedadNombre(enfermedad.getNombre());
        if(indice!=-1){
            if(medicina.getEnfermedadAlivia().getNombre().equals(enfermedad.getNombre())){
                getEnfermedades().remove(indice);
                getMedicinas().add(medicina);
                return true;
            }
            else {
                throw new ErrorMedicinaException();
            }
        }
        else {
            throw new ErrorPacienteSanoException();
        }
    }
    
    /**
     * Busca una enfermedad en la lista de enfermedades del paciente por su nombre.
     * 
     * @param nombre El nombre de la enfermedad a buscar.
     * @return El índice de la enfermedad en la lista, o -1 si no se encontró la enfermedad.
     */
    public int buscarEnfermedadNombre(String nombre) {
        int indice = -1;
        for (int i = 0; i < getEnfermedades().size(); i++) {
            if(getEnfermedades().get(i).getNombre().equals(nombre)){
                indice = i;
            }
        }
        return indice;
    }

    /**
     * Obtiene el identificador del paciente.
     * 
     * @return El identificador del paciente.
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador del paciente.
     * 
     * @param id El nuevo identificador del paciente.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del paciente.
     * 
     * @return El nombre del paciente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del paciente.
     * 
     * @param nombre El nuevo nombre del paciente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad del paciente.
     * 
     * @return La edad del paciente.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del paciente.
     * 
     * @param edad La nueva edad del paciente.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el correo electrónico del paciente.
     * 
     * @return El correo electrónico del paciente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del paciente.
     * 
     * @param correo El nuevo correo electrónico del paciente.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el número de teléfono del paciente.
     * 
     * @return El número de teléfono del paciente.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del paciente.
     * 
     * @param telefono El nuevo número de teléfono del paciente.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el estado del paciente.
     * 
     * @return true si el paciente está activo, false si está inactivo.
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * Establece el estado del paciente.
     * 
     * @param estado El nuevo estado del paciente (true para activo, false para inactivo).
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la lista de enfermedades del paciente.
     * 
     * @return La lista de enfermedades del paciente.
     */
    public ArrayList<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    /**
     * Establece la lista de enfermedades del paciente.
     * 
     * @param enfermedades La nueva lista de enfermedades del paciente.
     */
    public void setEnfermedades(ArrayList<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    /**
     * Obtiene la lista de medicinas del paciente.
     * 
     * @return La lista de medicinas del paciente.
     */
    public ArrayList<Medicamento> getMedicinas() {
        return medicinas;
    }

    /**
     * Establece la lista de medicinas del paciente.
     * 
     * @param medicinas La nueva lista de medicinas del paciente.
     */
    public void setMedicinas(ArrayList<Medicamento> medicinas) {
        this.medicinas = medicinas;
    }
}