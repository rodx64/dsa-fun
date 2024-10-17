package algorithms.sorting.InsertionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortTest {

    @Test
    void insertionSortTest() {
        int[] arr = {5, 3, 8, 4, 2};

        InsertionSort.run(arr);

        assertEquals(2, arr[0]);
        assertEquals(3, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(5, arr[3]);
        assertEquals(8, arr[4]);
    }
}
