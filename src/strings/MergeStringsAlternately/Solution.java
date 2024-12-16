// https://leetcode.com/problems/merge-strings-alternately/

// You are given two strings word1 and word2.
// Merge the strings by adding letters in alternating order, starting with word1.
// If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

package strings.MergeStringsAlternately;

public class Solution {
    public String solve(String word1, String word2) {
        int length = Math.min(word1.length(), word2.length());
        String smaller_word = word1.length() < word2.length() ? "word1" : "word2";
        StringBuilder text = new StringBuilder();

        for (int i = 0; i < length; i++) {
            text.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (smaller_word.equals("word1")) {
            text.append(word2.substring(length));
        } else {
            text.append(word1.substring(length));
        }

        return text.toString();
    }
}