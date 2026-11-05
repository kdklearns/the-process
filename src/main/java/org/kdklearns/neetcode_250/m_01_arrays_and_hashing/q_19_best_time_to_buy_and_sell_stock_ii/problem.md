# Best Time to Buy and Sell Stock II

The integer array `prices` records a stock's daily prices: `prices[i]` is its price on day `i`.

You may buy and sell on any day, including multiple transactions on the same day. At no point may you hold more than one share.

Return the largest total profit you can obtain.

## Example 1

```text
Input: prices = [7,1,5,3,6,4]
Output: 7
```

Explanation: From day `2` to day `3`, buying for `1` and selling for `5` earns `4`. From day `4` to day `5`, buying for `3` and selling for `6` earns `3`. Together, these transactions earn `7`.

## Example 2

```text
Input: prices = [1,2,3,4,5]
Output: 4
```

Explanation: The transaction from day `1` to day `5` earns `5 - 1 = 4`.

## Example 3

```text
Input: prices = [7,6,4,3,1]
Output: 0
```

Explanation: Prices only decrease, so making no transactions gives the best profit: `0`.

## Constraints

- `1 <= prices.length <= 3 * 10⁴`
- `0 <= prices[i] <= 10⁴`