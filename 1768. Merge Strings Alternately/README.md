# 1768. Merge Strings Alternately

## Problem
Given two strings `word1` and `word2`, merge them by adding letters in alternating order, starting with `word1`.

If one string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

## Examples
### Example 1
- **Input**
  - `word1 = "abc"`
  - `word2 = "pqr"`
- **Output**
  - `"apbqcr"`

### Example 2
- **Input**
  - `word1 = "ab"`
  - `word2 = "pqrs"`
- **Output**
  - `"apbqrs"`

### Example 3
- **Input**
  - `word1 = "abcd"`
  - `word2 = "pq"`
- **Output**
  - `"apbqcd"`

## Approach
- Use two pointers (indices) `i` and `j` for `word1` and `word2`.
- While either pointer is still in range:
  - If `i` is valid, append `word1.charAt(i)` and increment `i`.
  - If `j` is valid, append `word2.charAt(j)` and increment `j`.
- Build the answer using a `StringBuilder` to keep it efficient.

## Complexity
- **Time:** `O(n + m)` where `n = word1.length()` and `m = word2.length()`
- **Space:** `O(n + m)` for the output (extra working space is `O(1)` besides the builder)

## Solution (Java)
- File: [MergeStringsAlternately.java](cci:7://file:///Users/josegarcia/Documents/dev/leetcode-daily/1768.%20Merge%20Strings%20Alternately/MergeStringsAlternately.java:0:0-0:0)