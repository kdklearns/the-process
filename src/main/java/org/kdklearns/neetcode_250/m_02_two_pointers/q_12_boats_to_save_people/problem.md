# Boats to Save People

Each entry `people[i]` gives the weight of person `i`. Any number of boats is available. A boat can carry one or two people, provided their total weight does not exceed `limit`.

Return the fewest boats needed to carry everyone.

## Example 1

```text
Input: people = [1,2], limit = 3
Output: 1
```

Explanation: Both people fit in one boat because their weights add up to `3`.

## Example 2

```text
Input: people = [3,2,2,1], limit = 3
Output: 3
```

Explanation: Pair weights `1` and `2`. The remaining people, with weights `2` and `3`, each need a separate boat.

## Example 3

```text
Input: people = [3,5,3,4], limit = 5
Output: 4
```

Explanation: Even the two lightest people exceed the limit together, so everyone travels alone.

## Constraints

- `1 <= people.length <= 5 * 10⁴`
- `1 <= people[i] <= limit <= 3 * 10⁴`