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

}
