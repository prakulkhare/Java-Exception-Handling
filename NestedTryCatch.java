public class NestedTryCatch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String str = null;
        try {
            System.out.println("Outer try block started.");
            int result = numbers[1] / 0; 
            try {
                System.out.println("Inner try block started.");
                System.out.println("Accessing array: " + numbers[5]);
                System.out.println("String length: " + str.length()); 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } finally {
                System.out.println("Inner finally block executed.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Outer finally block executed.");
        }
    }
}
