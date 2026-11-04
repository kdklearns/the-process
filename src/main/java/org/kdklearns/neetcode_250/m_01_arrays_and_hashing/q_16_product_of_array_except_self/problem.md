# Product of Array Except Self

Given an integer array `nums`, construct and return an array `answer`. For each index `i`, `answer[i]` must contain the product of every input element other than the element at index `i`.

Every prefix product and suffix product of `nums` fits within a 32-bit integer.

Your algorithm must run in `O(n)` time without division.

## Example 1

```text
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
```

## Example 2

```text
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
```

## Constraints

- `2 <= nums.length <= 10⁵`
- `-30 <= nums[i] <= 30`
- Every resulting `answer[i]` is guaranteed to fit within a 32-bit integer.

## Follow-up

Can you achieve `O(1)` additional space? Exclude the returned array when measuring additional space.