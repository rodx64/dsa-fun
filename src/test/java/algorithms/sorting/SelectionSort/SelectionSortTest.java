package algorithms.sorting.SelectionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    void selectionSortTest() {
        int[] arr = {5, 3, 8, 4, 2};

        SelectionSort.run(arr);

        assertEquals(2, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(5, arr[3]);
        assertEquals(8, arr[4]);
    }
}