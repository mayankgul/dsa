package arrays.BestTimeToBuyAndSellStock;

import utils.ArrayInput;

public class Main {
    public static void main (String[] args) {
        int length = 2;

        ArrayInput input = new ArrayInput(length);
        input.getInput(ArrayInput.InputType.INTEGER);

        Solution solution = new Solution(input.intValues);
        solution.secondSolution();

        System.out.println("Answer: " + solution.profit);
    }
}
