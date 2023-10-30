package setup.dataStructures.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class _BinarySearchTreeTest {

    @Test
    void validateMyBinarySearchTree(){
        _BinarySearchTree bst = new _BinarySearchTree();
        assertEquals("_BinarySearchTree", bst.getClass().getSimpleName());
        assertNotNull(bst);
        assertNull(bst.root);
    }

    @Test
    void givenBinarySearchTree_whenInsertSameValue_thenReturnFalse() {
        _BinarySearchTree bst = new _BinarySearchTree();
        boolean wasInserted = bst.insert(10);
        assertTrue(wasInserted);
        assertEquals(bst.root.value, 10);

        boolean wasPossibleToInsertSame = bst.insert(10);

        assertNull(bst.root.right);
        assertNull(bst.root.left);
        assertFalse(wasPossibleToInsertSame);
    }

    @Test
    void givenBinarySearchTree_whenInsertDifferentValueOnRight_thenReturnTrue() {
        _BinarySearchTree bst = new _BinarySearchTree();
        boolean wasInserted = bst.insert(10);
        assertTrue(wasInserted);
        assertEquals(bst.root.value, 10);

        bst.insert(11);

        assertNull(bst.root.left);
        assertNotNull(bst.root.right);
    }

    @Test
    void givenBinarySearchTree_whenInsertDifferentValueOnLeft_thenReturnTrue() {
        _BinarySearchTree bst = new _BinarySearchTree();
        boolean wasInserted = bst.insert(10);
        assertTrue(wasInserted);
        assertEquals(bst.root.value, 10);

        bst.insert(9);

        assertNull(bst.root.right);
        assertNotNull(bst.root.left);
    }



}