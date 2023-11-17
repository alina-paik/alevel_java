package ua.paik.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 3;
        int[][] inputArray = createArray(rows, columns);

        System.out.println("Input array:");
        printArray(inputArray);

        int[][] modifiedArray = negateEverySecondRow(inputArray);

        System.out.println("Array after transformation:");
        printArray(modifiedArray);
    }

    public static int[][] createArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        int index = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = index++;
            }
        }

        return array;
    }

    public static int[][] negateEverySecondRow(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] newArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < columns; j++) {
                    newArray[i][j] = -array[i][j];
                }
            } else {
                newArray[i] = Arrays.copyOf(array[i], columns);
            }
        }

        return newArray;
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

