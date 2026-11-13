# Permutation in String

Given strings `s1` and `s2`, return `true` if any contiguous substring of `s2` contains exactly the same characters as `s1`, with the same frequencies. Otherwise, return `false`.

## Example 1

```text
Input: s1 = "ab", s2 = "eidbaooo"
Output: true
```

Explanation: The substring `"ba"` is a rearrangement of `"ab"`.

## Example 2

```text
Input: s1 = "ab", s2 = "eidboaoo"
Output: false
```

## Constraints

- `1 <= s1.length, s2.length <= 10⁴`
- Both strings contain only lowercase English letters.