
/**
 * Create a scientific calculator that utilizes user input and shows results
 * on display.
 * Created by ashblox, yangtree21st, ajahdailey 
 * Version 1.0
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Calculator
{
   // instance variable for result of operation
   static double result;
   
   public Calculator() {
       result = 0;
   }
   
   public static void add() {
       double firstNumber = Display.getNumber();
       double secondNumber = Display.getNumber();
       result = firstNumber + secondNumber;
       Display.println(result);
   }
   
   public static void subtract() {
       double firstNumber = Display.getNumber();
       double secondNumber = Display.getNumber();
       result = firstNumber - secondNumber;
       Display.println(result);
   }
   
   public static void multiply() {
       double firstNumber = Display.getNumber();
       double secondNumber = Display.getNumber();
       result = firstNumber * secondNumber;
       Display.println(result);
   }
   
   public static void divide() {
       double firstNumber = Display.getNumber();
       double secondNumber = Display.getNumber();
       if (secondNumber == 0) {
           Display.printLine("Err");
       } else {
           result = firstNumber / secondNumber;
           Display.println(result);
       }
   }
   
   public static void square() {
       double number = Display.getNumber();
       result = number * number;
       Display.println(result);
   }
   
   public static void squareRoot() {
       double number = Display.getNumber();
       if (number < 0) {
           Display.printLine("Err");
       } else {
           result = Math.sqrt(number);
           Display.println(result);
       }
   }
   
   public static void exponentiate() {
       double firstNumber = Display.getNumber();
       double secondNumber = Display.getNumber();
       result = Math.pow(firstNumber, secondNumber);
       Display.println(result);
   }
   
   public static void inverse() {
       double number = Display.getNumber();
       result = 1/number;
       Display.println(result);
   }
   
   public static void sin() {
       double number = Display.getNumber();
       result = Math.sin(number);
       Display.println(result);
   }
    
   public static void cos() {
       double number = Display.getNumber();
       result = Math.cos(number);
       Display.println(result);
   }
   
   public static void tan() {
       double number = Display.getNumber();
       result = Math.tan(number);
       Display.println(result);
   }
  
   public static void sinh() {
       double number = Display.getNumber();
       result = Math.sinh(number);
       Display.println(result);
   }
   
   public static void cosh() {
       double number = Display.getNumber();
       result = Math.cosh(number);
       Display.println(result);
   }
   
   public static void tanh() {
       double number = Display.getNumber();
       result = Math.tanh(number);
       Display.println(result);
   }
   
   public static void factorial() {
       double number = Display.getNumber();
       double result = 1;
       for (double i = number; i > 0; i--) {
           result = result * i;
       }
       Display.println(result);
   }
   
   public static void log() {
       double number = Display.getNumber();
       result = Math.log10(number);
       Display.println(result);
   }
   
   public static void inverseLog() {
       double firstNumber = Display.getNumber();
       double secondNumber = Display.getNumber();
       result = Math.pow(firstNumber, secondNumber);
       Display.println(result);
   }
   
   public static void naturalLog() {
       double number = Display.getNumber();
       result = Math.log(number);
       Display.println(result);
   }
   
   public static void inverseNaturalLog() {
       double number = Display.getNumber();
       result = Math.pow(Math.E, number);
       Display.println(result);
   } 
}