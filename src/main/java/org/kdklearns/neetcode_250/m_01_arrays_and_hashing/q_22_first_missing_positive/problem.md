# First Missing Positive

Find and return the smallest integer greater than zero that does not occur in the unsorted integer array `nums`.

Use `O(n)` time and `O(1)` auxiliary space.

## Example 1

```text
Input: nums = [1,2,0]
Output: 3
```

Explanation: Both `1` and `2` are present, so the first missing positive integer is `3`.

## Example 2

```text
Input: nums = [3,4,-1,1]
Output: 2
```

Explanation: The array contains `1`, but it does not contain `2`.

## Example 3

```text
Input: nums = [7,8,9,11,12]
Output: 1
```

Explanation: There is no `1` in the array.

## Constraints

- `1 <= nums.length <= 10⁵`
- `-2³¹ <= nums[i] <= 2³¹ - 1`