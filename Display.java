
/**
 * Write a description of class asdfsd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.math.BigInteger;

public class Display
{
    /* instance variable, state, referring to the current value displayed
    on the console
    */ 
    public static double state;
    static Scanner input = new Scanner(System.in);
    
    // create object called Display    
    public Display() {
       
       // initialize state variable with value of zero
       double state = 0;
    }
    
    public static void printLine(String prompt) {
        System.out.println(prompt);
    }
    
    public static String getKindOfOperation() {
        printLine("What kind of operation do you want to perform? < basic, trigonometric, or logarithmic >");
        String kind = input.nextLine();
        return kind;
    }
    
    public static String getBasicOperation() {
        printLine("What would you like to do? < add, subtract, multiply, divide, square, square root, exponentiate, inverse, or factorial >");
        String operation = input.nextLine();
        return operation;
    }
    
    public static String getTrigOperation() {
        printLine("Which trig function would you like to use? < sine, cosine, tangent, inverse sine, inverse cosine, inverse tangent >");
        String operation = input.nextLine();
        return operation;
    }
    
    public static String getLogOperation() {
        printLine("Which log function would you like to use? < log, inverse log, natural log, inverse natural log >");
        String operation = input.nextLine();
        return operation;
    }
    
    public static double getNumber(){
        printLine("What number do you want to use?");
        double number = input.nextDouble();
        input.nextLine();
        state = number;
        return number;
    }
    
    public static double getOtherNumber(){
        printLine("What other number do you want to use?");
        double number = input.nextDouble();
        input.nextLine();
        state = number;
        return number;
    }
   
    // updates state with user's input
    public static void setState() {
        Scanner input = new Scanner(System.in);
        state = input.nextDouble();
    }
    
    // creates method to get state
    public static double getState() {
        return state;
    }
  
    // create method to clear display
    public static void clearDisplay() {
        System.out.println('\u000C');
    }
    
    // create method to clear the state
    public static void clearState() {
        state = 0;
    }
    
    // create method to change the sign of the display
    public static void changeSign() {
        state = -state;
    }
    
    // create method to print to console
    public static void println(double number) {
        System.out.println(number);
        state = number;
    }
    
}
