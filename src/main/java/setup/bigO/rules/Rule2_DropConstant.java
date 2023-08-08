package setup.bigO.rules;

public class Rule2_DropConstant {

    /**
     *     BIG O
     *     RULE 2 - DROP CONSTANTS
     */

    private static String[] biggest = new String[10000000];

    public static void main(String[] args) {
        print(biggest); // 14 ms
    }


    /**
     *  Neste caso o Big O poderia ser considerado: O(N + N) = O(2N)
     *  Mas na prática, retira-se as constantes e mantem somente o valor de N
     *  Ou seja, O(N)
     */
    private static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++){
            System.out.println(i); // O(N)
        }

        for (int j = 0; j < 10; j++){
            System.out.println(j); // O(N)
        }
    }

}
