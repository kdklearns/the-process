# Minimum Size Subarray Sum

Given an array `nums` of positive integers and a positive integer `target`, find the shortest contiguous subarray with a sum of at least `target`.

Return its length, or `0` if no subarray reaches `target`.

## Example 1

```text
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
```

Explanation: `[4,3]` reaches `7`, and no single element does.

## Example 2

```text
Input: target = 4, nums = [1,4,4]
Output: 1
```

## Example 3

```text
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
```

## Constraints

- `1 <= target <= 10⁹`
- `1 <= nums.length <= 10⁵`
- `1 <= nums[i] <= 10⁴`

## Follow-up

After solving it in `O(n)` time, try implementing a different approach that runs in `O(n log n)` time.