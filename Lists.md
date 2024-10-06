# Lists

### ArrayList vs LinkedList

| Feature                | ArrayList                                                                        | LinkedList                                                                          |
|------------------------|----------------------------------------------------------------------------------|-------------------------------------------------------------------------------------|
| **Underlying Data Structure** | Dynamic array                                                                    | Doubly linked list                                                                  |
| **Access Time**        | ⭐ O(1) for access (by index)                                                     | O(n) for access                                                                     |
| **Insertion Time**     | O(n) in the worst case (due to resizing and shifting elements)                   | ⭐ O(1) for adding at the beginning or end;  <br/>O(n) for adding in the middle      |
| **Deletion Time**      | O(n) in the worst case (due to shifting elements)                                | ⭐ O(1) for removing from the beginning or end; <br/>O(n) for removing in the middle |
| **Memory Usage**       | ⭐ More memory efficient (less overhead per element)                              | Less memory efficient (more overhead per element due to storing pointers)           |
| **Iteration Performance** | ⭐ Faster iteration performance due to better cache locality                      | Slower iteration performance due to poor cache locality                             |
| **Use Case**           | Best for scenarios with frequent read operations and infrequent insertions/deletions | Best for scenarios with frequent insertions/deletions and infrequent random access  |


## ArrayList
**Data Structure**: Dynamic Array

### Pros:
- **Fast Access**: Provides O(1) time complexity for accessing elements by index, making it efficient for random access.
- **Low Memory Overhead**: Uses a contiguous block of memory, leading to lower memory consumption compared to linked structures.
- **Good Cache Performance**: Benefits from better cache locality due to contiguous storage, improving performance during iteration.

### Cons:
- **Insertion/Deletion Costs**: Inserting or deleting elements (especially in the middle) is O(n) due to the need to shift elements.
- **Resize Overhead**: When the underlying array needs to be resized, it requires O(n) time to copy the elements to a new array.
- **Inefficient for Frequent Additions/Removals**: Not ideal for scenarios where frequent additions and removals occur, especially at arbitrary positions.

---

## LinkedList
**Data Structure**: Doubly Linked List

### Pros:
- **Fast Insertions/Deletions**: O(1) time complexity for adding or removing elements at the head or tail, making it efficient for such operations.
- **Dynamic Size**: Can easily grow and shrink in size without the need for resizing like an array.
- **No Contiguous Memory Requirement**: Nodes can be allocated anywhere in memory, making it flexible with memory usage.

### Cons:
- **Slow Access Time**: O(n) time complexity for accessing elements by index, as it requires traversing the list from the head or tail.
- **Higher Memory Overhead**: Each element requires additional memory for storing pointers (references) to the next and previous nodes, leading to increased memory usage.
- **Poor Cache Performance**: Non-contiguous storage can lead to more cache misses during iteration.
