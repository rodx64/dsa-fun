package algorithms.sorting.SelectionSort;

public class SelectionSort {

    public static void run(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = findIndexOfMinimumValue(array, i);
            boolean isSmallerThanCurrent = i != minIndex;

            if (isSmallerThanCurrent) {
                // swap current with smaller
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }

    private static int findIndexOfMinimumValue(int[] array, int i) {
        int minIndex = i;

        for (int j = i + 1; j < array.length; j++) {
            int currentValue = array[minIndex];
            int nextValue = array[j];

            if (nextValue < currentValue) {
                minIndex = j;
            }
        }
        return minIndex;
    }

    /**
     *     [5, 3, 8, 4, 2]
     *     Steps:
     *
     *     First Pass (i = 0):
     *         minIndex starts at 0 (value 5).
     *         Inner loop finds 2 at index 4 to be the smallest.
     *         Swap 5 with 2.
     *         Array after first pass: [2, 3, 8, 4, 5]
     *
     *     Second Pass (i = 1):
     *         minIndex starts at 1 (value 3).
     *         Inner loop finds no smaller value.
     *         No swap is needed.
     *         Array after second pass: [2, 3, 8, 4, 5]
     *
     *     Third Pass (i = 2):
     *         minIndex starts at 2 (value 8).
     *         Inner loop finds 4 at index 3.
     *         Swap 8 with 4.
     *         Array after third pass: [2, 3, 4, 8, 5]
     *
     *     Fourth Pass (i = 3):
     *         minIndex starts at 3 (value 8).
     *         Inner loop finds 5 at index 4.
     *         Swap 8 with 5.
     *         Array after fourth pass: [2, 3, 4, 5, 8]
     */

}
