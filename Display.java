
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
    Scanner input = new Scanner(System.in);
    
    // create object called Display    
    public Display() {
       
       // initialize state variable with value of zero
       double state = 0;
    }
    
    // updates state with user's input
    public static void setState() {
        Scanner input = new Scanner(System.in);
        state = input.nextDouble();
        Display.println(state);
    }
    
    // creates method to get state
    public static double getState() {
        return state;
    }
  
    
    // create method to clear the state
    public static void clearState() {
        state = 0;
        Display.println(state);
    }
    
    // create method to change the sign of the display
    public static void changeSign() {
        state = -state;
        Display.println(state);
    }
    
    // create method to print to console
    public static void println(double number) {
        System.out.println(number);
        state = number;
    }
    
    
}
