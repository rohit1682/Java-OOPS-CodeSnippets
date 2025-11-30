
public class ThrowsAndThrowExample {
    
    void divideNumbers(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        
        ThrowsAndThrowExample example = new ThrowsAndThrowExample();
        try {
            example.divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
