package setup.bigO.rules;

public class Rule4_DropNonDominants {

    /**
     *     BIG O
     *     RULE 4 - DROP NON DOMINANTS
     *
     *      No caso, existem funções O(n) e O(n²) no mesmo processo
     *      O(N + N²)
     *      Porém, o N² tem um crescimento muito mais considerável no processo do que o N,
     *      Logo, remove-se N e assume a função apenas O(N²)
     *
     */

    private static final int maxNumbers = 10;
    private static int[] numbers = new int[maxNumbers];

    public static void main(String[] args) {
        fillArrays();
        compress(numbers);
    }

    // O(N + N²)
    private static void compress(int[] nums) {
        System.out.println("Numbers...");
        for (int i = 0; i < nums.length; i++) { // O(n)
            firstNumbers(i);
        }

        System.out.println("\nSum of Numbers...");
        for (int i = 0; i < nums.length; i++) { // O(n²)
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

    private static void fillArrays(){
        for (int i = 0; i < maxNumbers; i++) {
            numbers[i] = i + 1;
        }
    }
}
