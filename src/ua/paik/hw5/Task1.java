package ua.paik.hw5;

public class Task1 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 3;
        int[][] originalArray = createArray(rows, columns);

        System.out.println("Input array:");
        printArray(originalArray);

        int[][] modifiedArray = fillWithPositiveAndNegative(originalArray);

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
    public static int[][] fillWithPositiveAndNegative(int[][] array) {
        int rows = array.length;
        int columns = array[0].length;
        int[][] newArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                newArray[i][j] = (i % 2 == 0) ? array[i][j] : -array[i][j];
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
