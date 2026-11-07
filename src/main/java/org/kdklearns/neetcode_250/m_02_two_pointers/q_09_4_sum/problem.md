# 4Sum

Given an integer array `nums` of length `n` and an integer `target`, return every distinct quadruplet of values `[nums[a], nums[b], nums[c], nums[d]]` that meets these conditions:

- `0 <= a, b, c, d < n`
- The four indices are all different.
- `nums[a] + nums[b] + nums[c] + nums[d] == target`

Return the quadruplets in any order.

## Example 1

```text
Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

## Example 2

```text
Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
```

## Constraints

- `1 <= nums.length <= 200`
- `-10⁹ <= nums[i] <= 10⁹`
- `-10⁹ <= target <= 10⁹`