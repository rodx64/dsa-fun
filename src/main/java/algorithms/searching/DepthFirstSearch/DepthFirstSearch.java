package algorithms.searching.DepthFirstSearch;

import data_structure.implementation._BinarySearchTree;

import java.util.ArrayList;

public class DepthFirstSearch extends _BinarySearchTree {

    /**
     * In Pre-order traversal,
     * 1. we start from the root node,
     * 2. then recursively visit each left subtree,
     * 3. followed by each right subtree.
     */
    public ArrayList<Integer> runPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                // start from the root node
                results.add(currentNode.getValue());

                // visit each left subtree
                if (currentNode.getLeft() != null) {
                    new Traverse(currentNode.getLeft());
                }

                // visit right left subtree
                if (currentNode.getRight() != null) {
                    new Traverse(currentNode.getRight());
                }
            }
        }

        new Traverse(root);
        return results;
    }

    /**
     * In In-order traversal,
     * 1. we recursively visit each left subtree first,
     * 2. then the root node,
     * 3. and finally each right subtree.
     */
    public ArrayList<Integer> runInOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                // visit each left subtree first
                if (currentNode.getLeft() != null) {
                    new Traverse(currentNode.getLeft());
                }

                // then the root node
                results.add(currentNode.getValue());

                // and finally each right subtree
                if (currentNode.getRight() != null) {
                    new Traverse(currentNode.getRight());
                }
            }
        }

        new Traverse(root);
        return results;
    }


    /**
     * In Post-order traversal,
     * 1. we recursively visit each left subtree,
     * 2. then each right subtree,
     * 3. and finally the root node.
     */
    public ArrayList<Integer> runPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse {
            Traverse(Node currentNode) {
                // visit each left subtree first
                if (currentNode.getLeft() != null) {
                    new Traverse(currentNode.getLeft());
                }

                // then each right subtree
                if (currentNode.getRight() != null) {
                    new Traverse(currentNode.getRight());
                }

                // and finally the root node
                results.add(currentNode.getValue());
            }
        }

        new Traverse(root);
        return results;
    }

}
