package ua.paik.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] inputArray = {
                {1, 2},
                {3, 4}
        };

        System.out.println("Input array:");
        printArray(inputArray);

        int[][] transformedArray = changingRowsAndColumns(inputArray);

        System.out.println("Array after transformation:");
        printArray(transformedArray);
    }

    public static int[][] changingRowsAndColumns(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;

        int[][] newArray = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[j][i] = array[i][j];
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

