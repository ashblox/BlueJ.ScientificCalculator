
/**
 * Create a scientific calculator that utilizes user input and shows results
 * on display.
 * Created by ashblox, yangtree21st, ajahdailey 
 * Version 1.0
 */

import java.util.Scanner;

public class Calculator
{
   // instance variable for result of operation
   double result;
   
   public Calculator() {
       result = 0;
   }
   
   public void add() {
       Display.setState();
       double firstNumber = Display.getState();
       Display.setState();
       double secondNumber = Display.getState();
       result = firstNumber + secondNumber;
       Display.println(result);
   }
   
   public void subtract() {
       Display.setState();
       double firstNumber = Display.getState();
       Display.setState();
       double secondNumber = Display.getState();
       result = firstNumber - secondNumber;
       Display.println(result);
   }
   
   public void multiply() {
       Display.setState();
       double firstNumber = Display.getState();
       Display.setState();
       double secondNumber = Display.getState();
       result = firstNumber * secondNumber;
       Display.println(result);
   }
   
   public void divide() {
       Display.setState();
       double firstNumber = Display.getState();
       Display.setState();
       double secondNumber = Display.getState();
       result = firstNumber / secondNumber;
       Display.println(result);
   }
   
   public void square() {
       Display.setState();
       double number = Display.getState();
       result = number * number;
       Display.println(result);
   }
   
   public void squareRoot() {
       Display.setState();
       double number = Display.getState();
       result = Math.sqrt(number);
       Display.println(result);
   }
   
   public void exponentiate() {
       Display.setState();
       double firstNumber = Display.getState();
       Display.setState();
       double secondNumber = Display.getState();
       result = Math.pow(firstNumber, secondNumber);
       Display.println(result);
   }
   
   public void inverse() {
       Display.setState();
       double number = Display.getState();
       result = 1/number;
       Display.println(result);
   }
   
   public void getError() {
       System.err.println("Err");
   }
   
   /*public void subtract(double firstNumber, double secondNumber) {
       result = state - secondNumber;
       Display.println(result);
   }*/
    
}