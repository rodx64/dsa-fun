package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeAndSortArrays {

    // Create a function that merge arrays and sort

    static int[] arr1 = new int[]{0,3,4,31};
    static int[] arr2 = new int[]{4,6,30};
    static int[] ordered = new int[]{0,3,4,4,6,30,31};

    static int[] merge(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) return arr2;
        if (arr2 == null || arr2.length == 0) return arr1;

        final int maxValue = arr1.length + arr2.length;

        int[] mergedArr = new int[maxValue];

        int counterI = 0;
        int counterJ = 0;
        int counterM = 0;

        while(maxValue > (counterI + counterJ)){
            final boolean isArray1Usable = counterI <= arr1.length -1;
            final boolean isArray2Usable  = counterJ <= arr2.length -1;

            if(isArray1Usable && isArray2Usable){
                if(arr1[counterI] < arr2[counterJ]){
                    mergedArr[counterM] = arr1[counterI];
                    counterI++;
                } else{
                    mergedArr[counterM] = arr2[counterJ];
                    counterJ++;
                }
            } else if (isArray1Usable && !isArray2Usable) {
                mergedArr[counterM] = arr1[counterI];
                counterI++;
            } else if (isArray2Usable && !isArray1Usable){
                mergedArr[counterM] = arr2[counterJ];
                counterJ++;
            }
            counterM++;
        }
        return mergedArr;
    }

    @Test
    void whenMergeArrays_validateSortedArray(){
        assertArrayEquals(arr1, merge(arr1, null));
        assertArrayEquals(arr2, merge(arr2, null));
        assertArrayEquals(ordered, merge(arr1, arr2));
        assertArrayEquals(ordered, merge(arr2, arr1));
    }
}
