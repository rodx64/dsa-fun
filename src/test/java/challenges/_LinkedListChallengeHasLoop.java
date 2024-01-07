package challenges;

import org.junit.jupiter.api.Test;

// LL: Find Middle Node
public class _LinkedListChallengeHasLoop {

    /**
     *
     * Implement a method called hasLoop that checks whether the list contains a loop or not.
     * If the list contains a loop, the method should return true; otherwise, it should return false.
     *
     * Example:
     *
     * LinkedList myList = new LinkedList(1);
     * myList.append(2);
     * myList.append(3);
     * myList.append(4);
     * myList.append(5);
     *
     * boolean result = myList.hasLoop(); // Output: false
     *
     * // Manually create a loop for testing purposes
     * myList.getHead().next.next.next = myList.getHead().next;
     *
     * result = myList.hasLoop(); // Output: true
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

    public _LinkedListChallengeHasLoop(int value) {
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

    public boolean hasLoop(){
        if(head == null) return false;
        Node slower = head;
        Node faster = head;

        while (faster.next != null){
            slower = slower.next;
            faster = faster.next;
            faster = faster.next;
            if(slower.value == faster.value) return true;
        }
        return false;
    }

}
