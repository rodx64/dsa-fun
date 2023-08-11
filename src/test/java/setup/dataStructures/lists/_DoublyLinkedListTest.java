package setup.dataStructures.lists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _DoublyLinkedListTest {

    @Test
    void validateMyDoublyLinkedList(){
        _DoublyLinkedList dll = new _DoublyLinkedList(7);
        dll.printList();

        assertEquals(7, dll.getHead().value);
        assertEquals(7, dll.getTail().value);
        assertEquals(1, dll.getLength());
    }

    @Test
    void validateAppend(){
        _DoublyLinkedList dll = new _DoublyLinkedList(7);

    }
}