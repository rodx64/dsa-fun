package setup.dataStructures.tree;


import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class _BinarySearchTree {

    /**
     *  Details:
     *  + Tree Basics
     *     -   Full Tree -> Every node points to zero or two other nodes
     *     -   Perfect Tree -> All tree nodes are filled
     *     -   Complete Tree -> Fills the Tree from Left to Right with no gaps
     *     -   All Trees have only one Parent
     *
     *  + Binary Search
     *     -  From parent to child, the value on the left is the smallest and the value on the right is the largest.
     */

    Node root;

    public boolean insert(int i) {
        Node newNode = new Node(i);

        if(root == null){
            root = newNode;
            return true;
        }

        Node temp = root;

        while(true){
            if(newNode.value == temp.value) return false; // avoiding duplicity

            if(newNode.value < temp.value){
                if(temp.left == null){ // if the spot is open, put newNode there
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left; // else, the spot value is the new temp value
            }
            else {
                if(temp.right == null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }



    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
        }
    }

}
