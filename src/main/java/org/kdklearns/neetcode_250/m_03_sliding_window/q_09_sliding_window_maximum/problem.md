# Sliding Window Maximum

Given an integer array `nums` and a window size `k`, start with the first `k` elements. Move the window one position to the right at a time until it reaches the end of the array.

Return the maximum value from each window, in order from left to right.

## Example 1

```text
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
```

Explanation: The six windows have these maximum values:

| Window | Maximum |
|--------|---------|
| `[1,3,-1]` | `3` |
| `[3,-1,-3]` | `3` |
| `[-1,-3,5]` | `5` |
| `[-3,5,3]` | `5` |
| `[5,3,6]` | `6` |
| `[3,6,7]` | `7` |

## Example 2

```text
Input: nums = [1], k = 1
Output: [1]
```

## Constraints

- `1 <= nums.length <= 10⁵`
- `-10⁴ <= nums[i] <= 10⁴`
- `1 <= k <= nums.length`