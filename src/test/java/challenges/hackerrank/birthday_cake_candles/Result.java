package challenges.hackerrank.birthday_cake_candles;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Result {

    /**
     *  You are in charge of the cake for a child's birthday.
     *
     *  You have decided the cake will have one candle for each year of their total age.
     *
     *  They will only be able to blow out the tallest of the candles.
     *
     *  Count how many candles are tallest.
     *
     *
     * Example
     * candles = [4,4,1,3]
     * The maximum height candles are units high. There are  of them, so return .
     *
     */

    public static int birthdayCakeCandlesFaster(List<Integer> candles){
        int counter = 1;
        int previous = candles.get(0);

        for (int i = 1; i < candles.size(); i++) {
            if(candles.get(i) > previous){
                previous = candles.get(i);
                counter = 1;
            } else if (candles.get(i) == previous) {
                counter+=1;
            }
        }

        return counter;
    }

    // Simple (Without Streams)
    public static int birthdayCakeCandles(List<Integer> candles){
        Integer biggestValue = candles.get(0);
        int counter = 0;

        // O(N)
        for (int i = 1; i < candles.size() - 1; i++) {
            if(candles.get(i) > biggestValue){
                biggestValue = candles.get(i);
            }
        }

        // O(N)
        for (int candle : candles){
            if(candle == biggestValue){
                counter += 1;
            }
        }

        return counter; // O(2N) -> Drop constant - O(N)
    }


    // Using streams
    public static int birthdayCakeCandlesWithStreams(List<Integer> candles) {
        int biggestQuantity = candles.stream()
                .max(Integer::compareTo)
                .get();


        return (int) candles.stream().filter(i -> i == biggestQuantity).count();
    }

    @Test
    void testFaster(){
        int firstAssert = birthdayCakeCandlesFaster(List.of(3,2,3,1));
        int secondAssert = birthdayCakeCandlesFaster(List.of(3,2,1,3,1,0,2));
        int thirdAssert = birthdayCakeCandlesFaster(List.of(3,2,1,3,1,0,2,3,4,3,5));

        assertEquals(2, firstAssert);
        assertEquals(2, secondAssert);
        assertEquals(1, thirdAssert);
    }

    @Test
    void testSimple(){
        int firstAssert = birthdayCakeCandles(List.of(3,2,3,1));
        int secondAssert = birthdayCakeCandles(List.of(3,2,1,3,1,0,2));
        int thirdAssert = birthdayCakeCandles(List.of(3,2,1,3,1,0,2,3,4,3,5));

        assertEquals(2, firstAssert);
        assertEquals(2, secondAssert);
        assertEquals(1, thirdAssert);
    }

    @Test
    void testWithStream(){
        int firstAssert = birthdayCakeCandlesWithStreams(List.of(3,2,3,1));
        int secondAssert = birthdayCakeCandlesWithStreams(List.of(3,2,1,3,1,0,2));
        int thirdAssert = birthdayCakeCandlesWithStreams(List.of(3,2,1,3,1,0,2,3,4,3,5));

        assertEquals(2, firstAssert);
        assertEquals(2, secondAssert);
        assertEquals(1, thirdAssert);
    }

}
