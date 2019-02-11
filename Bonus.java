
/**
 * Write a description of class Bonus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math; 
import java.math.BigInteger;
public  class Bonus{
    // instance variables - replace the example below with your own
    
    public static BigInteger factoria(double value){
        BigInteger f = new BigInteger("1");
        for (int i =1;i<=value;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
          return f; 
        }
    
        
    
    static public double log(double value, double base) 
    {
        return Math.log(value) / Math.log(base);
   }
   
   static public double inverse_logarithm(double base, double exponent ) 
    {
        return  Math.pow( base, exponent);
        
   }
   
   static public double natural_logarithm(double value) 
    {
        return Math.log(value);
   }
   
   static public double natural_inverse_logarithm(double value) {
      return Math.pow(Math.E, value); 
   
     }
   
   
}

