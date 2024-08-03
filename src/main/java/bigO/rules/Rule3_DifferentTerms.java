package bigO.rules;

public class Rule3_DifferentTerms {

    /**
     * BIG O
     * RULE 3 - DIFFERENT TERMS FOR INPUTS
     * In this case, you must look at the inputs and understand that they are not the same (x , y) .
     * Therefore, we would not have O(2n) -> becoming O(n) removing the constants.
     * And yes, O(n + m) as both must be considered
     * or even O(n * m) if they are nested, and no longer O(n²)
     */

    public static void main(String[] args) {
        fillArrays();
        compress(boxes1, boxes2);
        compressSquared(boxes1, boxes2);
    }

    private static final int maxBoxes1 = 100;
    private static final int maxBoxes2 = 5;
    private static int[] boxes1 = new int[maxBoxes1];
    private static int[] boxes2 = new int[maxBoxes2];


    // O(n + m)
    private static void compress(int[] boxes1, int[] boxes2) {
        for (int i = 1; i <= boxes1.length; i++) { // O(n)
            System.out.printf("boxes1... %d\n", i);
        }

        for (int i = 1; i <= boxes2.length; i++) { // O(m)
            System.out.printf("boxes2... %d\n", i);
        }
    }

    // O(n * m)
    private static void compressSquared(int[] boxes1, int[] boxes2) {
        for (int i = 1; i <= boxes1.length; i++) { // O(n)
            for (int j = 1; j <= boxes2.length; j++) { // O(m)
                System.out.printf("boxes1 x boxes2 (%d x %d)\n", i, j);
            }
        }
    }


    private static void fillArrays() {
        for (int i = 0; i < maxBoxes1; i++) {
            boxes1[i] = i + 1;
        }
        for (int i = 0; i < maxBoxes2; i++) {
            boxes2[i] = i + 1;
        }
    }
}
