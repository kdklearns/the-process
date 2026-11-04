# Longest Consecutive Sequence

Given an unsorted integer array `nums`, find the longest sequence of consecutive integer values present in the array. Return the number of values in that sequence.

Your algorithm must run in `O(n)` time.

## Example 1

```text
Input: nums = [100,4,200,1,3,2]
Output: 4
```

Explanation: The values `[1,2,3,4]` form the longest consecutive sequence, containing `4` elements.

## Example 2

```text
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
```

## Example 3

```text
Input: nums = [1,0,1,2]
Output: 3
```

## Constraints

- `0 <= nums.length <= 10⁵`
- `-10⁹ <= nums[i] <= 10⁹`