# MAPS

| Feature                  | HashMap               | TreeMap                | LinkedHashMap          |
|--------------------------|-----------------------|------------------------|------------------------|
| **Implementation**       | Hash Table            | Red-Black Tree         | Hash Table + Linked List |
| **Order of Elements**    | No order              | Sorted by keys         | Insertion order        |
| **Time Complexity (get)**| O(1) ⭐                | O(log n)               | O(1) ⭐                 |
| **Time Complexity (put)**| O(1) ⭐                | O(log n)               | O(1) ⭐                 |
| **Time Complexity (remove)**| O(1) ⭐            | O(log n)               | O(1) ⭐                 |
| **Null Keys**            | 1 null key allowed    | No null keys allowed   | 1 null key allowed     |
| **Null Values**          | Multiple null values allowed | Multiple null values allowed | Multiple null values allowed |
| **Iteration Performance**| Fast ⭐               | Slow                   | Moderate               |
| **Memory Overhead**      | Low ⭐                | High                   | Moderate               |


## HashMap
**Data Structure**: Hash Table + Linked List (for handling collisions)

### Pros:
- **Fast Access**: Provides average O(1) time complexity for adding, retrieving, and removing elements due to its use of a hash table.
- **Allows Null Values**: Can store one null key and multiple null values.
- **Non-Ordered**: Does not maintain any order of its elements, which can be beneficial if order is not required.

### Cons:
- **Unordered**: The order of elements is not predictable, which may not be suitable for certain applications that require ordering.
- **Memory Overhead**: Requires extra memory for storing hash codes and the array of buckets.
- **Collisions**: If many keys hash to the same bucket, performance can degrade to O(n) in the worst case, although this is rare with a good hash function.

---

## TreeMap
**Data Structure**: Red-Black Tree

### Pros:
- **Sorted Order**: Automatically sorts the keys in their natural order (or by a specified comparator), making it suitable for ordered data retrieval.
- **NavigableMap Interface**: Implements additional methods for navigation (e.g., `firstKey()`, `lastKey()`, `lowerKey()`, `higherKey()`).
- **O(log n) Time Complexity**: Guarantees O(log n) time complexity for basic operations (add, remove, retrieve) due to its underlying Red-Black tree structure.

### Cons:
- **Slower Access**: Slower than `HashMap` for basic operations (O(log n) vs. O(1)), making it less efficient for quick lookups.
- **No Null Keys**: Does not allow null keys; only null values are permitted.
- **Higher Memory Overhead**: More memory is required to maintain tree structure and links between nodes.

---

## LinkedHashMap
**Data Structure**: Hash Table + Doubly Linked List

### Pros:
- **Maintains Insertion Order**: Preserves the order of insertion, allowing for predictable iteration order.
- **Fast Access**: Provides average O(1) time complexity for basic operations like `put()`, `get()`, and `remove()`, similar to `HashMap`.
- **Iterates in Insertion Order**: The order of elements is predictable when iterating through the map.

### Cons:
- **Memory Overhead**: Requires more memory than `HashMap` due to the need to maintain a doubly-linked list alongside the hash table.
- **Unsorted**: Does not sort keys like `TreeMap`; it only maintains the order of insertion.
- **Slightly Slower**: Performance can be slightly slower than `HashMap` due to the overhead of maintaining the linked list, although it is still fast.
