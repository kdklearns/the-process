# Remove Duplicates from Sorted Array

Modify the sorted integer array `nums` **in place** so that each distinct value appears once, preserving the existing order.

Return `k`, the number of distinct values. The first `k` positions must contain those values in sorted order; positions after them do not matter.

## Custom Judge

The judge performs checks equivalent to:

```java
int[] actual = [...];   // Input
int[] expected = [...]; // Distinct values in sorted order

int count = removeDuplicates(actual);

assert count == expected.length;
for (int index = 0; index < count; index++) {
    assert actual[index] == expected[index];
}
```

Passing every check means the solution is accepted.

## Example 1

```text
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
```

Explanation: Return `2`, placing `1` and `2` first. The underscore marks an irrelevant position.

## Example 2

```text
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
```

Explanation: Return `5`, placing `[0,1,2,3,4]` first. All later positions are irrelevant.

## Constraints

- `1 <= nums.length <= 3 * 10⁴`
- `-100 <= nums[i] <= 100`
- The input values are ordered non-decreasingly.