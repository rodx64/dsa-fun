package algorithms.searching.BreadthFirstSearch;

import data_structure.implementation._BinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends _BinarySearchTree {

    public ArrayList<Integer> run() {
        _BinarySearchTree.Node currentNode = root;
        Queue<_BinarySearchTree.Node> linkedList = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        linkedList.add(currentNode);

        while (!linkedList.isEmpty()) {
            currentNode = linkedList.remove();
            result.add(currentNode.getValue());

            if (currentNode.getLeft() != null) {
                linkedList.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                linkedList.add(currentNode.getRight());
            }
        }

        return result;
    }

}
