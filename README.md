# Data Structures and Algorithms

The aim of this module is to test data structures, the big O and ways of storing and retrieving data

## 1. BIG O

- ### Complexity (Best < Worst)

`O(1)  <  O(log n)  <  O(n)  <  O(n log n)  <  O(n^2)  <  O(2^n)  <  O(n!)`

- ### Rules
    - [1 - Worst Case](src/main/java/bigO/rules/Rule1_WorstCase.java)
    - [2 - Drop Constant](src/main/java/bigO/rules/Rule2_DropConstant.java)
    - [3 - Different Terms](src/main/java/bigO/rules/Rule3_DifferentTerms.java)
    - [4 - Drop Non Dominants](src/main/java/bigO/rules/Rule4_DropNonDominants.java)

- ### Most common Collections Comparisons

    1. [LISTS](Lists.md)
    2. [MAPS](Maps.md)
    3. [SETS](Sets.md)
    4. [QUEUES](Queues.md)
    5. [TREES](Trees.md)

- ### My Implemented Collections
    - [ArrayList](src/main/java/data_structure/implementation/_ArrayList.java)
    - [LinkedList](src/main/java/data_structure/implementation/_LinkedList.java)
    - [Graph](src/main/java/data_structure/implementation/_Graph.java)
    - [HashTable](src/main/java/data_structure/implementation/_HashTable.java)
    - [Queue](src/main/java/data_structure/implementation/_Queue.java)
    - [Stack](src/main/java/data_structure/implementation/_Stack.java)
    - [Binary Search Tree](src/main/java/data_structure/implementation/_BinarySearchTree.java)

## 2. Recursion, Searching and Sorting Algorithms

- ### Recursion
    1. Basic
        - [Basic Recursion](src/main/java/algorithms/recursion/BasicRecursion.java)
    2. Recursion with Binary Search Tree
        - [BST Recursion](src/main/java/algorithms/recursion/RecursiveBinarySearchThree.java)

- ### Searching
    1. Depth First Search (DFS)
        - [Implementation](src/main/java/algorithms/searching/DepthFirstSearch/DepthFirstSearch.java)
        - [Doc](src/main/java/algorithms/searching/DepthFirstSearch/DepthFirstSearch.md)

    2. Breadth First Search (BFS)
        - [Implementation](src/main/java/algorithms/searching/BreadthFirstSearch/BreadthFirstSearch.java)
        - [Doc](src/main/java/algorithms/searching/DepthFirstSearch/DepthFirstSearch.md)

- ### Sorting
    1. Bubble Sort
        - [Implementation](src/main/java/algorithms/sorting/BubbleSort/BubbleSort.java)
        - [Doc](src/main/java/algorithms/sorting/BubbleSort/BubbleSort.md)
    2. Selection Sort
        - [Implementation](src/main/java/algorithms/sorting/SelectionSort/SelectionSort.java)
        - [Doc](src/main/java/algorithms/sorting/SelectionSort/SelectionSort.md)
    3. Insertion Sort
        - [Implementation](src/main/java/algorithms/sorting/InsertionSort/InsertionSort.java)
        - [Doc](src/main/java/algorithms/sorting/InsertionSort/InsertionSort.md)
