package bigO.tests;

public class BigOCalculation1 {

    public static void main(String[] args) {

        funChallenge(new int[10]);
        // Result of this Big O(3 + 4n)

    }

    public static int funChallenge(int[] arr) {
        var a = 10; // O(1)
        a = 50 + 3; // O(1)

        for (int i = 0; i < arr.length; i++) { // O(n) -> where n = arr
            anotherFunction(); // O(n) -> because it'll be called arr.length
            var stranger = true; // O(n) -> because it'll be called arr.length
            a++; // O(n) -> because it'll be called arr.length
        }

        return a; // O(1);
    }


    // called N times
    private static void anotherFunction() {
    }

}
