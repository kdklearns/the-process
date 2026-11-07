# 3Sum

Given an integer array `nums`, return every distinct triplet of values `[nums[i], nums[j], nums[k]]` whose sum is `0`.

The three indices must be different. Include each combination of values only once. The order of the triplets and the order of values within each triplet do not matter.

## Example 1

```text
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
```

Explanation: Indices `(0,1,2)` and `(1,2,4)` both give the same combination `[-1,0,1]`. Indices `(0,3,4)` give the other combination `[-1,-1,2]`.

## Example 2

```text
Input: nums = [0,1,1]
Output: []
```

Explanation: The only selection of three elements adds up to `2`.

## Example 3

```text
Input: nums = [0,0,0]
Output: [[0,0,0]]
```

Explanation: The three zeros come from distinct positions and add up to `0`.

## Constraints

- `3 <= nums.length <= 3000`
- `-10⁵ <= nums[i] <= 10⁵`