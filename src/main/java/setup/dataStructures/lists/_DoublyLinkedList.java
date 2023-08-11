package setup.dataStructures.lists;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class _DoublyLinkedList {

    /**
     *  Details:
     *  basic diff (prev on Node)
     */

    private Node head;
    private Node tail;
    private int length;

    public _DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
    }
}
