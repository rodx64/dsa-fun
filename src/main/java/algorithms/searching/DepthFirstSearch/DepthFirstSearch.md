# Depth-First Search (DFS)

is an algorithm used to traverse or search tree and graph data structures. 

In DFS, the algorithm starts at the root node
and explores as far as possible along each branch before backtracking. 

This search approach is ideal for exploring all
possible paths in a structure, as it fully explores each branch before moving to the next one.

In DFS, the traversal can be divided into three types based on the order of visiting nodes:

- Pre-order Traversal
- In-order Traversal
- Post-order Traversal

### Explaining Traversal Methods using the following binary tree example:

         47
       /    \
      21     76
     /  \   /  \
    18  27 52   82

1. **Pre-order Traversal**: Visit **Root** ➔ **Left** ➔ **Right**
    - In Pre-order traversal we 
      - start from the root node, 
      - then recursively visit each left subtree, 
      - followed by each right subtree.
    - **Pre-Order Steps**:
        1. Start at root **47**
        2. Move to left child **21**
        3. Move to left child of **21**, which is **18**
        4. Move to right child of **21**, which is **27**
        5. Back to root **47** and move to right child **76**
        6. Move to left child of **76**, which is **52**
        7. Move to right child of **76**, which is **82**
    - **Pre-order Result**: `47, 21, 18, 27, 76, 52, 82`

                 47¹
               /    \
             21²     76⁵
            /  \    /  \
          18³  27⁴ 52⁶ 82⁷

2. **In-order Traversal**: Visit **Left** ➔ **Root** ➔ **Right**
    - In **In-order** traversal, we 
      - recursively visit each left subtree first, 
      - then the root node, 
      - and finally each right subtree.
    - **In-order Steps**:
        1. Start at leftmost node **18**
        2. Visit root of **18**’s subtree, **21**
        3. Move to right child of **21**, which is **27**
        4. Visit the root **47**
        5. Move to left child of **76**, which is **52**
        6. Visit root of **52**’s subtree, **76**
        7. Move to right child of **76**, which is **82**
    - **In-order Result**: `18, 21, 27, 47, 52, 76, 82`

                47⁴
              /     \
             21²     76⁶
            /  \    /  \
          18¹  27³ 52⁵ 82⁷

3. **Post-order Traversal**: Visit **Left** ➔ **Right** ➔ **Root**
    - In Post-order traversal, we 
      - recursively visit each left subtree, 
      - then each right subtree, 
      - and finally the root node.
    - **Traversal Steps**:
        1. Start with the left child **18**
        2. Move to right child of **21**, which is **27**
        3. Visit root of **21**’s subtree, **21**
        4. Move to left child of **76**, which is **52**
        5. Move to right child of **76**, which is **82**
        6. Visit root of **76**’s subtree, **76**
        7. Finally, visit the root **47**
    - **Post-order Result**: `18, 27, 21, 52, 82, 76, 47`

                 47⁷
               /    \
             21³     76⁶
            /  \    /  \
          18¹  27² 52⁴  82⁵

### Implementing DFS

Follow the implementation of the 3 modes [here](DepthFirstSearch.java)

### Testing DFS

For the given tree, the DFS
traversal [results](../../../../../../src/test/java/algorithms/searching/DepthFirstSearchTest.java):

- **Pre-order** : `47, 21, 18, 27, 76, 52, 82`
- **In-order**  : `18, 21, 27, 47, 52, 76, 82`
- **Post-order**: `18, 27, 21, 52, 82, 76, 47`

### Summary of Traversal Outputs

Each of these traversal methods has specific use cases:

- **Pre-order** is useful for creating a copy of the tree or getting a prefix expression in the case of an expression
  tree.
- **In-order** is often used to retrieve nodes in a sorted sequence (ascending order).
- **Post-order** is useful when deleting or freeing nodes in a tree, as it ensures each child node is processed before
  the parent node.
