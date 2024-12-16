package strings.MergeStringsAlternately;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        String ans = solution.solve(word1, word2);
        System.out.println("Answer: " + ans);
    }
}
