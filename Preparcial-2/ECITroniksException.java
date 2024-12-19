
/**
 * Write a description of class ECITroniksException here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ECITroniksException extends Exception
{
    public static final String PRODUCT_NOT_FOUND = "No existe el producto con ese nombre";
    public static final String CITY_AND_NEIGHBORHOOD_REQUIRED = "Es obligatoro llenar la ciudad y el barrio";
    public static final String NOT_ALLOWED_TRANSFER = "No es valida la transferencia";
    
    public ECITroniksException(String message){
        super(message);
    }
}
