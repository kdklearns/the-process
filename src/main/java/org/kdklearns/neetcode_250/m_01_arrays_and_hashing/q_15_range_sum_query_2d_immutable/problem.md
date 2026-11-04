# Range Sum Query 2D - Immutable

Given a two-dimensional integer matrix `matrix`, support repeated queries that sum a rectangular region. Each rectangle includes its boundaries, from the upper-left cell `(row1, col1)` through the lower-right cell `(row2, col2)`.

Implement the `NumMatrix` class:

- `NumMatrix(int[][] matrix)`: Constructs the object using `matrix`.
- `int sumRegion(int row1, int col1, int row2, int col2)`: Returns the sum within the specified rectangle.

Each `sumRegion` query must take `O(1)` time.

## Example 1

![Matrix query regions](https://assets.leetcode.com/uploads/2021/03/14/sum-grid.jpg)

```text
Input:
["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
[[[[3,0,1,4,2],[5,6,3,2,1],[1,2,0,1,5],[4,1,0,1,7],[1,0,3,0,5]]], [2,1,4,3], [1,1,2,2], [1,2,2,4]]

Output:
[null,8,11,12]
```

Explanation:

```java
NumMatrix numMatrix = new NumMatrix(new int[][] {
    {3,0,1,4,2},
    {5,6,3,2,1},
    {1,2,0,1,5},
    {4,1,0,1,7},
    {1,0,3,0,5}
});

numMatrix.sumRegion(2, 1, 4, 3); // returns 8: red rectangle
numMatrix.sumRegion(1, 1, 2, 2); // returns 11: green rectangle
numMatrix.sumRegion(1, 2, 2, 4); // returns 12: blue rectangle
```

## Constraints

- `m == matrix.length`
- `n == matrix[i].length`
- `1 <= m, n <= 200`
- `-10⁴ <= matrix[i][j] <= 10⁴`
- `0 <= row1 <= row2 < m`
- `0 <= col1 <= col2 < n`
- The number of `sumRegion` calls does not exceed `10⁴`.