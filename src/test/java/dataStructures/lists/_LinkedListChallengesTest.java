package dataStructures.lists;

import challenges.dsa._LinkedListChallengeFindMiddle;
import challenges.dsa._LinkedListChallengeFindNthNodeFromEnd;
import challenges.dsa._LinkedListChallengeHasLoop;
import challenges.dsa._LinkedListChallengeReverseBetween;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _LinkedListChallengesTest {

    @Test
    void validateFindMiddleNode(){
        _LinkedListChallengeFindMiddle linkedList = new _LinkedListChallengeFindMiddle(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        _LinkedListChallengeFindMiddle.Node middleNode = linkedList.findMiddleNode();
        assertEquals(3, middleNode.value);

        linkedList.append(6);
        middleNode = linkedList.findMiddleNode();
        assertEquals(4, middleNode.value);
    }

    @Test
    void validateHasLoop(){
        _LinkedListChallengeHasLoop linkedList = new _LinkedListChallengeHasLoop(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        assertFalse(linkedList.hasLoop());

        // Manually create a loop for testing purposes
        linkedList.getHead().next.next.next = linkedList.getHead().next;
        assertTrue(linkedList.hasLoop());
    }

    @Test
    void validateFindKthFromEnd(){
        _LinkedListChallengeFindNthNodeFromEnd linkedList = new _LinkedListChallengeFindNthNodeFromEnd(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        assertEquals(4, linkedList.findKthFromEnd(2).value);
        assertNull(linkedList.findKthFromEnd(6));
    }

    @Test
    void validateReverseBetween(){
        _LinkedListChallengeReverseBetween linkedList = new _LinkedListChallengeReverseBetween(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.printList();

        linkedList.reverseBetween(1, 3);
        linkedList.printList();

    }
}