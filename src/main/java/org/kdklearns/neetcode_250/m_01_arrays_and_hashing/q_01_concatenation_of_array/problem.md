# Concatenation of Array

Given an integer array `nums` of length `n`, create an array `ans` of length `2n` such that `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for every `0 <= i < n` (0-indexed).

In other words, `ans` is the concatenation of `nums` with itself.

Return `ans`.

## Example 1

```text
Input: nums = [1,4,1,2]
Output: [1,4,1,2,1,4,1,2]
```

## Example 2

```text
Input: nums = [22,21,20,1]
Output: [22,21,20,1,22,21,20,1]
```

## Constraints

- `1 <= nums.length <= 1000`
- `1 <= nums[i] <= 1000`