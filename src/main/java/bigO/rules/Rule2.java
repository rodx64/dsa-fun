package bigO.rules;

public class Rule2 {

    /**
     *     BIG O
     *     RULE 2 - REMOVING CONSTANTS
     *
     *     Neste caso o Big O poderia ser considerado Big O(12 + 2n)
     *     Mas, por questões praticas, retira-se as constantes e mantem somente o valor de N
     *     Restando apenas O(n)
     */

    private static String[] biggest = new String[10000000];

    public static void main(String[] args) {
        fillBiggestArray();
        findNemo(biggest); // 14 ms
    }


    // O(12 + 2N)
    private static void findNemo(String[] arr) {
        var test = ""; // O(1)
        var test2 = 1; // O(1)

        for (int i = 0; i < arr.length; i++){
            System.out.println("processing"); // O(N)
            System.out.println("processing"); // O(N)
        }

        for (int i = 0; i < 10; i++){ // // O(10)
            // some process
        }
    }

    private static void fillBiggestArray(){
        for (int i = 1; i < 10000000; i++) {
            biggest[i] += 1;
        }
    }
}
