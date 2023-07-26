package bigO.rules;

public class Rule4 {

    /**
     *     BIG O
     *     RULE 4 - DROP NON DOMINANTS
     *
     *      No caso, existem funções O(n) e O(n²) no mesmo processo
     *      Ficando O(n + n²)..
     *      Porém, o n² é muito mais considerável no processo do que o n, logo, removemos n
     *      e assume a função apenas O(n²)
     *
     */

    private static final int maxNumbers = 10;
    private static int[] numbers = new int[maxNumbers];

    public static void main(String[] args) {
        fillArrays();
        compress(numbers);
    }

    //
    private static void compress(int[] nums) {
        System.out.println("Numbers...");
        for (int i = 0; i < nums.length; i++) { // O(n)
            firstNumbers(i);
        }

        System.out.println("\nSum of Numbers...");
        for (int i = 0; i < nums.length; i++) { // O(n²)
            firstNumbers(i);    // O(n)
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
