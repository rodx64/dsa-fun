package bigO.tests;

public class BigOCalculation2 {

    public static void main(String[] args) {
        System.out.println(funChallenge2(new int[10]));
        // Result of this Big O(4 + 7n)
    }

    public static String funChallenge2(int[] arr) {
        var a = 5;  // O(1)
        var b = 10; // O(1)
        var c = 50; // O(1)

        for (int i = 0; i < arr.length; i++) { // O(n)
            var x = i + 1; // O(n)
            var y = i + 2; // O(n)
            var z = i + 3; // O(n)
        }
        for (int j = 0; j < arr.length; j++) { // O(n)
            int p = j * 2; // O(n)
            int q = j * 2; // O(n)
        }
        return "I don't know"; // O(1)
    }



}
