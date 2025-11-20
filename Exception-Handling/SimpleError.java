import java.util.*;

public class SimpleError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {
            int c = a/b;
            System.out.println("Result: " + c);
            // Try block can also be nested within another try block

            // try {

            // }
            // catch () {

            // }
        }
        catch (Exception e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        // The finally block will always execute
        finally {
            System.out.println("Execution of try-catch block is complete.");
        }

        // A try block can be followed by multiple catch blocks to handle different types of exceptions
        // Try block should either be followed by catch or finally block
        
        // This line will execute regardless of whether an exception occurred or not just because we used the try-catch blocks
        System.out.println("End of the program");

        sc.close();
    }
}