# Group Anagrams

Given an array of strings `strs`, group the anagrams together into sublists. You may return the groups in **any order**.

Two strings are **anagrams** if they contain the same characters, with each character appearing the same number of times, regardless of order.

## Example 1

```text
Input: strs = ["act","pots","tops","cat","stop","hat"]
Output: [["hat"],["act","cat"],["stop","pots","tops"]]
```

## Example 2

```text
Input: strs = ["x"]
Output: [["x"]]
```

## Example 3

```text
Input: strs = [""]
Output: [[""]]
```

## Constraints

- `1 <= strs.length <= 10000`
- `0 <= strs[i].length <= 100`
- Each `strs[i]` consists of lowercase English letters.