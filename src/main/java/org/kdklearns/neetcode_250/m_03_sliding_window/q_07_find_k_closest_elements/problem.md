# Find K Closest Elements

Given a sorted integer array `arr` and integers `k` and `x`, select the `k` entries nearest to `x`. Return those entries in ascending order.

Compare two values `a` and `b` by their distances from `x`. Prefer `a` if its distance `|a - x|` is smaller than `|b - x|`. If the distances are equal, prefer the smaller value.

## Example 1

```text
Input: arr = [1,2,3,4,5], k = 4, x = 3
Output: [1,2,3,4]
```

## Example 2

```text
Input: arr = [1,1,2,3,4,5], k = 4, x = -1
Output: [1,1,2,3]
```

## Constraints

- `1 <= k <= arr.length`
- `1 <= arr.length <= 10⁴`
- `arr` is sorted in ascending order.
- `-10⁴ <= arr[i], x <= 10⁴`