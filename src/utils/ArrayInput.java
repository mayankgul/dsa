package utils;

import java.util.Scanner;

public class ArrayInput {
    public int length;
    public String[] strValues;
    public int[] intValues;
    public boolean[] boolValues;

    private final Scanner scanner = new Scanner(System.in);

    public enum InputType {
        STRING, INTEGER, BOOLEAN;
    }

    public ArrayInput (int length) {
        this.length = length;
        this.strValues = new String[length];
        this.intValues = new int[length];
        this.boolValues = new boolean[length];
    }

    public void getInput (InputType type) {
        System.out.print("Enter elements (space-separated) ");
        String arrayStr = scanner.nextLine();

        String[] array = arrayStr.split(" ");

        switch (type) {
            case STRING:
                this.strValues = array;
                break;
            case INTEGER:
                for (int i = 0; i < this.length; i++) {
                    this.intValues[i] = Integer.parseInt(array[i]);
                }

                break;
            case BOOLEAN:
                for (int i = 0; i < this.length; i++) {
                    this.boolValues[i] = Boolean.parseBoolean(array[i]);
                }

                break;
        }
    }
}
