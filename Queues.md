### # QUEUES

| Feature                        | ArrayDeque             | PriorityQueue            |
|--------------------------------|------------------------|--------------------------|
| **Implementation**             | Resizable Array        | Binary Heap              |
| **Order of Elements**          | Insertion order        | Priority order           |
| **Time Complexity (add)**      | O(1) ⭐                 | O(log n)                 |
| **Time Complexity (remove)**   | O(1) ⭐                 | O(log n)                 |
| **Time Complexity (contains)** | O(n)                   | O(n)                     |
| **Null Elements**              | Not allowed            | Not allowed              |
| **Iteration Performance**      | Fast ⭐                 | Moderate                 |
| **Memory Overhead**            | Low ⭐                  | Moderate                 |

## ArrayDeque

**Data Structure**: Resizable Array

### Pros:

- **Fast Access**: Provides O(1) time complexity for adding and removing elements at both ends.
- **No Capacity Restrictions**: Automatically resizes as needed.
- **Double-Ended**: Can be used as both a stack and a queue.

### Cons:

- **No Null Elements**: Does not allow null elements.
- **Linear Search**: Contains operation is O(n), which can be slow for large deques.
- **Memory Overhead**: May require resizing, which can temporarily use more memory.

## PriorityQueue

**Data Structure**: Binary Heap

### Pros:

- **Priority-Based Ordering**: Elements are ordered based on their priority, not their insertion order.
- **Efficient Access**: Provides O(log n) time complexity for insertion and removal.
- **Flexible Priority**: Can be customized with a comparator for different priority schemes.

### Cons:

- **No Null Elements**: Does not allow null elements.
- **Linear Search**: Contains operation is O(n), which can be slow for large queues.
- **Memory Overhead**: Requires additional memory for maintaining the heap structure.
