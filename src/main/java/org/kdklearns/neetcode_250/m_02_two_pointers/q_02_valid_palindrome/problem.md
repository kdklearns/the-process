# Valid Palindrome

A string is a **palindrome** when its letters and digits read identically from either end after ignoring letter case and discarding all other characters.

For the input string `s`, return `true` when this condition holds and `false` otherwise.

## Example 1

```text
Input: s = "A man, a plan, a canal: Panama"
Output: true
```

Explanation: Filtering and converting to lowercase produces `amanaplanacanalpanama`, which reads identically in both directions.

## Example 2

```text
Input: s = "race a car"
Output: false
```

Explanation: The normalized string is `raceacar`; its forward and backward readings differ.

## Example 3

```text
Input: s = " "
Output: true
```

Explanation: Ignoring the space leaves an empty string, which satisfies the palindrome condition.

## Constraints

- `1 <= s.length <= 2 * 10⁵`
- Every character in `s` belongs to the printable ASCII character set.