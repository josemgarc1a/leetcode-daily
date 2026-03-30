# Is Subsequence

Given two strings `s` and `t`, return `true` if `s` is a subsequence of `t`, or `false` otherwise.

## Definition

A **subsequence** of a string is a new string formed from the original string by deleting some (can be none) characters **without disturbing the relative positions** of the remaining characters.

- `"ace"` is a subsequence of `"abcde"`
- `"aec"` is not a subsequence of `"abcde"`

## Examples

### Example 1

```text
Input: s = "abc", t = "ahbgdc"
Output: true
```

### Example 2

```text
Input: s = "axc", t = "ahbgdc"
Output: false
```

## Constraints

- `0 <= s.length <= 100`
- `0 <= t.length <= 10^4`
- `s` and `t` consist only of lowercase English letters.

## Follow-up

Suppose there are lots of incoming strings `s`, say `s1, s2, ..., sk` where `k >= 10^9`, and you want to check one by one whether `t` has each as a subsequence. In this scenario, how would you change your code?