# Container With Most Water

An integer array `height` describes `n` vertical lines. The line at index `i` runs from `(i, 0)` to `(i, height[i])`.

Choose two lines to act as the sides of a container, with the x-axis as its base. Keep the container upright.

Return the largest amount of water that any such container can hold.

## Example 1

![The container with the largest capacity, with water shaded blue](https://s3-lc-upload.s3.amazonaws.com/uploads/2018/07/17/question_11.jpg)

```text
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
```

Explanation: The blue region shows the largest possible capacity: `49` units.

## Example 2

```text
Input: height = [1,1]
Output: 1
```

## Constraints

- `n == height.length`
- `2 <= n <= 10⁵`
- `0 <= height[i] <= 10⁴`