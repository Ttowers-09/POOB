import java.util.HashMap;
import java.time.LocalDate;

/**
 * Write a description of class ECITroniks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ECITroniks
{
    static final String[] aliedBrands = null;;
    HashMap<String, Store> stores = new HashMap<>();
    HashMap<Integer,Client> clients = new HashMap<>();
    HashMap<String,Product> products = new HashMap<>();
    
    /**
     * Constructor for objects of class ECITroniks
     */
    public ECITroniks()
    {
    }
    
    public void transferStores(String productName, String city, String neighborhood) throws ECITroniksException{
        for(Store s: stores.values()){
            try{
                s.getProduct(productName);
            }catch(ECITroniksException c){
                System.out.println(ECITroniksException.PRODUCT_NOT_FOUND);
            }
            LocalDate d = s.calculateNextTransferDate();
            if(d !=null && d.isBefore(LocalDate.now())){
                s.moveLocation(city, neighborhood);
            } else{
                throw new ECITroniksException(ECITroniksException.NOT_ALLOWED_TRANSFER);
            }
        }
    }
}
