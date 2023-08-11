package challenges;

import setup.dataStructures.lists._LinkedList;

// LL: Find Middle Node
public class _LinkedListChallengeFindNthNodeFromEnd {

    /**
     *
     LL: Find Kth Node From End
     Implement a method called findKthFromEnd that returns the k-th node from the end of the list.
     If the list has fewer than k nodes, the method should return null.
     Note: This implementation of the Linked List class does not have the length attribute.

     Example:
     LinkedList myList = new LinkedList(1);
     myList.append(2);
     myList.append(3);
     myList.append(4);
     myList.append(5);

     Node result = myList.findKthFromEnd(2); // Output: Node with value 4
     result = myList.findKthFromEnd(5); // Output: Node with value 1
     result = myList.findKthFromEnd(6); // Output: null
     *
     */

    private Node head;
    private Node tail;

    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public _LinkedListChallengeFindNthNodeFromEnd(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // returns the k-th node from the end of the list.
    public Node findKthFromEnd(int k) {
        Node slow = head; // Initialize slow pointer at head
        Node fast = head; // Initialize fast pointer at head

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) return null;
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
