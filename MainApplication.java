/* Create a scientific calculator that utilizes user input and shows results
 * on display.
 * Created by ashblox, yangtree21st, ajahdailey 
 * Version 1.0
 */


public class MainApplication {
    
    
    public static void main(String[] args) {

        while (true) {
            String kind = Display.getKindOfOperation();
            String operation = "";
            if ("quit".equals(kind)) {
                break;
            } else if ("basic".equals(kind)){
                operation = Display.getBasicOperation();
                run(operation);
            } else if ("trigonometric".equals(kind)){
                operation = Display.getTrigOperation();
                run(operation);
            } else if ("logarithmic".equals(kind)){
                operation = Display.getLogOperation();
                run(operation);
            }
            //} else {
            //    run(kind);
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
            case "sine":
                Calculator.sin();
                break;
            case "cosine":
                Calculator.cos();
                break;   
            case "tangent":
                Calculator.tan();
                break;
            case "inverse sine":
                Calculator.sinh();
                break;
            case "inverse cosine":
                Calculator.cosh();
                break;    
            case "inverse tangent":
                Calculator.tanh();
                break;    
            case "factorial":
                Calculator.factorial();
                break; 
            case "log":
                Calculator.log();
                break; 
            case "inverse log":
                Calculator.inverseLog();
                break; 
            case "natural log":
                Calculator.naturalLog();
                break; 
            case "inverse natural log":
                Calculator.inverseNaturalLog();
                break; 
        }
        
       
    }
}
      
