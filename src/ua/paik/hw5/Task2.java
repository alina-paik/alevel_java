package ua.paik.hw5;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] inputArray = {1, 9, 7, 6, 3, 2};

        System.out.println("Input array:");
        printArray(inputArray);

        boolean isDescending = checkDescendingOrder(inputArray);

        System.out.println("Array is ordered in descending order: " + isDescending);
    }
    public static boolean checkDescendingOrder(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);

        return Arrays.equals(array, reverseArray(sortedArray));
    }

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

