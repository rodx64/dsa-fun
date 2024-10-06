### # BINARY SEARCH TREE

| Feature                        | Binary Search Tree     |
|--------------------------------|------------------------|
| **Implementation**             | Node-based             |
| **Order of Elements**          | Sorted order           |
| **Time Complexity (insert)**   | O(log n) ⭐             |
| **Time Complexity (delete)**   | O(log n) ⭐             |
| **Time Complexity (search)**   | O(log n) ⭐             |
| **Null Elements**              | Not allowed            |
| **Iteration Performance**      | Moderate               |
| **Memory Overhead**            | Moderate               |

## Binary Search Tree

**Data Structure**: Node-based

### Pros:

- **Efficient Searching**: Provides O(log n) time complexity for search operations in a balanced tree.
- **Sorted Order**: Maintains elements in a sorted order, which is useful for ordered traversal.
- **Dynamic Size**: Can grow and shrink dynamically as elements are added or removed.

### Cons:

- **Balancing Required**: Performance can degrade to O(n) if the tree becomes unbalanced.
- **No Null Elements**: Does not allow null elements.
- **Memory Overhead**: Requires additional memory for storing pointers to child nodes.
