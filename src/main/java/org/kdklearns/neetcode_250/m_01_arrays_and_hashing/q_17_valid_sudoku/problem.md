# Valid Sudoku

Check whether a partially filled `9 × 9` Sudoku board is valid. Evaluate the occupied cells using these rules:

1. A row cannot contain a repeated digit.
2. A column cannot contain a repeated digit.
3. None of the nine `3 × 3` boxes can contain a repeated digit.

Only digits from `1` through `9` may occupy cells.

**Note:**

- Passing these checks does not guarantee that the board has a solution.
- Ignore empty cells when checking validity.

## Example 1

![Sudoku board](https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png)

```text
Input: board = [
  ["5","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: true
```

## Example 2

```text
Input: board = [
  ["8","3",".",".","7",".",".",".","."],
  ["6",".",".","1","9","5",".",".","."],
  [".","9","8",".",".",".",".","6","."],
  ["8",".",".",".","6",".",".",".","3"],
  ["4",".",".","8",".","3",".",".","1"],
  ["7",".",".",".","2",".",".",".","6"],
  [".","6",".",".",".",".","2","8","."],
  [".",".",".","4","1","9",".",".","5"],
  [".",".",".",".","8",".",".","7","9"]
]
Output: false
```

Explanation: Changing the upper-left cell from `5` to `8` creates two occurrences of `8` in the upper-left `3 × 3` box, making the board invalid.

## Constraints

- `board.length == 9`
- `board[i].length == 9`
- Every cell contains a character from `'1'` through `'9'`, or `'.'` for an empty cell.