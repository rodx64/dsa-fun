package challenges;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _HashTableItemInCommom {

    /**
     *
     * Find item in common between two arrays
     *
     * [1,2,5]
     * [3,6,5]
     */

    int[] arr1 = {1,2,5};
    int[] arr2 = {3,6,5};
    int[] arr3 = {3,6,4};

    @Test
    void givenArraysWithCommonNumber_WhenComparingEachOther_ShouldReturnTrue() {
        assertTrue(itemInCommonBasic(arr1, arr2));
        assertTrue(itemInCommonHashMap(arr1, arr2));
    }

    @Test
    void givenArraysWithoutCommonNumber_WhenComparingEachOther_ShouldReturnFalse() {
        assertFalse(itemInCommonBasic(arr1, arr3));
        assertFalse(itemInCommonHashMap(arr1, arr3));
    }


    /**
     * Basic Solution -> Big O(n²)
     */
    boolean itemInCommonBasic(int[] arr1, int[] arr2){
        long startTime = System.nanoTime();
        for(int i : arr1){      // BIG O(n)
            for(int j : arr2){  // BIG O(n)
                if(i == j){
                    long endTime = System.nanoTime();
                    long duration = (endTime - startTime);
                    System.out.println("TIME IN NANO Basic: " + duration);
                    return true;
                }
            }
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("TIME IN NANO Basic: " + duration);
        return false;
    }

    /**
     *  Other Solution
     */
    boolean itemInCommonHashMap(int[] arr1, int[] arr2){
        long startTime = System.nanoTime();
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (int i : arr1) {
            hashMap.put(i, true);
        }
        for (int i : arr2) {
            if(hashMap.get(i) != null){
                long endTime = System.nanoTime();
                long duration = (endTime - startTime);
                System.out.println("TIME IN NANO HashMap: " + duration);
                return true;
            };
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("TIME IN NANO HashMap: " + duration);
        return false;
    }
}

