package bigO.rules;

public class Rule4_DropNonDominants {

    /**
     * BIG O
     * RULE 4 - DROP NON DOMINANTS
     * In this case, there are O(n) and O(n²) functions in the same process O(N + N²)
     * However, N² has a much more considerable growth in the process than N,
     * Therefore, remove N and assume the function only O(N²)
     */

    public static void main(String[] args) {
        fillArrays();
        compress(numbers);
    }

    private static final int maxNumbers = 10;
    private static int[] numbers = new int[maxNumbers];

    // O(N + N²)
    private static void compress(int[] nums) {
        System.out.println("Numbers...");

        // O(n)
        for (int i = 0; i < nums.length; i++) {
            firstNumbers(i);
        }

        System.out.println("\nSum of Numbers...");

        // O(n²)
        for (int i = 0; i < nums.length; i++) {
            firstNumbers(i);
            for (int j = 0; j < nums.length; j++) {
                secondNumbers(j);
                System.out.println(i + j);
            }
        }
    }

    private static void firstNumbers(int j) {
        System.out.println("first number");//
    }

    private static void secondNumbers(int i) {
        System.out.println("second number");//
    }

    private static void fillArrays() {
        for (int i = 0; i < maxNumbers; i++) {
            numbers[i] = i + 1;
        }
    }
}
