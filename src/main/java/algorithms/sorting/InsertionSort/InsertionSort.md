# Insertion Sort

Insertion Sort is a simple, comparison-based sorting algorithm that builds the sorted list one element at a time by repeatedly taking the next element and inserting it into its correct position within the already sorted part of the list. This approach makes Insertion Sort efficient for small or nearly sorted data but slower for large lists.

The name "Insertion Sort" reflects its process of inserting each new element into its appropriate place in the sorted section.

## Summary of Insertion Sort Steps

- **Worst Case:** O(n²) steps (occurs when the list is in reverse order and every new element has to shift past all previous sorted elements)

- **Average Case:** O(n²) steps

- **Best Case:** O(n) steps (occurs when the list is already sorted, as only one comparison is needed per element)

---
### Insertion Sort Algorithm Visualization

**Initial Array:** [5, 3, 8, 4, 2]

#### Pass 1

Take the second element 3 and compare it with 5 in the sorted portion.

Since 3 < 5, shift 5 one position to the right and place 3 in the first position.

**Array after Pass 1:** [3, 5, 8, 4, 2]



#### Pass 2

Take the third element 8 and compare it with 5. No shift is needed as 8 > 5.

**Array after Pass 2:** [3, 5, 8, 4, 2]



#### Pass 3

Take the fourth element 4 and insert it into the correct position in [3, 5, 8].

- Compare 4 with 8 (shift 8 to the right).

- Compare 4 with 5 (shift 5 to the right).

Place 4 in the second position.

**Array after Pass 3:** [3, 4, 5, 8, 2]



#### Pass 4

Take the fifth element 2 and insert it into the correct position in [3, 4, 5, 8].

- Compare 2 with 8 (shift 8 to the right).

- Compare 2 with 5 (shift 5 to the right).

- Compare 2 with 4 (shift 4 to the right).

- Compare 2 with 3 (shift 3 to the right).

Place 2 in the first position.

**Array after Pass 4:** [2, 3, 4, 5, 8]



### Final Sorted Array: [2, 3, 4, 5, 8]
