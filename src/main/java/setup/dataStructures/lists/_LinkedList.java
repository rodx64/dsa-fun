package setup.dataStructures.lists;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Simplifying the structure of LinkedList
// Generic structure idea (resources/structure/linked-list-structure-idea.txt)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class _LinkedList {

    /**
     *  Details:
     *  - Linked Lists don't have sequential space in memory, so they don't have indexes.
     *  - They have HEAD and TAIL, and between these the other data scattered in memory point to each other (pointer)
     */

    private Node head;
    private Node tail;
    private int length;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public
    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    public _LinkedList(int value){
        Node nodeA = new Node(value);
        head = nodeA;
        tail = nodeA;
        length = 1;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    public void append(int value){
        Node newNode = new Node(value);

        // If the length is zero, the new node will be unique and will have a Head and Tail in it's own
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(length == 0) return null;

        // We initialize two support variables to move through the list
        Node tmp = head;
        Node prev = head;

        // The previous value of tmp will be stored in prev
        // Tmp will move forward as long as next exists
        while(tmp.next != null){
            prev = tmp;
            tmp = tmp.next;
        }

        // Coming to the end of the list, the new tail value is what is stored in prev
        // And next must be set to null
        tail = prev;
        tail.next = null;

        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return tmp;
    }

}
