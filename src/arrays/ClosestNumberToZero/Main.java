package arrays.ClosestNumberToZero;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers (space-separated): ");
        String numsStr = scanner.nextLine();

        String[] numsList = numsStr.split(" ");

        int[] nums = new int[numsList.length];
        for (int i = 0; i < numsList.length; i++) {
            nums[i] = Integer.parseInt(numsList[i]);
        }

        int ans = solution.solve(nums);
        System.out.println("Answer: " + ans);
    }
}
