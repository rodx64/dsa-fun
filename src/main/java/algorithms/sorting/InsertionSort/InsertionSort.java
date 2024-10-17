package algorithms.sorting.InsertionSort;

public class InsertionSort {

    public static void run(int[] array) {

        // Start taking the second element
        for (int i = 1; i < array.length; i++) {
            int currentValue = array[i];
            int j = i - 1;

            // Shift elements of array that are greater than current
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }

    }

    /**
     *     [5, 3, 8, 4, 2]
     *     Steps:
     *
     *     First Pass (i = 1):
     *         current = 3, j = 0
     *         Compare 3 with 5 → Shift 5 right
     *         Array after shift: [5, 5, 8, 4, 2]
     *         Insert 3 in position 0: [3, 5, 8, 4, 2]
     *
     *     Second Pass (i = 2):
     *         current = 8, j = 1
     *         8 is already in the correct place, so no shifts are needed.
     *         Array stays [3, 5, 8, 4, 2]
     *
     *     Third Pass (i = 3):
     *         current = 4, j = 2
     *         Compare 4 with 8 → Shift 8 right
     *         Compare 4 with 5 → Shift 5 right
     *         Array after shifts: [3, 4, 5, 8, 2]
     *
     *     Fourth Pass (i = 4):
     *         current = 2, j = 3
     *         Compare 2 with 8 → Shift 8 right
     *         Compare 2 with 5 → Shift 5 right
     *         Compare 2 with 4 → Shift 4 right
     *         Compare 2 with 3 → Shift 3 right
     *         Insert 2 at position 0: [2, 3, 4, 5, 8]
     */
}
