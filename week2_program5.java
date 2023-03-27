/**
 * week2_program5
 */
public class week2_program5 {
    
    
        public static void main(String[] args) {
            //to check argument in command line is enterd or not
            if (args.length == 0) {
                System.out.println("Please enter a number as a command line argument.");
                return;
            }
            
            int n = Integer.parseInt(args[0]);
            int factorial = 1;
            
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
    
    
