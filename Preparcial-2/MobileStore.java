import java.time.LocalDate;

/**
 * Write a description of class MobileStore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MobileStore extends Store
{
    int transferRate;
    LocalDate lastTransferDate;
    
    @Override
    public LocalDate calculateNextTransferDate(){
        return lastTransferDate.plusDays((long) transferRate);
    }
}
