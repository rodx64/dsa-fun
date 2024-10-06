package algorithms.recursion;

public class BasicRecursion {

    public static String decimalToBinary(int n) {
        if (n <= 1) {
            System.out.println(n);
            return String.valueOf(n);
        }
        System.out.println(n % 2);
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static int factorial(int n) {
        if (n <= 0) return -1;
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}
