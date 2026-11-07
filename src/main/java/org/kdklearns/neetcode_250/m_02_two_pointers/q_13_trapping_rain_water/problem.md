# Trapping Rain Water

The array `height` describes an elevation map of `n` bars. Each bar is one unit wide and has a nonnegative integer height.

Return the total number of units of rainwater the bars can trap.

## Example 1

![An elevation map with trapped rainwater shaded blue](https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png)

```text
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
```

Explanation: The black bars represent the given heights. The blue regions above them hold `6` units of water in total.

## Example 2

```text
Input: height = [4,2,0,3,2,5]
Output: 9
```

## Constraints

- `n == height.length`
- `1 <= n <= 2 * 10⁴`
- `0 <= height[i] <= 10⁵`