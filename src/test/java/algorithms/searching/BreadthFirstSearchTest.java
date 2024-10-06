package algorithms.searching;

import algorithms.searching.BreadthFirstSearch.BreadthFirstSearch;
import data_structure.implementation._BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreadthFirstSearchTest {

    @Test
    void runTest() {
        BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
        breadthFirstSearch.setRoot(new _BinarySearchTree.Node(47));
        breadthFirstSearch.insert(21);
        breadthFirstSearch.insert(76);
        breadthFirstSearch.insert(18);
        breadthFirstSearch.insert(27);
        breadthFirstSearch.insert(52);
        breadthFirstSearch.insert(82);

        var results = breadthFirstSearch.run();
        assertEquals(47, results.get(0));
        assertEquals(21, results.get(1));
        assertEquals(76, results.get(2));
        assertEquals(18, results.get(3));
        assertEquals(27, results.get(4));
        assertEquals(52, results.get(5));
        assertEquals(82, results.get(6));
    }
}