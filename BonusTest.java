import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.math.BigInteger;
/**
 * Write a description of class BonusTest here.
 *
 * @author (Yang Shu)
 * @version (Fer.10.2019)
 */
public class BonusTest
{
    // instance variables - replace the example below with your own
    

    
    @Test  
    public void factoria(){
        double value = 2;
        assertEquals(new BigInteger("2"), Bonus.factoria(value));
        double value1 = 5;
        assertEquals(new BigInteger("120"), Bonus.factoria(value1));
    }
    @Test  
    public void log(){
        double value = 16;
        double base = 2;
        assertEquals(4, new Bonus().log(value,base),0.01);
    }
    
     @Test  
    public void inverse_logarithm(){
        double base =2 ;
        double exponent=10;
        assertEquals(1024, Bonus.inverse_logarithm(base, exponent),0.01);
    }
    @Test  
    public void natural_logarithm(){
        double value = 50 ;
         
        assertEquals(3.912 , Bonus.natural_logarithm(value),0.01);
    }
    
    @Test  
     
    public void natural_inverse_logarithm(){
        double value = 50 ;
         
        assertEquals( 3.912, Bonus.natural_logarithm(value),0.01);
    }
    
}
