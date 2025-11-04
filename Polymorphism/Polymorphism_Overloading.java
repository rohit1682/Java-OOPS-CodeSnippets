// code to define compile time polymorphism in java
class MathOperations {
    int x;

    MathOperations() {
        System.out.println("MathOperations class instantiated");
    }

    MathOperations(int x) {
        this.x = x;
        System.out.println("MathOperations class instantiated with value: " + x);
    }

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        // return a + b + c;
        return this.add(a,b) + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}
public class Polymorphism_Overloading {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        mathOps.x=5;

        MathOperations mathOpsWithValue = new MathOperations(10);

        // Calling method to add two integers
        int sum1 = mathOps.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        // Calling method to add three integers
        int sum2 = mathOps.add(5, 10, 15);
        System.out.println("Sum of three integers: " + sum2);

        // Calling method to add two double values
        double sum3 = mathOps.add(5.5, 10.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
}