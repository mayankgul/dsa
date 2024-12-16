package strings.RomanToInteger;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Solution solution = new Solution();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the roman numeral: ");
        String roman = scanner.nextLine();

        int value = solution.solve(roman);

        System.out.println("Answer: " + value);
    }
}
