# SETS

| Feature                        | HashSet                | TreeSet                  | LinkedHashSet            |
|--------------------------------|------------------------|--------------------------|--------------------------|
| **Implementation**             | Hash Table             | Red-Black Tree           | Hash Table + Linked List |
| **Order of Elements**          | No order               | Sorted by elements       | Insertion order          |
| **Time Complexity (add)**      | O(1) ⭐                 | O(log n)                 | O(1) ⭐                   |
| **Time Complexity (remove)**   | O(1) ⭐                 | O(log n)                 | O(1) ⭐                   |
| **Time Complexity (contains)** | O(1) ⭐                 | O(log n)                 | O(1) ⭐                   |
| **Null Elements**              | 1 null element allowed | No null elements allowed | 1 null element allowed   |
| **Iteration Performance**      | Fast ⭐                 | Slow                     | Moderate                 |
| **Memory Overhead**            | Low ⭐                  | High                     | Moderate                 |

## HashSet

**Data Structure**: Hash Table

### Pros:

- **Fast Access**: Provides average O(1) time complexity for adding, retrieving, and removing elements due to its use of
  a hash table.
- **Allows Null Elements**: Can store one null element.
- **Non-Ordered**: Does not maintain any order of its elements, which can be beneficial if order is not required.

### Cons:

- **Unordered**: The order of elements is not predictable, which may not be suitable for certain applications that
  require ordering.
- **Memory Overhead**: Requires extra memory for storing hash codes and the array of buckets.
- **Collisions**: If many elements hash to the same bucket, performance can degrade to O(n) in the worst case, although
  this is rare with a good hash function.

## TreeSet

**Data Structure**: Red-Black Tree
### Pros:

- **Sorted Order**: Maintains elements in a sorted order, which can be useful for applications that require sorted data.
- **NavigableSet Interface**: Provides methods to navigate through the set (e.g., first(), last(), headSet(), tailSet()).

### Cons:

- **Slower Access**: Provides O(log n) time complexity for basic operations, which is slower compared to HashSet.
- **No Null Elements**: Does not allow null elements.
- **Memory Overhead**: Higher memory overhead due to the tree structure.

## LinkedHashSet

**Data Structure**: Hash Table + Linked List
### Pros:

- **Insertion Order**: Maintains the insertion order of elements, which can be useful for certain applications like caching.
- **Fast Access**: Provides average O(1) time complexity for adding, retrieving, and removing elements due to its use of a hash table.
- **Allows Null Elements**: Can store one null element.

### Cons:

- **Memory Overhead**: Requires extra memory for maintaining the linked list in addition to the hash table.
- **Moderate Iteration Performance**: Iteration performance is not as fast as HashSet but better than TreeSe