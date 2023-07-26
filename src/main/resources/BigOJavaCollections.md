# Big O Complexity 
### Best < Worst
#### O(1)  <  O(log n)  <  O(n)  <  O(n log n)  <  O(n^2)  <  O(2^n)  <  O(n!)


# Most common Collections

## LISTS: Big O and local tests (μ - microseconds)

List                 | Add  | Remove                            | Get  | Contains | Next | Data Structure | Advantage
---------------------|------|-----------------------------------|------|----------|------|---------------|-----------
ArrayList            | O(1) | O(n)                              | O(1) |   O(n)   | O(1) | Array | Add + Get
LinkedList           | O(1) | O(1) obs: _already found element_ | O(n) |   O(n)   | O(1) | Linked List | Add + Remove
CopyOnWriteArrayList  | O(n) | O(n)                              | O(1) |   O(n)   | O(1) | Array | Thread-safe

### ADD #
- **ArrayList**:  7783 μs
- LinkedList: 19133 μs
- CopyOnWriteArrayList: 2007195 μs

### REMOVE #
- ArrayList:  39 μs
- **LinkedList**: 4 μs (using the object or Iterator)
- CopyOnWriteArrayList: 45 μs

### GET #
- ArrayList:  383 μs
- LinkedList: 98472 μs
- **CopyOnWriteArrayList**: 60 μs

### CONTAINS #

### NEXT #


## SETS: Big O and local tests (μ - microseconds)

Set                   |    Add   | Remove    | Contains  | Next      | Size | Data Structure | Advantage
----------------------|----------|-----------|-----------|-----------|------|----------------|----------
HashSet               | O(1) | O(1)  | O(1)  | O(h/n)    | O(1) | Hash Table | Performance
TreeSet               | O(log n) | O(log n)  | O(log n)  | O(log n)  | O(1) | Red-black tree | Natural Sort
LinkedHashSet         | O(1) | O(1)  | O(1)  | O(1)  | O(1) | Hash Table + Linked List | Performance + Sort 

## MAPS: Big O and local tests (μ - microseconds)

Map                   |   Get    | ContainsKey |   Next   | Data Structure| Advantage
----------------------|----------|-------------|----------|-------------------------|----------
HashMap               | O(1)     |   O(1)      | O(h/n)   | Hash Table | One key null
TreeMap               | O(log n) |   O(log n)  | O(log n) | Red-black tree | Natural Sort 
LinkedHashMap         | O(1)     |   O(1)      | O(1)     | Hash Table + Linked List | Performance + Sort + One key null


## QUEUES: Big O and local tests (μ - microseconds)

Queue                   |  Offer   | Peek |   Poll   | Remove | Size | Data Structure| Advantage
------------------------|----------|------|----------|--------|------|---------------|-----------
ArrayDeque              | O(1)     | O(1) | O(1)     |  O(n)  | O(1) | Linked List| Resizable
PriorityQueue           | O(log n) | O(1) | O(log n) |  O(n)  | O(1) | Priority Heap| Priority + Sorted


## Pros and Cons
Types                   | Pros                 | Cons      | Ref |
------------------------|----------------------|-----------|-----|
HashTables              | Big O(1) and Secure | Collision | https://en.wikipedia.org/wiki/Hash_collision|
