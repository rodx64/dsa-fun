# Bubble Sort

is a simple comparison-based sorting algorithm that repeatedly steps through a list, compares adjacent elements, and
swaps them if they are in the wrong order. This process is repeated until the list is sorted.

It is named "Bubble Sort" because the smaller elements gradually "bubble" to the top of the list (or the beginning in
ascending order), much like bubbles rising in water.

## Summary of Bubble Sort Steps

### Worst Case:

**O(n²)** steps

### Average Case:

**O(n²)** steps

### Best Case:

**O(n)** steps (if the list is already sorted)

--- 
## Bubble Sort Algorithm Visualization

**Initial Array**: `[5, 3, 8, 4, 2]`

### Pass 1

- Compare `[5, 3]`: Swap → `[3, 5, 8, 4, 2]`
- Compare `[5, 8]`: No swap → `[3, 5, 8, 4, 2]`
- Compare `[8, 4]`: Swap → `[3, 5, 4, 8, 2]`
- Compare `[8, 2]`: Swap → `[3, 5, 4, 2, 8]`

**Array after Pass 1**: `[3, 5, 4, 2, 8]`

### Pass 2

- Compare `[3, 5]`: No swap → `[3, 5, 4, 2, 8]`
- Compare `[5, 4]`: Swap → `[3, 4, 5, 2, 8]`
- Compare `[5, 2]`: Swap → `[3, 4, 2, 5, 8]`

**Array after Pass 2**: `[3, 4, 2, 5, 8]`

### Pass 3

- Compare `[3, 4]`: No swap → `[3, 4, 2, 5, 8]`
- Compare `[4, 2]`: Swap → `[3, 2, 4, 5, 8]`

**Array after Pass 3**: `[3, 2, 4, 5, 8]`

### Pass 4

- Compare `[3, 2]`: Swap → `[2, 3, 4, 5, 8]`

**Array after Pass 4**: `[2, 3, 4, 5, 8]`

**Final Sorted Array**: `[2, 3, 4, 5, 8]`

