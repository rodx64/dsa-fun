package challenges;

// LL: Find Middle Node
public class _LinkedListChallengeFindMiddle {

    /**
     *
     * If the list has an even number of nodes, the method should return the second middle node.
     *
     * LinkedList myList = new LinkedList(1);
     * myList.append(2);
     * myList.append(3);
     * myList.append(4);
     * myList.append(5);
     * Node middleNode = myList.findMiddleNode();
     * System.out.println(middleNode.value); // Output: 3
     *
     * myList.append(6);
     * middleNode = myList.findMiddleNode();
     * System.out.println(middleNode.value); // Output: 4
     *
     */

    private Node head;
    private Node tail;

    public class Node {
        public int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public _LinkedListChallengeFindMiddle(int value) {
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

    public Node findMiddleNode(){
        if(head == null) return null;
        Node slower = head;
        Node faster = head;

        while(faster.next != null){
            slower = slower.next;
            faster = faster.next;
            if(faster.next == null) break;
            faster = faster.next;
        }

        return slower;
    }

}
