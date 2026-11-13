# Contains Duplicate II

Given an integer array `nums` and an integer `k`, check whether two distinct indices `i` and `j` contain the same value and are at most `k` positions apart.

Return `true` if such a pair exists, satisfying `nums[i] == nums[j]` and `abs(i - j) <= k`. Otherwise, return `false`.

## Example 1

```text
Input: nums = [1,2,3,1], k = 3
Output: true
```

## Example 2

```text
Input: nums = [1,0,1,1], k = 1
Output: true
```

## Example 3

```text
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```

## Constraints

- `1 <= nums.length <= 10⁵`
- `-10⁹ <= nums[i] <= 10⁹`
- `0 <= k <= 10⁵`