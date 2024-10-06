package algorithms.recursion;

public class RecursiveBinarySearchThree {
    private Node root;

    public boolean rContains(int value) {
        if (root == null) return false;
        return rContains(root, value);
    }

    public boolean rContains(Node currentNode, int value) {
        if (currentNode == null) return false;
        if (currentNode.value == value) return true;

        if (value < currentNode.value) {
            return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }

    public void insert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value)
            currentNode.left = rInsert(currentNode.left, value);
        else if (value > currentNode.value)
            currentNode.right = rInsert(currentNode.right, value);

        return currentNode;
    }

    public void delete(int value) {
        root = deleteNode(root, value);
    }

    private Node deleteNode(Node currentNode, int value) {
        if (currentNode == null) return null;

        if (value < currentNode.value) { // down to the left
            currentNode.left = deleteNode(currentNode.left, value);

        } else if (value > currentNode.value) { // down to the right
            currentNode.right = deleteNode(currentNode.right, value);

        } else { // the node to be deleted

            if (currentNode.left == null && currentNode.right == null) { // the left and right nodes are null
                return null;

            } else if (currentNode.left == null) {  // only the left node is null
                currentNode = currentNode.right;

            } else if (currentNode.right == null) { // only the right node is null
                currentNode = currentNode.left;

            } else { // the left and right nodes exists

                // finding the lowest value node in the subtree, but looking the biggest existent side (the right one)
                int minSubtreeValue = minTreeValue(currentNode.right);
                currentNode.value = minSubtreeValue;
                currentNode.right = deleteNode(currentNode.right, minSubtreeValue);
            }
        }

        return currentNode;
    }

    public int minTreeValue(Node currentNode) {
        // we go down to the left to find the lowest level of the tree
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}

