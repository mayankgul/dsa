// https://leetcode.com/problems/roman-to-integer/

// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//
// For example, 2 is written as II in Roman numeral, just two ones added together.
// 12 is written as XII, which is simply X + II.
// The number 27 is written as XXVII, which is XX + V + II.
//
// Roman numerals are usually written largest to smallest from left to right.
// However, the numeral for four is not IIII.
// Instead, the number four is written as IV.
// Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX.
// There are six instances where subtraction is used:
//
// I can be placed before V (5) and X (10) to make 4 and 9.
// X can be placed before L (50) and C (100) to make 40 and 90.=
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.

package strings.RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private final Map<String, Integer> basic_symbols;
    private final Map<String, Integer> special_symbols;

    public Solution() {
        this.basic_symbols = new HashMap<>();
        basic_symbols.put("I", 1);
        basic_symbols.put("V", 5);
        basic_symbols.put("X", 10);
        basic_symbols.put("L", 50);
        basic_symbols.put("C", 100);
        basic_symbols.put("D", 500);
        basic_symbols.put("M", 1000);

        this.special_symbols = new HashMap<>();
        special_symbols.put("IV", 4);
        special_symbols.put("IX", 9);
        special_symbols.put("XL", 40);
        special_symbols.put("XC", 90);
        special_symbols.put("CD", 400);
        special_symbols.put("CM", 900);
    }

    public int solve(String roman) {
        Map<String, Integer> occurrences = new HashMap<>();
        int length = roman.length();

        for (int i = 0; i < length; i += 1) {
            if (i == length - 1) {
                occurrences.compute("" + roman.charAt(i), (_, v) -> v == null ? 1 : v + 1);
                continue;
            }

            String combined_symbol = "" + roman.charAt(i) + roman.charAt(i + 1);

            if (special_symbols.containsKey(combined_symbol)) {
                occurrences.compute(combined_symbol, (_, v) -> v == null ? 1 : v + 1);
                i += 1;
            } else {
                occurrences.compute("" + roman.charAt(i), (_, v) -> v == null ? 1 : v + 1);
            }
        }

        int value = 0;

        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            String k = entry.getKey();

            if (k.length() > 1) {
                value += special_symbols.get(k) * entry.getValue();
            } else {
                value += basic_symbols.get(k) * entry.getValue();
            }
        }

        return value;
    }
}