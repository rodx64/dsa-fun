# Breadth-First Search (BFS)
is an algorithm used for traversing or searching tree and graph data structures. Unlike DFS, which explores as deep as possible along each branch before backtracking, BFS explores all nodes at the current depth level before moving on to the nodes at the next depth level. This results in a level-by-level exploration.

In a BFS traversal, we start at the root node and visit each node level-by-level, moving from left to right.

### Explaining Traversal Methods using the following binary tree example:

         47
       /    \
      21     76
     /  \   /   \
    18  27 52   82

1. Breadth-First Search: Visit Level-by-Level
    - In Breadth-First Search, we
        - start from the root node,
        - then visit all nodes at the current level,
        - followed by the nodes at the next level.
    - BFS Steps:
        - Start at the root 47
        - Move to the left child 21 and right child 76
        - Move to the next level: visit 18 (left child of 21), 27 (right child of 21), 52 (left child of 76), and 82 (right child of 76)
    - BFS Result: 47, 21, 76, 18, 27, 52, 82
 
                 47¹
               /    \
             21²     76³
            /  \    /  \
          18⁴  27⁵ 52⁶  82⁷
