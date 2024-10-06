package bigO.rules;

public class Rule2_DropConstant {

    /**
     * BIG O
     * RULE 2 - DROP CONSTANTS
     */

    private static String[] biggest = new String[10000000];

    public static void main(String[] args) {
        print(biggest);
    }

    /**
     * In this case the Big O could be considered: O(N + N) = O(2N)
     * But in practice, a single array is counted as the sum of the two arrays and the constants are removed
     * <p>
     * That is O(N)
     */
    private static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i); // O(N)
        }

        for (int j = 0; j < 10; j++) {
            System.out.println(j); // O(N)
        }
    }

}
