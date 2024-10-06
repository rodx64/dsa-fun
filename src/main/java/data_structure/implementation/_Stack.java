package data_structure.implementation;

public class _Stack {

    /**
     * Details:
     * LIFO
     * <p>
     * The "best" way to reproduce a Stack is using a LinkedList,
     * because from the beginning always is O(1) to Push AND Remove items.
     * And it's great for a LIFO
     */

    Node top;
    int height;

    public _Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node tmp = top;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void push(int i) {
        Node newNode = new Node(i);
        if (height > 0) newNode.next = top;
        top = newNode;
        height++;
    }

    public Node pop() {
        if (height == 0) return null;

        top = top.next;
        height--;
        return top;
    }

    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static class Node {
        int value;
        Node next;

        public Node() {}

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
