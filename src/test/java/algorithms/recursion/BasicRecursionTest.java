package algorithms.recursion;

import org.junit.jupiter.api.Test;

import static algorithms.recursion.BasicRecursion.decimalToBinary;
import static algorithms.recursion.BasicRecursion.factorial;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicRecursionTest {

    @Test
    void decimalToBinaryTest(){
        System.out.println("Testing 13");
        assertEquals("1101", decimalToBinary(13));
        System.out.println("Testing 192");
        assertEquals("11000000", decimalToBinary(192));
        System.out.println("Testing 255");
        assertEquals("11111111", decimalToBinary(255));

    }

    @Test
    void factorialTest() {
        assertEquals(24, factorial(4));
        assertEquals(6, factorial(3));
        assertEquals(1, factorial(1));
        assertEquals(-1, factorial(0));
        assertEquals(-1, factorial(-1));
    }
}
