# Remove Element

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` from `nums` **in place**. The order of the elements may change.

Let `k` be the number of elements in `nums` that are not equal to `val`. Modify `nums` so that its first `k` elements contain those elements, then return `k`. The contents of `nums` after the first `k` elements do not matter.

## Custom Judge

The judge will test your solution with the following code:

```java
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // Expected values, sorted and with no values equal to val

int k = removeElement(nums, val);

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
```

Your solution is accepted if all assertions pass.

## Example 1

```text
Input: nums = [3,2,2,3], val = 3
Output: k = 2, nums = [2,2,_,_]
```

Explanation: Return `k = 2`. The first two elements of `nums` must be `2`. The underscores represent elements whose values do not matter.

## Example 2

```text
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: k = 5, nums = [0,1,3,0,4,_,_,_]
```

Explanation: Return `k = 5`. The first five elements must contain `0`, `0`, `1`, `3`, and `4` in any order. The underscores represent elements whose values do not matter.

## Constraints

- `0 <= nums.length <= 100`
- `0 <= nums[i] <= 50`
- `0 <= val <= 100`