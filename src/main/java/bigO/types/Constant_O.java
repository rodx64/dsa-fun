package bigO.types;

// Each value represents one request
public class Constant_O {

    private static final int maxBoxes = 1000000;
    private static int[] boxes = new int[maxBoxes];

    public static void main(String[] args) {
        fillBiggestArray();
        pickOneBox(boxes);
    }


    private static void pickOneBox(int[] arr) {
        System.out.println(boxes[999995]); // O(1) - Big O constant 1
    }

    private static void pickTwoBoxes(int[] arr) {
        System.out.println(boxes[999995]); // O(1) - Big O constant 1
        System.out.println(boxes[1]); // O(1) - Big O constant 2

        // Despite having more constants in the function, we still call it O(1)
        // Because the same type of BigO will always run
    }

    private static void fillBiggestArray(){
        for (int i = 0; i < maxBoxes ; i++) {
            boxes[i] = i + 1;
        }
        long end = System.currentTimeMillis();
    }

}
