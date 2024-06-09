package challenges.hackerrank.dynamic_array_2d;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     *
     */

    @Test
    void testing(){
        assertEquals(rotateLeft(3, Arrays.asList(2,3,4,5)).get(0), 5);
        assertEquals(rotateLeft(2, Arrays.asList(2,3,4,5)).get(0), 4);
        assertEquals(rotateLeft(1, Arrays.asList(2,3,4,5)).get(0), 3);
    }

    // O(2n) -> Drop constant -> O(n)
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        List<Integer> modifiedArr = new ArrayList<>();

        for (int i = d; i < arr.size(); i++) {
            modifiedArr.add(arr.get(i));
        }

        for(int i = 0; i < d; i++){
            modifiedArr.add(arr.get(i));
        }

        return modifiedArr;
    }



}
