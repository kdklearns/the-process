# Merge Strings Alternately

Build a new string from `word1` and `word2` by taking one character from each in turn, beginning with `word1`.

Once either string runs out of characters, append the unused portion of the other string.

Return the resulting string.

## Example 1

```text
Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
```

Explanation: The characters interleave as follows:

```text
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
```

## Example 2

```text
Input: word1 = "ab", word2 = "pqrs"
Output: "apbqrs"
```

Explanation: After interleaving, the remaining `"rs"` from `word2` goes at the end.

```text
word1:  a   b
word2:    p   q   r   s
merged: a p b q   r   s
```

## Example 3

```text
Input: word1 = "abcd", word2 = "pq"
Output: "apbqcd"
```

Explanation: After interleaving, the remaining `"cd"` from `word1` goes at the end.

```text
word1:  a   b   c   d
word2:    p   q
merged: a p b q c   d
```

## Constraints

- `1 <= word1.length, word2.length <= 100`
- Both input strings contain only lowercase English letters.