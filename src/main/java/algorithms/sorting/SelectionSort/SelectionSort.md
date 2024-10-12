
# Selection Sort

Selection Sort is a straightforward comparison-based sorting algorithm that divides the list into a sorted and an unsorted part.
It repeatedly finds the minimum element from the unsorted part and swaps it with the first unsorted element,
gradually expanding the sorted portion of the list.

The name "Selection Sort" comes from the way it selects the smallest (or largest, depending on sorting order) element in each pass
and places it in its correct position.

## Summary of Selection Sort Steps

### Worst Case:

**O(n²)** steps

### Average Case:

**O(n²)** steps

### Best Case:

**O(n²)** steps (since it always iterates through unsorted elements, even if the list is partially sorted)

--- 

## Selection Sort Algorithm Visualization

**Initial Array**: `[5, 3, 8, 4, 2]`

### Pass 1

- Find the minimum in `[5, 3, 8, 4, 2]` → Minimum is `2`
- Swap `2` with the first element `5` → `[2, 3, 8, 4, 5]`

**Array after Pass 1**: `[2, 3, 8, 4, 5]`

### Pass 2

- Find the minimum in `[3, 8, 4, 5]` → Minimum is `3`
- `3` is already in the correct position → `[2, 3, 8, 4, 5]`

**Array after Pass 2**: `[2, 3, 8, 4, 5]`

### Pass 3

- Find the minimum in `[8, 4, 5]` → Minimum is `4`
- Swap `4` with `8` → `[2, 3, 4, 8, 5]`

**Array after Pass 3**: `[2, 3, 4, 8, 5]`

### Pass 4

- Find the minimum in `[8, 5]` → Minimum is `5`
- Swap `5` with `8` → `[2, 3, 4, 5, 8]`

**Array after Pass 4**: `[2, 3, 4, 5, 8]`

**Final Sorted Array**: `[2, 3, 4, 5, 8]`
