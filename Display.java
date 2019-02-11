
/**
 * Write a description of class asdfsd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

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
    
    public static String getOperation() {
        printLine("What operation do you want to perform?");
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