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
