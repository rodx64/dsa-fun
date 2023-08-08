package dataStructures.lists;

import org.junit.jupiter.api.Test;
import setup.dataStructures.lists._LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class _LinkedListTest {

    @Test
    void validateMyLinkedList(){
        _LinkedList linkedList = new _LinkedList(4);

        assertEquals(4, linkedList.getHead().getValue());
        assertEquals(4, linkedList.getTail().getValue());
        assertEquals(1, linkedList.getLength());
        linkedList.printList();
    }

    @Test
    void validateMyAppend(){
        _LinkedList linkedList = new _LinkedList(1);
        linkedList.append(3);
        linkedList.append(7);

        assertEquals(1, linkedList.getHead().getValue());
        assertEquals(7, linkedList.getTail().getValue());
        assertEquals(3, linkedList.getLength());
    }

    @Test
    void validateMyRemoveLast(){
        _LinkedList linkedList = new _LinkedList(12);
        linkedList.append(88);
        linkedList.append(7);
        linkedList.removeLast();

        assertEquals(12, linkedList.getHead().getValue());
        assertEquals(2, linkedList.getLength());
        assertEquals(88, linkedList.getTail().getValue());

        linkedList.removeLast();
        linkedList.removeLast();

        assertEquals(0, linkedList.getLength());
        assertEquals(null, linkedList.getHead());
        assertEquals(null, linkedList.getTail());

        linkedList.removeLast();
        assertEquals(0, linkedList.getLength());
    }

}