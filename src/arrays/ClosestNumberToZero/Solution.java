// https://leetcode.com/problems/find-closest-number-to-zero/

// Given an integer array nums of size n, return the number with the value closest to 0 in nums.
// If there are multiple answers, return the number with the largest value.

package arrays.ClosestNumberToZero;

public class Solution {
    public int solve (int[] nums) {
        int x = nums[0];

        for (int num : nums) {
            if (num == 0) {
                return 0;
            }

            int distance = Math.abs(num);

            if (distance < Math.abs(x)) {
                x = num;
            } else if (distance == Math.abs(x)) {
                if (num > x) {
                    x = num;
                }
            }
        }

        return x;
    }
}
