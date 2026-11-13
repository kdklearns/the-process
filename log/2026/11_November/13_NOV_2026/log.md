---
date: 13-11-2026
author: "Keshav Dutt Kaushik"
work model: "library"
---

# 13<sup>th</sup> November 2026

<img src="view/report.png" width="800">

## [the-process](https://github.com/kdklearns/the-process)

### `Neetcode 250`

- `Sliding Window` &rarr; Worked on three questions, including three approaches to Minimum Window Substring

**Total recorded solving time:** `05:05:58`

| S. No.                                                                                                                  | Problem                                                                               | Topics                                          | Level  | TC                                                           | SC                                             | Submissions             | Time taken                                         | Spaced Repetition | Note                                                                                                                                                                                                                                                                                                                                                                                  |
|-------------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------|-------------------------------------------------|--------|--------------------------------------------------------------|------------------------------------------------|-------------------------|----------------------------------------------------|-------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [1](../../../../src/main/java/org/kdklearns/neetcode_250/m_03_sliding_window/q_06_minimum_size_subarray_sum/problem.md) | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | `Arrays` `Sliding Window`                       | Medium | `O(N)`                                                       | `O(1)`                                         | 1                       | `01:37:27`                                         | —                 | Came up with the approach, then the pointers had me shitting bricks.                                                                                                                                                                                                                                                                                                                  |
| [2](../../../../src/main/java/org/kdklearns/neetcode_250/m_03_sliding_window/q_07_find_k_closest_elements/problem.md)   | [Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/)     | `Arrays` `Sliding Window`                       | Medium | `O(N + (N − K)K)`                                            | `O(N)`                                         | 2                       | `00:23:51`                                         | —                 | The intuition came without much struggle. Feeling blessed. Next: binary search for the best window start.                                                                                                                                                                                                                                                                             |
| [3](../../../../src/main/java/org/kdklearns/neetcode_250/m_03_sliding_window/q_08_minimum_window_substring/problem.md)  | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)   | `Strings` `Frequency Counting` `Sliding Window` | Hard   | A1: `O(M² + N)`<br>A2: `O(M + N)` expected<br>A3: `O(M + N)` | A1: `O(M)`<br>A2: `O(min(M, K))`<br>A3: `O(1)` | A1: 6<br>A2: 1<br>A3: 1 | A1: `01:37:56`<br>A2: `01:11:16`<br>A3: `00:15:28` | —                 | A1 (arrays + `StringBuilder`): This puppy cost me a few hairs. AI said to use a match counter and save indices. Easy for you to say, AI!<br>A2 (maps + match counter): There go the last few hairs. AI says swap the maps for fixed arrays. The nerve of this toaster.<br>A3 (arrays + match counter): Finally, lmao. Are you happy now, LeetCode? Next up: full Unicode, apparently. |

*Times use `HH:MM:SS` (hours:minutes:seconds). The total counts A1, A2, and A3 separately. TC and SC denote time and auxiliary space complexity; SC excludes the returned result. For Find K Closest Elements, `N` is the array length and `K` is the result size. For Minimum Window Substring, `M` and `N` are the lengths of `s` and `t`, and `K` is the alphabet size (52 for the original problem).*

## Commits

(_the-process_)

- `6942b37` &rarr; sliding window > solved three questions(multiple approaches) : Q[6-8]
- `d7d67dd` &rarr; test > sliding window > troubleshooted failed test cases