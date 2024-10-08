package algorithms.sorting.BubbleSort;

public class BubbleSort {

    public static void runImpl1(int[] array) {
        int lastItem = array.length - 1;

        for (int i = lastItem; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }

    public static void runImpl2(int[] array) {
        boolean needSwap;
        do {
            needSwap = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    needSwap = true;
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
            }
        } while (needSwap);
    }
}
