# Minimum Window Substring

Given strings `s` and `t`, return the shortest contiguous substring of `s` that contains every character of `t` at least as many times as it appears in `t`.

Return `""` if no window qualifies. Each test case has a unique answer.

## Example 1

```text
Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
```

Explanation: `"BANC"` is the shortest window containing `A`, `B`, and `C`.

## Example 2

```text
Input: s = "a", t = "a"
Output: "a"
```

Explanation: The single character in `s` satisfies the requirement.

## Example 3

```text
Input: s = "a", t = "aa"
Output: ""
```

Explanation: The window needs two copies of `a`, but `s` contains only one.

## Constraints

- `m == s.length`
- `n == t.length`
- `1 <= m, n <= 10⁵`
- Both strings contain only uppercase and lowercase English letters.

## Follow-up

Can you solve the problem in `O(m + n)` time?