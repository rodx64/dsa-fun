package challenges;

// LL: Find Middle Node
public class _LinkedListChallengeReverseBetween {

    /**
     *
     *  In the LinkedList class, implement a method called reverseBetween that reverses the nodes of the list between indexes m and n (inclusive).
     *  The method should not return any value, and it should modify the original linked list.
     *  Note:
     *      - The Linked List does not have a tail which will make the implementation easier.
     *      - The positions m and n are 0-indexed.
     *
     *  Example:
     *  Given the following linked list:
     *  1 -> 2 -> 3 -> 4 -> 5
     *
     *  Calling reverseBetween(1, 3) should result in the following modified linked list:
     *  1 -> 4 -> 3 -> 2 -> 5
     *
     *  Notes:
     *     - The method should not duplicate any of the existing nodes, only rearranging the existing nodes in the list.
     *     However, the creation of a limited number of new nodes is allowed
     *     (e.g., dummy nodes to facilitate the partitioning process).
     *     - The method should not use any extra data structures such as arrays or lists.
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

    public _LinkedListChallengeReverseBetween(int value) {
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

    public void reverseBetween(int m, int n) {
       // TODO
    }

}
