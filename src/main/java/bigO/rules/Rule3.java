package bigO.rules;

public class Rule3 {

    /**
     *     BIG O
     *     RULE 3 - DIFFERENT TERMS FOR INPUTS
     *
     *      No caso, deve-se olhar para os inputs e entender que não são o mesmo.
     *
     *      Logo, não teríamos O(2n) -> tornando-se O(n) removendo as constantes..
     *      E sim, O(n + m) pois ambos devem ser considerados
     *
     *      Ou ainda O(n * m) se eles estiverem aninhados, e não mais O(n²)
     *
     */

    private static final int maxBoxes = 10000000;
    private static final int maxBoxes2 = 100;
    private static int[] boxes = new int[maxBoxes];
    private static int[] boxes2 = new int[maxBoxes2];

    public static void main(String[] args) {
        fillArrays();
        compress(boxes, boxes2);
    }


    // O(n + m)
    private static void compress(int[] boxes, int[] boxes2) {
        for (int i = 0; i < boxes.length; i++) { // O(n)
            System.out.println("...");
        }

        for (int i = 0; i < boxes2.length; i++) { // O(m)
            System.out.println("...");
        }
    }

    // O(n * m)
    private static void compressSquared(int[] boxes, int[] boxes2) {
        for (int i = 0; i < boxes.length; i++) { // O(n)
            for (int j = 0; j < boxes2.length; j++) { // O(m)
                System.out.println("...");
            }
            System.out.println("...");
        }

    }


    private static void fillArrays(){
        for (int i = 0; i < maxBoxes ; i++) {
            boxes[i] = i + 1;
        }
        for (int i = 0; i < maxBoxes2 ; i++) {
            boxes2[i] = i + 1;
        }
    }
}
