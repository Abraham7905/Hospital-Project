package autonoma.HospitalSanJose.exceptions;

/**
 *
 * @author sam
 */
public class ErrorMedicinaException extends RuntimeException {

    public ErrorMedicinaException() {
        super("Error, la medicina no es compatible con la enfermedad");
    }
    
}
