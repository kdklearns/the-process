# Merge Sorted Array

The integer arrays `nums1` and `nums2` contain sorted sequences in non-decreasing order. Their respective counts of meaningful elements are `m` and `n`.

Combine both sequences in sorted order **inside `nums1`**, without returning another array.

`nums1` has `m + n` slots: its first `m` entries are input values, and its final `n` zeroes are unused space. `nums2` contains `n` entries.

## Example 1

```text
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
```

Explanation: Combining `[1,2,3]` with `[2,5,6]` produces `[1,2,2,3,5,6]`.

## Example 2

```text
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
```

Explanation: With no values in `nums2`, the result remains `[1]`.

## Example 3

```text
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
```

Explanation: Because `m = 0`, the zero is only a placeholder. The sole input value is `1`.

## Constraints

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `1 <= m + n <= 200`
- `-10⁹ <= nums1[i], nums2[j] <= 10⁹`

## Follow-up

Can you perform the merge in `O(m + n)` time?