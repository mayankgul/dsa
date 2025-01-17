// https://leetcode.com/problems/is-subsequence/

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting
// some (can be none) of the characters without disturbing the relative positions of the remaining characters.
// (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

package strings.IsSubsequence;

public class Solution {
    public boolean solve (String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int pointer = 0;

        for (int i = 0; i < t.length(); i++) {
            if (pointer == s.length()) {
                return true;
            }

            if (t.charAt(i) == s.charAt(pointer)) {
                pointer++;
            }
        }

        return pointer == s.length();
    }
}
