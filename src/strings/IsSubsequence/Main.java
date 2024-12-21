package strings.IsSubsequence;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String t = scanner.nextLine();

        System.out.print("Enter sub string to check: ");
        String s = scanner.nextLine();

        boolean ans = solution.solve(s, t);
        System.out.println("Answer: " + ans);
    }
}
