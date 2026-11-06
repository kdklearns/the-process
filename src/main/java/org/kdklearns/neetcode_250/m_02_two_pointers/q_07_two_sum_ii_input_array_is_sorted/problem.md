# Two Sum II - Input Array Is Sorted

The integer array `numbers` is sorted in non-decreasing order and uses **1-based indexing**.

Find two distinct positions whose values sum to `target`. Return their indices as `[index1, index2]`, with:

- `numbers[index1] + numbers[index2] == target`
- `1 <= index1 < index2 <= numbers.length`

Exactly one valid pair exists. Each array element can be used only once.

Use `O(1)` additional space.

## Example 1

```text
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
```

Explanation: Positions `1` and `2` contain `2` and `7`, giving `2 + 7 = 9`.

## Example 2

```text
Input: numbers = [2,3,4], target = 6
Output: [1,3]
```

Explanation: Positions `1` and `3` contain `2` and `4`, giving `2 + 4 = 6`.

## Example 3

```text
Input: numbers = [-1,0], target = -1
Output: [1,2]
```

Explanation: Positions `1` and `2` contain `-1` and `0`, giving `-1 + 0 = -1`.

## Constraints

- `2 <= numbers.length <= 3 * 10⁴`
- `-1000 <= numbers[i] <= 1000`
- The input values are ordered non-decreasingly.
- `-1000 <= target <= 1000`
- Every test case has exactly one valid pair.