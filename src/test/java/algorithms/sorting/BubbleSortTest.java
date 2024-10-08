package algorithms.sorting;

import algorithms.sorting.BubbleSort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    void bubbleSortTestImpl1() {
        int[] arrTest1 = {9, 4, 3, 2, 1, 34, 6, 7, 11};
        BubbleSort.runImpl1(arrTest1);

        assertEquals(1, arrTest1[0]);
        assertEquals(2, arrTest1[1]);
        assertEquals(3, arrTest1[2]);
        assertEquals(4, arrTest1[3]);
        assertEquals(6, arrTest1[4]);
        assertEquals(7, arrTest1[5]);
        assertEquals(9, arrTest1[6]);
    }

    @Test
    void bubbleSortTestImpl2() {
        int[] arrTest2 = {3, 3, 3, 2, 1, 23, 34, 5, 11, 98};
        BubbleSort.runImpl2(arrTest2);

        assertEquals(1, arrTest2[0]);
        assertEquals(2, arrTest2[1]);
        assertEquals(3, arrTest2[2]);
        assertEquals(3, arrTest2[3]);
        assertEquals(3, arrTest2[4]);
        assertEquals(5, arrTest2[5]);
        assertEquals(11, arrTest2[6]);
        assertEquals(23, arrTest2[7]);
        assertEquals(34, arrTest2[8]);
        assertEquals(98, arrTest2[9]);
    }

}
