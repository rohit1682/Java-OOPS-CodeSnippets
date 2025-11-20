
public class NestedTry {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try starts");

            int arr[] = {10, 20, 30};

            try {
                System.out.println("Inner try starts");
                int result = arr[1] / 0; // risky code
                System.out.println("Result = " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            System.out.println(arr[5]); // another risky code → array index error

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index error");
        }

        System.out.println("Program continues normally");
    }
}
