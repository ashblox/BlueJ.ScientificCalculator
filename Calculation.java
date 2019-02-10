
/**
 * Write a description of class Calculator here.
 *
 * @author (Yangtree21st)
 * @version (Feb.10.2019)
 */

    // instance variables - replace the example below with your own
public class Calculation
{   double m;
    public static double multiply(double fNum, double sNum)
    {
         double m = fNum* sNum;
        return m;
    }
    
    public static double divide(double fNum, double sNum)
    {
        return fNum / sNum;
    }
    
    public static double add(double fNum, double sNum)
    {
        return fNum  + sNum;
    }
    
    public static double subtract(double fNum , double sNum)
    {
        return fNum  - sNum;
    }
    
    public static double square(double fNum )
    {
        return fNum  * fNum;
    }
    
    public static double sqrt(double fNum )
    {
        return Math.sqrt(fNum );
    }
    
    public static double pow(double fNum , double sNum)
    {
        return Math.pow(fNum , sNum);
    }
    
    public static double inverse(double fNum )
    {
        return 1 / fNum ;
    }
    
    public static double changeSign(double fNum )
    {
        return -fNum ;
    }
}
