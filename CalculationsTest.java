
/**
 * Write a description of class CalcularTest here.
 *
 * @author (Yang Shu)
 * @version (Feb.10.2019)
 */
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculationsTest{
    private static volatile Calculation calculations = new Calculation();
    @Test  
    public void testMultiply(){
        
        double firstNum = 20;
        double secondNum = 5;
        
        double expected = 100;
        double actual = Calculation.multiply(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
        
        double firstNum2 = 5.14;
        double secondNum2 = 10.10;
        
        double expected2 = 51.914;
        double actual2 = Calculation.multiply(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    
    @Test
    public void testMultiply2(){
        double firstNum = -66;
        double secondNum = 20;
        
        double expected = -1320;
        double actual = Calculation.multiply(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testDivide(){
        double firstNum = 99;
        double secondNum = 9;
        
        double expected = 11;
        double actual = Calculation.divide(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testDivide2(){
        double firstNum = 100;
        double secondNum = 40;
        
        double expected = 2.5;
        double actual = Calculation.divide(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testDivide3(){
        double firstNum = -55;
        double secondNum = 11;
        
        double expected = -5;
        double actual = Calculation.divide(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    
    public void testAdd(){
        
        double firstNum = 2;
        double secondNum = 55;
        
        double expected = 57;
        double actual = Calculation.add(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
        }
    @Test
    public void testAdd2(){
        double firstNum = 99;
        double secondNum = 999;
        
        double expected = 1098;
        double actual = Calculation.add(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testAdd3(){
        double firstNum = 9.321;
        double secondNum = 5.433;
        
        double expected = 14.754;
        double actual = Calculation.add(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSubtract(){
     
        double firstNum = 5;
        double secondNum = 95;
        
        double expected = -90;
        double actual = Calculation.subtract(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSubtract2(){
        double firstNum = 5555;
        double secondNum = 555;
        
        double expected = 5000;
        double actual = Calculation.subtract(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSubtract3(){
        double firstNum = 9.75;
        double secondNum = 9.25;
        
        double expected = 0.50;
        double actual = Calculation.subtract(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual,0.001);
    }
    @Test
    public void testSquare(){
       double firstNum = 2;
       
       double expected = 4;
       double actual = Calculation.square(firstNum);
       
       Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSquare2(){
        double firstNum = 100;
        
        double expected = 10000;
        double actual = Calculation.square(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSquare3(){
        double firstNum = 9.9;
        
        double expected = 98.01;
        double actual = Calculation.square(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testSqrt(){
        double firstNum = 9;
        
        double expected = 3;
        double actual = Calculation.sqrt(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testPow(){
        double firstNum = 3;
        double secondNum = 2;
        
        double expected = 9;
        double actual = Calculation.pow(firstNum, secondNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testInverse(){
        double firstNum = 5;
        
        double expected = 0.2;
        double actual = Calculation.inverse(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void testchangeSign(){
        double firstNum = 99;
        
        double expected = -99;
        double actual = Calculation.changeSign(firstNum);
        
        Assert.assertEquals(expected, actual, 0);
    }
}