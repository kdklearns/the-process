# Rotate Array

Shift the integer array `nums` circularly to the right by `k` positions, where `k >= 0`.

## Example 1

```text
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
```

Explanation: Successive right rotations produce:

```text
After 1 step:  [7,1,2,3,4,5,6]
After 2 steps: [6,7,1,2,3,4,5]
After 3 steps: [5,6,7,1,2,3,4]
```

## Example 2

```text
Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
```

Explanation:

```text
After 1 step:  [99,-1,-100,3]
After 2 steps: [3,99,-1,-100]
```

## Constraints

- `1 <= nums.length <= 10⁵`
- `-2³¹ <= nums[i] <= 2³¹ - 1`
- `0 <= k <= 10⁵`

## Follow-up

- Explore multiple approaches; at least three different solutions exist.
- Can you modify the array in place using `O(1)` additional space?