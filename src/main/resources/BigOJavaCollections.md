# Big O Complexity 
### Best < Worst
#### O(1)  <  O(log n)  <  O(n)  <  O(n log n)  <  O(n^2)  <  O(2^n)  <  O(n!)


# Most common Collections

## LISTS

List                 | Append | Prepend   | Insert | Remove First   | Remove Last | Remove | Look by Value | Look by index | Data Structure 
---------------------|--------|-----------|--------|----------------|-------------|--------|---------------|---------------|----------------
ArrayList            | O(1)   | O(n)      | O(n)   | O(n)           | **O(1)**    | O(n)   | O(n)          | **O(1)**      | Array          
LinkedList           | O(1)   | **O(1)**  | O(n)   | **O(1)**       | O(n)        | O(n)   | O(n)          | O(n)          | Linked List 

## MAPS
Map                   | Get       | Contains  | Remove    | Data Structure| Advantage
----------------------|-----------|--------------|-----------|-------------------------|----------
HashMap               | O(1)      | O(1)         | O(1)      | Hash Table | Permits null Key and Value 
TreeMap               | O(log n)  | O(log n)     | O(log n)  | Red-black tree | Natural Order +  Permits null Value (only if key ordered)
LinkedHashMap         | **O(1)**  | **O(1)**     | **O(1)**  | Hash Table + Linked List | Permits null Key and Value + Order


## SETS
Set                   | Add      | Remove   | Contains | Next      | Data Structure           | Advantage
----------------------|----------|----------|----------|-----------|--------------------------|----------
HashSet               | O(1)     | O(1)     | O(1)     | O(h/n)    | Hash Table               | Performance
TreeSet               | O(log n) | O(log n) | O(log n) | O(log n)  | Red-black tree           | Natural Sort
LinkedHashSet         | **O(1)**     | O(1)     | **O(1)**     | **O(1)**  | Hash Table + Linked List | Performance + Sort 


## QUEUES
Queue                   |  Offer   | Peek |   Poll   | Remove | Data Structure| Advantage
------------------------|----------|------|----------|--------|---------------|-----------
ArrayDeque              | O(1)     | O(1) | O(1)     |  O(n)  | Linked List| Resizable
PriorityQueue           | O(log n) | O(1) | O(log n) |  O(n)  | Priority Heap| Priority + Sorted


## Pros and Cons
Types                   | Pros                 | Cons      | Ref |
------------------------|----------------------|-----------|-----|
HashTables              | Big O(1) and Secure | Collision | https://en.wikipedia.org/wiki/Hash_collision|
