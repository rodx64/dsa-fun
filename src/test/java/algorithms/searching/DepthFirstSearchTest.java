package algorithms.searching;

import algorithms.searching.DepthFirstSearch.DepthFirstSearch;
import data_structure.implementation._BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {

    @Test
    void runPreOrder() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.setRoot(new DepthFirstSearch.Node(47));
        depthFirstSearch.insert(21);
        depthFirstSearch.insert(76);
        depthFirstSearch.insert(18);
        depthFirstSearch.insert(27);
        depthFirstSearch.insert(52);
        depthFirstSearch.insert(82);

        // Pre-order result : [47, 21, 18, 27, 76, 52, 82]
        var results = depthFirstSearch.runPreOrder();
        assertEquals(47, results.get(0));
        assertEquals(21, results.get(1));
        assertEquals(18, results.get(2));
        assertEquals(27, results.get(3));
        assertEquals(76, results.get(4));
        assertEquals(52, results.get(5));
        assertEquals(82, results.get(6));

    }

    @Test
    void runInOrder() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.setRoot(new _BinarySearchTree.Node(47));
        depthFirstSearch.insert(21);
        depthFirstSearch.insert(76);
        depthFirstSearch.insert(18);
        depthFirstSearch.insert(27);
        depthFirstSearch.insert(52);
        depthFirstSearch.insert(82);

        // In-Order result: [18, 21, 27, 47, 52, 76, 82]
        var results = depthFirstSearch.runInOrder();
        assertEquals(18, results.get(0));
        assertEquals(21, results.get(1));
        assertEquals(27, results.get(2));
        assertEquals(47, results.get(3));
        assertEquals(52, results.get(4));
        assertEquals(76, results.get(5));
        assertEquals(82, results.get(6));
    }

    @Test
    void runPostOrder() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        depthFirstSearch.setRoot(new _BinarySearchTree.Node(47));
        depthFirstSearch.insert(21);
        depthFirstSearch.insert(76);
        depthFirstSearch.insert(18);
        depthFirstSearch.insert(27);
        depthFirstSearch.insert(52);
        depthFirstSearch.insert(82);

        // Post-order result: [18, 27, 21, 52, 82, 76, 47]
        var results = depthFirstSearch.runPostOrder();
        assertEquals(18, results.get(0));
        assertEquals(27, results.get(1));
        assertEquals(21, results.get(2));
        assertEquals(52, results.get(3));
        assertEquals(82, results.get(4));
        assertEquals(76, results.get(5));
        assertEquals(47, results.get(6));
    }
}