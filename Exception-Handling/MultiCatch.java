public class MultiCatch {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};

            // Risky operation 1 → division
            int result = arr[1] / 0;
            System.out.println("Result = " + result);

            // Risky operation 2 → array index
            System.out.println(arr[5]);

        } catch (ArithmeticException e) {
            System.out.println("Catch 1: Cannot divide by zero");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch 2: Array index error");

        } catch (Exception e) {
            System.out.println("General catch block");
        }

        System.out.println("Program continues normally");
    }
}
