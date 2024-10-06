package bigO.types;


public class Constant_O {

    /**
     *  Each value represents a constant.
     */

    private static final int maxBoxes = 1000000;
    private static int[] boxes = new int[maxBoxes];

    public static void main(String[] args) {
        fillBiggestArray();
        pickOneBox(boxes);
        pickTwoBoxes(boxes);
    }


    private static void pickOneBox(int[] arr) {
        System.out.println(boxes[999995]);
    }

    private static void pickTwoBoxes(int[] arr) {
        System.out.println(boxes[999995]); // O(1) - Big O constant 1
        System.out.println(boxes[0]); // O(1) - Big O constant 2

        // Although we have O(2), we consider O(1)
    }

    private static void fillBiggestArray(){
        for (int i = 0; i < maxBoxes ; i++) {
            boxes[i] = i + 1;
        }
        long end = System.currentTimeMillis();
    }

}
