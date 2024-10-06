package algorithms.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RecursiveBinarySearchThreeTest {

    @Test
    void rRContainsTest() {
        RecursiveBinarySearchThree recursiveBinarySearchThree = new RecursiveBinarySearchThree();
        RecursiveBinarySearchThree.Node newNode = new RecursiveBinarySearchThree.Node(12);
        recursiveBinarySearchThree.setRoot(newNode);

        assertTrue(recursiveBinarySearchThree.rContains(12));
        assertFalse(recursiveBinarySearchThree.rContains(11));
        assertFalse(recursiveBinarySearchThree.rContains(0));

        recursiveBinarySearchThree.insert(-11);

        assertTrue(recursiveBinarySearchThree.rContains(-11));
    }

    @Test
    void rInsertTest() {
        RecursiveBinarySearchThree recursiveBinarySearchThree = new RecursiveBinarySearchThree();
        RecursiveBinarySearchThree.Node rootNode = new RecursiveBinarySearchThree.Node(47);
        recursiveBinarySearchThree.setRoot(rootNode);

        recursiveBinarySearchThree.insert(21);
        assertEquals(21, recursiveBinarySearchThree.getRoot().left.value);

        recursiveBinarySearchThree.insert(68);
        assertEquals(68, recursiveBinarySearchThree.getRoot().right.value);

    }

    @Test
    void rDeleteTest(){
        RecursiveBinarySearchThree recursiveBinarySearchThree = new RecursiveBinarySearchThree();
        RecursiveBinarySearchThree.Node rootNode = new RecursiveBinarySearchThree.Node(30);
        recursiveBinarySearchThree.setRoot(rootNode);

        recursiveBinarySearchThree.insert(25);
        recursiveBinarySearchThree.insert(23);
        recursiveBinarySearchThree.insert(28);
        recursiveBinarySearchThree.insert(27);
        recursiveBinarySearchThree.insert(29);
        recursiveBinarySearchThree.insert(32);
        recursiveBinarySearchThree.insert(31);
        recursiveBinarySearchThree.insert(33);

        recursiveBinarySearchThree.delete(25);

        assertEquals(27, recursiveBinarySearchThree.getRoot().left.value);
        assertEquals(23, recursiveBinarySearchThree.getRoot().left.left.value);
        assertEquals(28, recursiveBinarySearchThree.getRoot().left.right.value);
        assertEquals(29, recursiveBinarySearchThree.getRoot().left.right.right.value);
    }
}