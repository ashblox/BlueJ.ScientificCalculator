
/* Create a scientific calculator that utilizes user input and shows results
 * on display.
 * Created by ashblox, yangtree21st, ajahdailey 
 * Version 1.0
 */


public class MainApplication {
    
    
    public static void main(String[] args) {

        while (true) {
            String operation = Display.getOperation();
            if ("quit".equals(operation)) {
                break;
            } else {
                run(operation);
            }
        }

    }
    public static void run(String operation) {
        
        switch (operation) {
            case "add":
                Calculator.add();
                break;
            case "subtract":
                Calculator.subtract();
                break;
            case "multiply":
                Calculator.multiply();
                break;
            case "divide":
                Calculator.divide();
                break;
            case "square":
                Calculator.square();
                break;
            case "square root":
                Calculator.squareRoot();
                break;
            case "exponentiate":
                Calculator.exponentiate();
                break;
            case "inverse":
                Calculator.inverse();
                break;
            case "sin":
                Calculator.sin();
                break;
            case "cos":
                Calculator.cos();
                break;   
            case "tan":
                Calculator.tan();
                break;
            case "inverse sin":
                Calculator.sinh();
                break;
            case "inverse cosine":
                Calculator.cosh();
                break;    
            case "inverse tangent":
                Calculator.tanh();
                break;    
            }
            
        }
        
       
    }
      
