
/**
 * Write a description of class Location here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Location
{
    String city;
    String neighborhood;
    /**
     * Constructor for objects of class Location
     */
    public Location(String city, String neighborhood)throws ECITroniksException{
        if(city.equals(null) || neighborhood.equals(null)){
            throw new ECITroniksException(ECITroniksException.CITY_AND_NEIGHBORHOOD_REQUIRED);
        }
        this.city = city;
        this.neighborhood = neighborhood;
    }

}
