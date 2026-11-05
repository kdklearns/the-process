---
date: 05-11-2026
author: "Keshav Dutt Kaushik"
work model: "library"
---

# 5<sup>th</sup> November 2026

<img src="view/report.png" width="800">

## [the-process](https://github.com/kdklearns/the-process)

### `Neetcode 250`

- `Arrays & Hashing` &rarr; Worked on four questions
- `Two Pointers` &rarr; Worked on two questions, including two approaches to Valid Palindrome

| S. No. | Problem | Topics | Level | TC | SC | Submissions | Time taken | My Expertise | Status | Spaced Repetition | Note |
|--------|---------|--------|-------|----|----|-------------|------------|--------------|--------|-------------------|------|
| [1](../../../../src/main/java/org/kdklearns/neetcode_250/m_01_arrays_and_hashing/q_19_best_time_to_buy_and_sell_stock_ii/problem.md) | [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/) | `Arrays` `Greedy` | Medium | `O(N)` | `O(1)` | 2 | `00:34:05` | — | — | — | Needs intuition, but once the pattern strikes, easy to implement. |
| [2](../../../../src/main/java/org/kdklearns/neetcode_250/m_01_arrays_and_hashing/q_20_majority_element_ii/problem.md) | [Majority Element II](https://leetcode.com/problems/majority-element-ii/) | `Arrays` `Boyer–Moore Voting` | Medium | `O(N)` | `O(1)` | 1 | `01:12:54` | — | — | — | Very tricky even after knowing Boyer's voting algo. |
| [3](../../../../src/main/java/org/kdklearns/neetcode_250/m_01_arrays_and_hashing/q_21_subarray_sum_equals_k/problem.md) | [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/) | `Arrays` `Prefix Sum` `Hashing` | Medium | `O(N)` | `O(N)` | 2 | `01:12:51` | — | — | — | Learnt a fun new approach using hashing. |
| [4](../../../../src/main/java/org/kdklearns/neetcode_250/m_01_arrays_and_hashing/q_22_first_missing_positive/problem.md) | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | `Arrays` `Cyclic Sort` | Hard | `O(N)` | `O(1)` | 4 | `00:46:59` | — | — | — | So many blunders even after knowing the solution! Cyclic sort. |
| [5](../../../../src/main/java/org/kdklearns/neetcode_250/m_02_two_pointers/q_01_reverse_string/problem.md) | [Reverse String](https://leetcode.com/problems/reverse-string/) | `Strings` `Two Pointers` | Easy | `O(N)` | `O(1)` | 1 | `00:01:05` | — | — | — | Have solved it before. |
| [6](../../../../src/main/java/org/kdklearns/neetcode_250/m_02_two_pointers/q_02_valid_palindrome/problem.md) | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | `Strings` `Two Pointers` | Easy | `O(N)` | A1: `O(N)`<br>A2: `O(1)` | A1: 2<br>A2: 3 | A1: `00:18:08`<br>A2: `00:27:17` | — | — | — | A1: Used extra space; will try constant space next.<br>A2: Checking whether uppercase and lowercase characters match correctly was nice. |

*Times use HH:MM:SS. A1 and A2 refer to the first and second approaches respectively.*

## Commits

(_the-process_)
- `43e5f03` &rarr; two pointers > solved two > Q[1, 2]; 2E 0M 0H & troubleshooted failed testcases
- `2780b27` &rarr; test > arrays & hashing > troubleshooted failed test cases
- `1ceb3f0` &rarr; arrays & hashing > solved four > Q[19, 22]; 0E 3M 1H
- `d693476` &rarr; approach & notes > (M1, Q14) Encode & Decode Strings > unicode delimiter, escaping & chunking strategies
- `f150069` &rarr; (M1,Q14) Encode & Decode Strings > Used the correct escape character '\' for delimiter
- `bd52b60` &rarr; (M1,Q14) Encode & Decode Strings > Reduced T.C. by forming string instead of substring