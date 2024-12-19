import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;

/**
 * Write a description of class Store here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Store
{
    String name;
    int contactNumber;
    Location location;
    ArrayList<Bill> bills;
    ArrayList<Supplier> suppliers;
    ArrayList<Employee> employees;
    HashMap<String,Product> products;
    
    public Store(){
    }
    
    public Product getProduct(String name) throws ECITroniksException{
        Product p = products.get(name);
        if(p!=null){return p;}
        else{
            throw new ECITroniksException(ECITroniksException.PRODUCT_NOT_FOUND);
        }
    }
    public LocalDate calculateNextTransferDate(){
        return null;
    }
    public void moveLocation(String city, String neighborhood)throws ECITroniksException{
        location = new Location(city,neighborhood);
    }
}
