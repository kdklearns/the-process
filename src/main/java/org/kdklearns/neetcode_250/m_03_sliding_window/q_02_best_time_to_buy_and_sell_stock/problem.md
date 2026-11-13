# Best Time to Buy and Sell Stock

The array `prices` gives a stock's price for each day. The price on day `i` is `prices[i]`.

You can make at most one transaction: buy one share on one day, then sell it on a later day. Return the largest profit possible, or `0` if no transaction would make a profit.

## Example 1

```text
Input: prices = [7,1,5,3,6,4]
Output: 5
```

Explanation: Buy for `1` on day `2` and sell for `6` on day `5`, earning `6 - 1 = 5`. Selling on day `1` would be invalid because it precedes the purchase.

## Example 2

```text
Input: prices = [7,6,4,3,1]
Output: 0
```

Explanation: Prices fall every day, so skipping the transaction gives the best result: `0`.

## Constraints

- `1 <= prices.length <= 10⁵`
- `0 <= prices[i] <= 10⁴`