# Longest Substring Without Repeating Characters

Given a string `s`, return the maximum length of a contiguous substring in which every character appears only once.

## Example 1

```text
Input: s = "abcabcbb"
Output: 3
```

Explanation: `"abc"`, `"bca"`, and `"cab"` are all valid substrings of length `3`.

## Example 2

```text
Input: s = "bbbbb"
Output: 1
```

Explanation: A single `"b"` is the longest substring with no repeated character.

## Example 3

```text
Input: s = "pwwkew"
Output: 3
```

Explanation: `"wke"` is a valid substring of length `3`. The characters in `"pwke"` do not occupy consecutive positions, so it is only a subsequence.

## Constraints

- `0 <= s.length <= 10⁵`
- `s` may contain English letters, digits, symbols, and spaces.