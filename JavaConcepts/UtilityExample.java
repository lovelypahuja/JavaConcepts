package JavaConcepts.JavaConcepts;

class mathUtils {
    // Private constructor prevents instantiation
    private mathUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}

// Test Utility Class
public class UtilityExample {
    public static void main(String[] args) {
        System.out.println(mathUtils.add(5, 10));
        System.out.println(mathUtils.multiply(3, 4));

        //mathUtils obj = new mathUtils();  // Compilation error
    }
}