package setup.bigO.types;

// Each value represents one request:  O(n²) - Square  (increases quadratically)
public class Square_O {

    private static final int[] arr = new int[]{1,2,3,4,5};
    
    public static void main(String[] args) {
        printPairs(arr);
    }

    private static void printPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // O(n)
            for (int j = 0; j < arr.length; j++) { // O(n)
                System.out.println(arr[i] + "" + arr[j]);   // O(n * n)
            }
        }
    }


}
