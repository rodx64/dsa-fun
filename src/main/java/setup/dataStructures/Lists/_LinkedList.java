package setup.dataStructures.Lists;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Simplificando a estrutura de LinkedList
// Ideia da estrutura genérica (resources/structure/linked-list-structure-idea.txt)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class _LinkedList {

    /**
     *  Detalhes:
     *      Linked Lists não tem espaço sequencial na memória, por isso não possuem indices.
     *      Elas possuem HEAD e TAIL, e entre estes os demais dados espalhados na memória apontam um ao outro (ponteiro)
     *
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

        // Se o comprimento é zero, o novo node será unico e terá head e tail nele próprio
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

        // Iniciamos duas variaveis de apoio para nos movimentar pela lista
        Node tmp = head;
        Node prev = head;

        // O valor anterior de tmp ficara armazenado em prev
        // Tmp se moverá para frente enquanto existir next
        while(tmp.next != null){
            prev = tmp;
            tmp = tmp.next;
        }

        // Chegando ao final da lista, o novo valor de tail é o que esta armazenado em prev
        tail = prev;

        // Já next deve ser setado como null
        tail.next = null;
        length--;

        if(length == 0){
            head = null;
            tail = null;
        }

        return tmp;
    }

}
