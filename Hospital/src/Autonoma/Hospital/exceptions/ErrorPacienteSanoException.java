package Autonoma.Hospital.exceptions;

/**
 *
 * @author Samuel David López Sarabia
 */
public class ErrorPacienteSanoException extends RuntimeException {

    public ErrorPacienteSanoException() {
        super("Error, el paciente no posee esta enfermedad");
    }
    
}
